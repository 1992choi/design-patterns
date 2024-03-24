package org.example.designpatterns._01_creational._04_builder._01_before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        /*
            빌더 패턴 적용 전
              - 짧은 여행과 긴 여행을 봤을 때, 사용되는 파라미터가 제 각각이라 일관된 프로세스가 없는 것처럼 보인다.
              - 일관된 프로세스로 정의하기 위하여 생성자를 활용한다면, 경우의 수에 따라 생성자가 많아진다는 단점이 있다.
         */

        // 짧은 여행
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));

        // 긴 여행
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
    }
}
