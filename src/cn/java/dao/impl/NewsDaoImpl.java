/**
 * Project Name:easybuy
 * File Name:NewsDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2017年7月29日下午5:23:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.java.dao.NewsDao;
import cn.java.utils.JdbcUtils;

/**
 * Description: <br/>
 * Date: 2017年7月29日 下午5:23:55 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public class NewsDaoImpl implements NewsDao {
    private QueryRunner qr = new QueryRunner();

    @Override
    public List<Map<String, Object>> selectNews() throws Exception {

        return qr.query(JdbcUtils.getConnection(), "SELECT * FROM `front_news`", new MapListHandler());
    }

}
