package com.niu.spring.context;

import com.niu.spring.beans.User;
import com.niu.spring.business.BusinessService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.niu.spring")
class SpringContext {
}

public class LaunchJavaContext {
    private static final User DUMMY_USER = new User("dummy");
    public static Logger logger = Logger.getLogger(String.valueOf(LaunchJavaContext.class));

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);

        BusinessService service = context.getBean(BusinessService.class);
        logger.debug("result is : " + service.calculateSum(DUMMY_USER));
    }
}
