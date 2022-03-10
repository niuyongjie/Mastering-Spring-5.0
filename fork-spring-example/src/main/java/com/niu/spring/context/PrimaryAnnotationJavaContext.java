package com.niu.spring.context;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


interface SortingAlogrithm {

}

@Component
@Qualifier("mergesort")
class MergeSort implements SortingAlogrithm {
    //class code here
}

@Component
@Primary
class QuickSort implements SortingAlogrithm {
    // class code here
}

@Component
class SomeService {
    @Autowired
    @Qualifier("mergesort")
    SortingAlogrithm alogrithm;
}

@Configuration
@ComponentScan(basePackages = "com.niu.spring")
class PrimaryAnnotationSpringContext {

}

public class PrimaryAnnotationJavaContext {
    public static Logger logger = Logger.getLogger(String.valueOf(PrimaryAnnotationJavaContext.class));

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryAnnotationSpringContext.class);
        SortingAlogrithm alogrithm = context.getBean(SortingAlogrithm.class);
        logger.debug(alogrithm);

        SomeService service = context.getBean(SomeService.class);
        logger.debug(service.alogrithm);
    }
}