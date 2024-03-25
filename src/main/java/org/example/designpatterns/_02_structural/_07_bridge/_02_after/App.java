package org.example.designpatterns._02_structural._07_bridge._02_after;

import org.example.designpatterns._02_structural._07_bridge._01_before.Champion;

public abstract class App implements Champion {

    public static void main(String[] args) {
        /*
            브릿지 패턴 적용 전
              - 챔피언과 스킨이 분리되어 조합하여 사용할 수 있다.
         */

        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
