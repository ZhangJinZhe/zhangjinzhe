/**
 * Project Name:easybuy
 * File Name:FrontServiceImpl.java
 * Package Name:cn.java.service.impl
 * Date:2017年7月28日下午3:57:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service.impl;

import java.util.List;
import java.util.Map;

import cn.java.dao.FrontDao;
import cn.java.dao.impl.FrontDaoImpl;
import cn.java.service.FrontService;

/**
 * Description: <br/>
 * Date: 2017年7月28日 下午3:57:14 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public class FrontServiceImpl implements FrontService {
    private FrontDao fd = new FrontDaoImpl();

    public List<Map<String, Object>> selectForm(int parent, int flag) throws Exception {

        return fd.selectForm(parent, flag);
    }

    public List<Map<String, Object>> secondForm(int parent, int flag) throws Exception {

        return fd.secondForm(parent, flag);
    }

    public List<Map<String, Object>> thirdForm(int parent, int flag) throws Exception {

        return fd.thirdForm(parent, flag);
    }

}
