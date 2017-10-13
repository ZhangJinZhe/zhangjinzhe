/**
 * Project Name:easybuy2
 * File Name:JsonTest.java
 * Package Name:cn.java.Json
 * Date:2017年7月22日下午3:57:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.Json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 2017年7月22日 下午3:57:46 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public class JsonTest {
    @Test
    public void mapJson() {
        Map<String, Object> ma = new HashMap<String, Object>();
        ma.put("username", "admin");
        ma.put("password", "123456");
        ma.put("gender", "男");
        JSONObject jsonObject = new JSONObject(ma);
        System.out.println(jsonObject.toString());

    }
}
