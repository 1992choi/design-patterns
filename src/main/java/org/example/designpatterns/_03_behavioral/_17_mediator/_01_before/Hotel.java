package org.example.designpatterns._03_behavioral._17_mediator._01_before;

public class Hotel {

    public static void main(String[] args) {
        /*
            중재자 패턴 적용 전
              - 애플리케이션을 동작해보면 서로 기능들이 얽혀있는 것을 볼 수 있다.
              - 만약 코드가 변경되야 한다면, 관련 있는 클래스들은 영향을 받을 수 밖에 없는 구조이다.
         */
        Guest guest = new Guest();
        guest.getTower(3);
        guest.dinner();

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }

}
