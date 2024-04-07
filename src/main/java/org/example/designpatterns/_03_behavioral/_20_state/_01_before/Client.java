package org.example.designpatterns._03_behavioral._20_state._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            상태 패턴 적용 전
              - 특정 상태마다 동작이 달라질 때 적용하기 좋은 패턴이다.
                그렇지 않을 경우, 현재의 코드처럼 분기처리가 많아 가독성이 좋지 못하게 된다.
              - 특정 상태가 추가되면 이전 상태에 영향을 줄 수도 있다.
         */
        Student student = new Student("whiteship");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student keesun = new Student("keesun");
        keesun.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(keesun);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }

}
