package org.example.designpatterns._01_creational._02_factory_method._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {

    public static void main(String[] args) {
        /*
            스프링에서 팩토리 메소드 패턴이 사용되는 예시
              - 구현 클래스에 따라서 설정 정보를 자바에서 가져올 수도 있고 xml파일에서 가져올 수도 있다.
         */

        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello); // hello xml

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi); // hello bean
    }
}
