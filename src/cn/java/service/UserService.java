/**
 * Project Name:easybuy2
 * File Name:UserService.java
 * Package Name:cn.java.service.impl
 * Date:2017年7月22日下午6:50:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.service;


/**
 * Description: <br/>
 * Date: 2017年7月22日 下午6:50:40 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public interface UserService {

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.UserService#isUserExists(java.lang.String)
     */
    public abstract boolean isUserExists(String username) throws Exception;

    public abstract boolean isEmailExists(String email) throws Exception;

    public abstract boolean isPhoneExists(String Phone) throws Exception;

    public abstract boolean Regist(String username, String password, String email, String phone) throws Exception;

    public abstract String password(String username) throws Exception;

}
