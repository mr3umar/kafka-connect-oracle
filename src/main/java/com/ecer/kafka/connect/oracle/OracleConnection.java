package com.ecer.kafka.connect.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *  
 * @author Erdem Cer (erdemcer@gmail.com)
 */

public class OracleConnection{    
    
    public Connection connect(OracleSourceConnectorConfig config) throws SQLException{
        Properties props = new Properties();
        props.setProperty("user", config.getDbUser());
        props.setProperty("password", config.getDbUserPassword());
        // props.setProperty("oracle.net.CONNECT_TIMEOUT", "300000");
        // props.setProperty("oracle.net.READ_TIMEOUT", "300000");
        // props.setProperty("oracle.jdbc.ReadTimeout", "300000");
        props.setProperty("oracle.net.keepAlive", "true");

        return DriverManager.getConnection(
            "jdbc:oracle:thin:@"+config.getDbHostName()+":"+config.getDbPort()+"/"+config.getDbName(),
            props);
    }
}