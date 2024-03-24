package org.example.designpatterns._01_creational._03_abstract_factory._03_java;

import org.example.designpatterns._01_creational._02_factory_method._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        // 빈에는 ShipFactory로 등록을 했지만, 내부 매커니즘이 Ship을 인스턴스로 등록해주기 때문에 Ship을 가져와서 사용할 수 있다. (추상 팩토리 패턴이 적용되었기에 가능한 사례)

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
        System.out.println(whiteship.getName()); // Ship{name='whiteship', color='white', logo='🛥️'}

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext2.getBean(Ship.class);
        System.out.println(bean); // Ship{name='whiteship', color='white', logo='🛥️'}
    }

}
