package org.example.designpatterns._01_creational._03_abstract_factory._02_after;

import org.example.designpatterns._01_creational._02_factory_method._02_after.Ship;
import org.example.designpatterns._01_creational._02_factory_method._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        /*
            추상 팩토리 패턴 적용 후
              - 구체적인 클래스에 의존적이지 않게 된다.
              - WhiteshipFactory에 인자값(= new WhiteshipPartsFactory() / new WhitePartsProFactory())에 따라 일반모델 또는 프로모델이 만들어지며,
                이후 제품을 만드는 로직은 변경에 닫혀있게 된다.(=모델이 추가되어도 변경될 일이 없게된다.)
         */
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass()); // WhiteAnchor
        System.out.println(ship.getWheel().getClass()); // WhiteWheel

        ShipFactory shipFactory2 = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass()); // WhiteAnchorPro
        System.out.println(ship2.getWheel().getClass()); // WhiteWheelPro
    }
}
