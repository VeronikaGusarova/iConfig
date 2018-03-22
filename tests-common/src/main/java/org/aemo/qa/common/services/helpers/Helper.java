package org.aemo.qa.common.services.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
    public static Boolean convertParameterToBoolean(String parameter) {
        Boolean isTrue = false;
        if (!parameter.matches("^([Ee]nabled|[Dd]isabled|[iI]n|[nN]ot [iI]n)"))
            throw new UnsupportedOperationException("Status '" + parameter + "' has not been implemented");
        if (parameter.toLowerCase().matches("(enabled)|(in)"))
            isTrue = true;

        return isTrue;
    }

    public static String generateId()
    {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        return ft.format(dNow);
    }
}
