package com.spring.playground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PlaygroundApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Autowired  UserDao userDao;

    @BeforeEach()
    public void setUp() {
        System.out.println(context);
        System.out.println(this.userDao);
        System.out.println(this.context.getBean("userDao", UserDao.class));
        // this.userDao = this.context.getBean("userDao", UserDao.class);
    }


    @Test
    void contextLoads() {
        assertThat(context).isNotNull();
        System.out.println("등록된 빈의 개수: " + context.getBeanDefinitionNames().length);
        /* for (String bean: context.getBeanDefinitionNames()) {
            System.out.println(bean);
        }

         */
        System.out.println(context);
    }

    @Test
    void checkUserDaoRegistered() {
        System.out.println(context.getBean(UserDao.class));
        System.out.println(context);
    }

    @Test
    void isContextEqual() {
        System.out.println(context);
    }


}
