package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        /*
         * Iteration 1 - Using tight coupling in classes MarioGame and GameRunner
         *               To be able to run a different Game like SuperContraGame,
         *               we have to change GameRunner class
         */
        // var newMarioGame = new MarioGame();
        var superContra = new SuperContraGame();
        var gameRunner = new GameRunner(newMarioGame);
        gameRunner.run();
    }
}
