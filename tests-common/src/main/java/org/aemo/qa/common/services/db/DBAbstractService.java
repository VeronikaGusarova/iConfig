/*
 */
package org.aemo.qa.common.services.db;

import org.aemo.qa.common.services.attachments.Attachments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class DBAbstractService {
    private static final String LOG_START_SQL = "Start_SQL SQL_Query: {}";
    private static final String LOG_END_SQL = "End_SQL SQL_Execution_Time(ms):; {}; SQL_Query:; {};";
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Attachments attachments;

    @Autowired
    @Qualifier("namedParameterJdbcTemplate")
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * This method extract information for some SQL Query.<br/>
     * <b>Example:</b><br/>
     * Map<String, Object></String,> params = new HashMap<>();<br/>
     * params.put("id", id);<br/>
     * "id" - is parameter in SQL query
     * <br/><br/>
     *
     * @param query  SQL query
     * @param params map of params
     */
    protected List<String> extractQuery(String query, Map<String, Object> params) {
        long startTime = System.currentTimeMillis();
        String sqlQuery = getSQLQuery(query, params);
        attachments.attachPageText("SQL Query", sqlQuery);
        String sqlQueryForLog = sqlQuery.replaceAll("\\n", " ");
        log.info(LOG_START_SQL, sqlQuery);

        List<String> extracted = namedParameterJdbcTemplate.queryForList(query, params, String.class);

        String finalExecutionTime = valueOf(System.currentTimeMillis() - startTime);
        log.info(LOG_END_SQL, finalExecutionTime, sqlQueryForLog);
        attachments.attachPageText("Results of SQL query", extracted.toString());
        return extracted;
    }

    /**
     * This method extract information for some SQL Query.<br/>
     *
     * @param query  - SQl query
     * @param params - maps of params
     *
     * @return - List<Map<String, Object>>
     */
    protected List<Map<String, Object>> extractQueryForList(String query, Map<String, Object> params) {
        long startTime = System.currentTimeMillis();
        String sqlQuery = getSQLQuery(query, params);
        attachments.attachPageText("SQL Query", sqlQuery);
        String sqlQueryForLog = sqlQuery.replaceAll("\\n", " ");
        log.info(LOG_START_SQL, sqlQuery);
        List<Map<String, Object>> extracted = namedParameterJdbcTemplate.queryForList(query, params);
        String finalExecutionTime = valueOf(System.currentTimeMillis() - startTime);
        log.info(LOG_END_SQL, finalExecutionTime, sqlQueryForLog);
        attachments.attachPageText("Results of SQL query", extracted.toString());
        return extracted;
    }

    /**
     * Return final SQL query.
     *
     * @param query
     * @param params
     *
     * @return
     */
    private String getSQLQuery(String query, Map<String, Object> params) {
        String sqlQuery = query;
        if (params.isEmpty()) {
            return sqlQuery;
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            sqlQuery = sqlQuery.replace(":" + entry.getKey(), valueOf(entry.getValue()));
        }
        return sqlQuery;
    }
}
