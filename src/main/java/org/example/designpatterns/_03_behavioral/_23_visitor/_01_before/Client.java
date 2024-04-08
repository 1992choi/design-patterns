package org.example.designpatterns._03_behavioral._23_visitor._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            비지터 패턴 적용 전
              - 모양이 클래스마다 디바이스를 판단하는 조건문이 중복된다.
              - 디바이스가 추가된다면 모든 모양 클래스가 변경되야 한다.
              - 기존 코드를 수정하지 않고 새로운 기능을 추가하기 위해서 비지터 패턴을 사용할 수 있다.
         */
        Shape rectangle = new Rectangle();
        Device device = new Phone();
        rectangle.printTo(device);
    }

}
