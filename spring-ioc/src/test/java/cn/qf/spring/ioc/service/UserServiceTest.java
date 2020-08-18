package cn.qf.spring.ioc.service;

import cn.qf.spring.ioc.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xxf
 * @date 2020/8/18
 **/
public class UserServiceTest {
    @Test
    public void testSayHi() {
        //初始化spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring" +
                "-context.xml");
        //从容器里获取UserService实现类对象
        UserService userService=(UserService)classPathXmlApplicationContext.getBean("userService");
        userService.sayHi();

    }
}
