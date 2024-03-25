package org.example.designpatterns._02_structural._07_bridge._01_before;

public class App {

    public static void main(String[] args) {
        /*
            브릿지 패턴 적용 전
              - 특정 스킨을 가지고 있는 챔피언을 만들어야한다.
         */
        Champion kda아리 = new KDA아리();
        kda아리.skillQ();
        kda아리.skillR();
    }
}
