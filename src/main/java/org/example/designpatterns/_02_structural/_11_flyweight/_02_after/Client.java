package org.example.designpatterns._02_structural._11_flyweight._02_after;

public class Client {

    public static void main(String[] args) {
        /*
            플라이웨이트 패턴을 사용하여 공통적으로 반복되는 부분을 분리한 후 인스턴스를 만들어 재사용하면,
            반복적으로 인스턴스를 만들 필요가 없어지므로 메모리 관점에서 이점을 얻을 수 있게 된다.
         */
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    }
}
