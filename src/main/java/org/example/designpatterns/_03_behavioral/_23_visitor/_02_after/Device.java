package org.example.designpatterns._03_behavioral._23_visitor._02_after;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
