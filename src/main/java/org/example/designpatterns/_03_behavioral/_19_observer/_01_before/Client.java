package org.example.designpatterns._03_behavioral._19_observer._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            옵저버 패턴 적용 전
              - 관심있는 주제의 채팅 내용을 보고 싶다면, 'getMessage("디자인패턴")' 과 같이 직접 getter를 호출해서 채팅 내용을 봐야한다.
              - 옵저버 패턴을 적용한다면, 관심있다고 등록한 주제에 새로은 글이 등록될 경우 알아서 채팅 내용을 가지고 올 수 있게된다.
         */
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("디자인패턴", "이번엔 옵저버 패턴입니다.");
        user1.sendMessage("롤드컵2021", "LCK 화이팅!");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("디자인패턴"));

        user1.sendMessage("디자인패턴", "예제 코드 보는 중..");
        System.out.println(user2.getMessage("디자인패턴"));
    }

}
