/**
 * Project Name:dt41_easybuy
 * File Name:UserDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2017年7月22日下午5:03:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.dao.impl;

import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;

import cn.java.dao.UserDao;
import cn.java.utils.JdbcUtils;

/**
 * Description: <br/>
 * Date: 2017年7月22日 下午5:03:32 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class UserDaoImpl implements UserDao {
    private QueryRunner qr = new QueryRunner();

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.dao.impl.UserDao#isUserExists(java.lang.String)
     */
    @Override
    public int isUserExists(String username) throws Exception {
        Map<String, Object> mp = qr.query(JdbcUtils.getConnection(),
                "SELECT COUNT(*) AS num FROM `front_users` WHERE username='" + username + "'", new MapHandler());
        return Integer.parseInt(mp.get("num") + "");
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.dao.impl.UserDao#isEmailExists(java.lang.String)
     */
    @Override
    public int isEmailExists(String email) throws Exception {
        Map<String, Object> mp = qr.query(JdbcUtils.getConnection(),
                "SELECT COUNT(*) AS num1 FROM `front_users` WHERE email='" + email + "'", new MapHandler());
        return Integer.parseInt(mp.get("num1") + "");
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.dao.impl.UserDao#isPhoneExists(java.lang.String)
     */
    @Override
    public int isPhoneExists(String phone) throws Exception {
        Map<String, Object> mp = qr.query(JdbcUtils.getConnection(),
                "SELECT COUNT(*) AS num1 FROM `front_users` WHERE phone='" + phone + "'", new MapHandler());
        return Integer.parseInt(mp.get("num1") + "");
    }

    @Override
    public int Regist(String username, String password, String email, String phone) throws Exception {

        return qr.update(JdbcUtils.getConnection(), "INSERT INTO `front_users` SET username='" + username
                + "',`password`='" + password + "',email='" + email + "',phone='" + phone + "'");

    }

    public String password(String username) throws SQLException {
        Map<String, Object> mp = qr.query(JdbcUtils.getConnection(),
                "SELECT `password` FROM `front_users` WHERE username='" + username + "'", new MapHandler());
        String s = (String) mp.get("password");
        return s;
    }

}
