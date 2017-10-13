/**
 * Project Name:easybuy
 * File Name:NewsDao.java
 * Package Name:cn.java.dao
 * Date:2017年7月29日下午5:22:25
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.dao;

import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 * Date: 2017年7月29日 下午5:22:25 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public interface NewsDao {
    public abstract List<Map<String, Object>> selectNews() throws Exception;
}
