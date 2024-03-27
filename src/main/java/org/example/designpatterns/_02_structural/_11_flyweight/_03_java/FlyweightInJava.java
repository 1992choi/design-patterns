package org.example.designpatterns._02_structural._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        /*
            자주 사용되는 값을 캐싱한다는 측면에서 플라이웨이트 패턴과 유사하다고 볼 수 있음.
            Integer.valueOf()는 -128 ~ 127 범위의 값을 자주 사용되는 값으로 정의하고 캐싱하고 있기 때문에
            아래와 같이 객체 비교 시 경우에 따라 true가 나올 수 있다.
         */
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2); // true

        Integer i3 = Integer.valueOf(1000000);
        Integer i4 = Integer.valueOf(1000000);
        System.out.println(i3 == i4); // false
    }
}
