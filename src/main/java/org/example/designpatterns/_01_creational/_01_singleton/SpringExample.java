package org.example.designpatterns._01_creational._01_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        /*
            스프링의 ApplicationContext에서 꺼내온 빈은 같은 인스턴스를 보장한다.
            엄밀히 따지면 싱글톤 패턴은 아니지만 유일한 인스턴스를 반환한다는 점에서 유사하다.
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }

}
