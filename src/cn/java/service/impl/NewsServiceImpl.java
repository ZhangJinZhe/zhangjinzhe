/**
 * Project Name:easybuy
 * File Name:NewsServiceImpl.java
 * Package Name:cn.java.service.impl
 * Date:2017年7月29日下午5:27:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service.impl;

import java.util.List;
import java.util.Map;

import cn.java.dao.NewsDao;
import cn.java.dao.impl.NewsDaoImpl;
import cn.java.service.NewsService;

/**
 * Description: <br/>
 * Date: 2017年7月29日 下午5:27:43 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public class NewsServiceImpl implements NewsService {
    private NewsDao nd = new NewsDaoImpl();

    public List<Map<String, Object>> selectNews() throws Exception {

        return nd.selectNews();
    }

}
