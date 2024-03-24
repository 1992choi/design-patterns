package org.example.designpatterns._01_creational._02_factory_method._02_after;

public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }

}
