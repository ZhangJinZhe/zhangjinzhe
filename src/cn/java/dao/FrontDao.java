/**
 * Project Name:easybuy
 * File Name:FrontDao.java
 * Package Name:cn.java.dao
 * Date:2017年7月28日下午3:32:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.dao;

import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 * Date: 2017年7月28日 下午3:32:42 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public interface FrontDao {

    public abstract List<Map<String, Object>> selectForm(int parent, int flag) throws Exception;

    public abstract List<Map<String, Object>> secondForm(int parent, int flag) throws Exception;

    public abstract List<Map<String, Object>> thirdForm(int parent, int flag) throws Exception;
}
