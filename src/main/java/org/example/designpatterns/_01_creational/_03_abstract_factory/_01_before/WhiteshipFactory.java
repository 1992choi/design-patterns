package org.example.designpatterns._01_creational._03_abstract_factory._01_before;

import org.example.designpatterns._01_creational._02_factory_method._02_after.DefaultShipFactory;
import org.example.designpatterns._01_creational._02_factory_method._02_after.Ship;
import org.example.designpatterns._01_creational._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor()); // 추상 팩토리 패턴 적용 전 - 구체적인 클래스에 의존적이다.
        ship.setWheel(new WhiteWheel()); // 추상 팩토리 패턴 적용 전 - 구체적인 클래스에 의존적이다.
        return ship;
    }
}
