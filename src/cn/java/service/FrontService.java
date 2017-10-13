/**
 * Project Name:easybuy
 * File Name:FrontService.java
 * Package Name:cn.java.service
 * Date:2017年7月28日下午3:56:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service;

import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 * Date: 2017年7月28日 下午3:56:31 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public interface FrontService {
    public abstract List<Map<String, Object>> selectForm(int parent, int flag) throws Exception;

    public abstract List<Map<String, Object>> secondForm(int parent, int flag) throws Exception;

    public abstract List<Map<String, Object>> thirdForm(int parent, int flag) throws Exception;
}
