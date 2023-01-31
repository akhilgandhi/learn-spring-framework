package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacMan;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        /*
         * Iteration 1 - Using tight coupling in classes MarioGame and GameRunner
         *               To be able to run a different Game like SuperContraGame,
         *               we have to change GameRunner class.
         * Iteration 2 - Add an interface GamingConsole to disconnect GameRunner
         *               class from Game(Mario, SuperContra).Now Game(Mario, SuperContra)
         *               will implement the GamingConsole interface.
         */
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacMan();                // 1: Object creation
        var gameRunner = new GameRunner(game);  // 2: Object creation + wiring dependencies
                                                // Game is a dependency of GameRunner
        gameRunner.run();
    }
}
