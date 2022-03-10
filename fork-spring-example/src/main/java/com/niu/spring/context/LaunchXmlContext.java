package com.niu.spring.context;

import com.niu.spring.beans.User;
import com.niu.spring.business.BusinessService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchXmlContext {
    private static final User DUMMY_USER = new User("dummy");

    public static Logger logger = Logger.getLogger(LaunchXmlContext.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BusinessApplicationContext.xml");

        BusinessService service = context.getBean(BusinessService.class);
        logger.debug(service.calculateSum(DUMMY_USER));
    }

}
