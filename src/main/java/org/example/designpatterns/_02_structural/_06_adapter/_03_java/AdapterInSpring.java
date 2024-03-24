package org.example.designpatterns._02_structural._06_adapter._03_java;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

    public static void main(String[] args) {
        // Case 1.
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

        // Case 2.
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();

        // Case 3. Spring Security
    }
}
