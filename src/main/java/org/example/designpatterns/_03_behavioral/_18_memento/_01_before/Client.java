package org.example.designpatterns._03_behavioral._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            메멘토 패턴 적용 전
              - 캡슐화가 깨짐.
              - 클라이언트가 Game의 구성요소를 알고 있어야 한다는 단점이 존재.
              - 게임의 정보가 바뀔 때마다 클라이언트의 코드도 변경이 일어남. (=게임의 디테일한 정보에 의존적이기 때문)
         */
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setBlueTeamScore(blueTeamScore);
        restoredGame.setRedTeamScore(redTeamScore);
    }

}
