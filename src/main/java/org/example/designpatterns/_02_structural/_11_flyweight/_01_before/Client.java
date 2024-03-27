package org.example.designpatterns._02_structural._11_flyweight._01_before;

public class Client {

    public static void main(String[] args) {
        /*
           플라이웨이트 패턴 적용 전
             - 많은 인스턴스를 만들다보면 메모리 사용이 많아져 장애가 발생할 수도 있다.
               그렇기 때문에 공통된 부분을 분리해서 재사용하도록 처리하면 이러한 문제를 해결할 수 있다.
         */
        Character c1 = new Character('h', "white", "Nanum", 12);
        Character c2 = new Character('e', "white", "Nanum", 12);
        Character c3 = new Character('l', "white", "Nanum", 12);
        Character c4 = new Character('l', "white", "Nanum", 12);
        Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
