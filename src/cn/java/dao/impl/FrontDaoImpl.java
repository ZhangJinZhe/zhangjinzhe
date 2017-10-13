/**
 * Project Name:easybuy
 * File Name:FrontDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2017年7月28日下午3:33:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.java.dao.FrontDao;
import cn.java.utils.JdbcUtils;

/**
 * Description: <br/>
 * Date: 2017年7月28日 下午3:33:37 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public class FrontDaoImpl implements FrontDao {
    private QueryRunner qr = new QueryRunner();

    /**
     * 
     * TODO 一级菜单
     * 
     * @see cn.java.dao.FrontDao#selectForm(int, int)
     */
    public List<Map<String, Object>> selectForm(int parent, int flag) throws Exception {

        return qr.query(JdbcUtils.getConnection(), "SELECT * FROM `front_nav` WHERE parent=" + parent + " AND flag="
                + flag + "", new MapListHandler());
    }

    /**
     * TODO 二级菜单
     */
    public List<Map<String, Object>> secondForm(int parent, int flag) throws Exception {

        return qr.query(JdbcUtils.getConnection(), "SELECT * FROM `front_nav` WHERE parent=" + parent + " AND flag="
                + flag + "", new MapListHandler());
    }

    /**
     * 三级菜单
     */
    public List<Map<String, Object>> thirdForm(int parent, int flag) throws Exception {

        return qr.query(JdbcUtils.getConnection(), "SELECT * FROM `front_nav` WHERE parent=" + parent + " AND flag="
                + flag + "", new MapListHandler());
    }
}
