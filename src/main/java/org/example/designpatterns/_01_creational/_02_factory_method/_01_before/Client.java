package org.example.designpatterns._01_creational._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            배의 종류가 늘어날수록 기존 코드를 고쳐야하는데, 이는 '개방 폐쇄의 원칙(OCP)'을 위배하게 된다. (* 변경에 닫혀있지 않음)
         */
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
