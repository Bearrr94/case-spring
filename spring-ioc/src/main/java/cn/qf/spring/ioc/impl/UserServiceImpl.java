package cn.qf.spring.ioc.impl;

import cn.qf.spring.ioc.UserService;

/**
 * @author xxf
 * @date 2020/8/18
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void sayHi() {
        System.out.println("hello world");
    }
}
