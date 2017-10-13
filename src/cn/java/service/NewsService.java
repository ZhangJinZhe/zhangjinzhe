/**
 * Project Name:easybuy
 * File Name:NewsService.java
 * Package Name:cn.java.service
 * Date:2017年7月29日下午5:26:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service;

import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 * Date: 2017年7月29日 下午5:26:26 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public interface NewsService {
    public abstract List<Map<String, Object>> selectNews() throws Exception;
}
