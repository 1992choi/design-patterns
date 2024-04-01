package org.example.designpatterns._03_behavioral._14_command._02_after;

import org.example.designpatterns._03_behavioral._14_command._01_before.Game;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }

}
