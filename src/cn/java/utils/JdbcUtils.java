/**
 * Project Name:dt41_mysql5
 * File Name:JdbcUtils.java
 * Package Name:cn.java.utils
 * Date:2017年6月29日上午9:14:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Description: <br/>
 * Date: 2017年6月29日 上午9:14:09 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class JdbcUtils {
    private static String driver = null;

    private static String url = null;

    private static String username = null;

    private static String password = null;

    static {
        try {
            Properties props = new Properties();
            InputStream ins = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(ins);

            driver = props.getProperty("driver");
            url = props.getProperty("url");
            username = props.getProperty("username");
            password = props.getProperty("password");

            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * Description: 获取数据库连接<br/>
     *
     * @author dingP
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    /**
     * 
     * Description: 关闭资源<br/>
     *
     * @author dingP
     * @param rs
     * @param st
     * @param conn
     */
    public static void close(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null)
                rs.close();
            if (st != null)
                st.close();
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
