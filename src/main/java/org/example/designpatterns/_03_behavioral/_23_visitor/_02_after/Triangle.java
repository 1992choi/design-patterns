package org.example.designpatterns._03_behavioral._23_visitor._02_after;

public class Triangle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
