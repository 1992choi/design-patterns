package org.example.designpatterns._03_behavioral._14_command._01_before;

public class MyApp {

    /*
        커맨드 패턴 적용 전
          - MyApp에서도 Button클래스와 동일하게 버튼을 누르는 기능이 사용된다고 하면, Button 클래스와 동일한 코드가 반복되게 된다.
          - 만약 버튼을 눌렀을 때, 빛이 나는 것이 아니라 게임이 실행되게 변경이 되야한다면, 코드가 또다시 변경되야한다.
     */

    /* 기능 변경 전 코드
    private Light light;

    public MyApp(Light light) {
        this.light = light;
    }

    public void press() {
        light.off();
    }
    */

    // 기능 변경 후 코드
    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        /* 기능 변경 전 코드
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
        */

        // 기능 변경 후 코드
        MyApp myApp = new MyApp(new Game());
        myApp.press();
        myApp.press();
        myApp.press();
        myApp.press();
    }

}
