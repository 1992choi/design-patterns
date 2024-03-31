package org.example.designpatterns._03_behavioral._13_chain_of_responsibilities._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            책임 연쇄 패턴 적용 전
              - 기능이 추가될 때마다 핸들러가 추가되어야한다.
              - 로깅도 하고 인증도 해야한다면, 두 개 기능이 있는 핸들러가 또 다시 추가되어야한다.
              - 클라이언트가 사용해야 하는 핸들러를 직접 알아야한다.
         */
        Request request = new Request("무궁화 꽃이 피었습니다.");
        // RequestHandler requestHandler = new RequestHandler();
        // RequestHandler requestHandler = new LoggingRequestHandler();
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);
    }

}
