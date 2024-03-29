package org.example.designpatterns._03_behavioral._21_strategy._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            전략 패턴 적용 전
              - 파라미터에 따라서 로직이 분기되고 있다.
                만약 새로운 기능이 추가된다면, 또다른 분기 로직이 추가되야만 할 것이다.
                하지만 전략 패턴을 도입하면 코드 변경없이 기능을 추가할 수 있다.
         */
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(3);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
