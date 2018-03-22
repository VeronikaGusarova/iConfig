/*
 */
package org.aemo.qa.common.configuration;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DatabaseConfig {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${aemo.iconfig.db.server.name}")
    private String serverName;

    @Value("${aemo.iconfig.db.port}")
    private String serverPort;

    @Value("${aemo.iconfig.db.service.name}")
    private String serviceName;

    @Value("${aemo.iconfig.db.username}")
    private String username;

    @Value("${aemo.iconfig.db.password}")
    private String password;

//    @Bean(name = "namedParameterJdbcTemplate")
//    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
//        return new NamedParameterJdbcTemplate(createTestDataSource());
//    }

//    @Bean
//    @Qualifier("mySqlDataSource")
//    public DataSource createTestDataSource() {
//        MysqlDataSource mysqlDataSource;
//        mysqlDataSource = new MysqlDataSource();
//        mysqlDataSource.setServerName(serverName);
//        mysqlDataSource.setPortNumber(Integer.valueOf(serverPort));
//        mysqlDataSource.setUser(username);
//        mysqlDataSource.setPassword(password);
//        return mysqlDataSource;
//    }
}
