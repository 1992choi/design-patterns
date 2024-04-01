package org.example.designpatterns._03_behavioral._14_command._02_after;

import org.example.designpatterns._03_behavioral._14_command._01_before.Game;
import org.example.designpatterns._03_behavioral._14_command._01_before.Light;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game())); // 게임을 시작합니다.
        button.press(new LightOnCommand(new Light())); // 불을 켭니다.
        button.undo(); // 불을 끕니다.
        button.undo(); // 게임을 종료합니다.
    }

}
