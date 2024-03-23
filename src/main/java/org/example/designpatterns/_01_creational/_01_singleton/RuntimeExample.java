package org.example.designpatterns._01_creational._01_singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        /*
            자바에서 사용되는 Runtime 클래스는 싱글톤 패턴을 사용하는 클래스이다.
         */
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
