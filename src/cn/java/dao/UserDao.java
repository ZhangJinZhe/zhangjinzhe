/**
 * Project Name:easybuy2
 * File Name:UserDao.java
 * Package Name:cn.java.dao.impl
 * Date:2017年7月22日下午6:49:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.dao;


/**
 * Description: <br/>
 * Date: 2017年7月22日 下午6:49:02 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public interface UserDao {

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.dao.impl.UserDao#isUserExists(java.lang.String)
     */
    public abstract int isUserExists(String username) throws Exception;

    public abstract int isEmailExists(String email) throws Exception;

    public abstract int isPhoneExists(String phone) throws Exception;

    public abstract int Regist(String username, String password, String email, String phone) throws Exception;

    public abstract String password(String username) throws Exception;

}
