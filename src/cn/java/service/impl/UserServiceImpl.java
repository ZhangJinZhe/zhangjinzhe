/**
 * Project Name:dt41_easybuy
 * File Name:UserDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2017年7月22日下午5:03:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service.impl;

import cn.java.dao.UserDao;
import cn.java.dao.impl.UserDaoImpl;
import cn.java.service.UserService;

/**
 * Description: <br/>
 * Date: 2017年7月22日 下午5:03:32 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class UserServiceImpl implements UserService {
    private UserDao ud = new UserDaoImpl();

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.UserService#isUserExists(java.lang.String)
     */
    @Override
    public boolean isUserExists(String username) throws Exception {
        int num = ud.isUserExists(username);
        if (num >= 1) {
            return true;
        }
        return false;
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.UserService#isEmailExists(java.lang.String)
     */
    @Override
    public boolean isEmailExists(String email) throws Exception {
        int num1 = ud.isEmailExists(email);
        if (num1 >= 1) {
            return true;
        }
        return false;
    }

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.UserService#isPhoneExists(java.lang.String)
     */
    @Override
    public boolean isPhoneExists(String Phone) throws Exception {
        int num1 = ud.isPhoneExists(Phone);
        if (num1 >= 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean Regist(String username, String password, String email, String phone) throws Exception {

        int result = ud.Regist(username, password, email, phone);
        if (result >= 1) {
            return true;
        }
        return false;
    }

    public String password(String username) throws Exception {

        return ud.password(username);
    }

}
