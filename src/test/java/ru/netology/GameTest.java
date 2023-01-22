package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void ferstPlayerStrenght() {
        Player player1 = new Player(1, "Sergo", 50);
        Player player2 = new Player(4, "Jhon", 41);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int actual = game.round("Sergo", "Jhon");
        int expected = 1;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void secondPlayerStrenght() {
        Player player1 = new Player(1, "Sergo", 50);
        Player player2 = new Player(4, "Jhon", 51);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int actual = game.round("Sergo", "Jhon");
        int expected = 2;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void playerStrenghtAreEqual() {
        Player player1 = new Player(1, "Sergo", 50);
        Player player2 = new Player(4, "Jhon", 50);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int actual = game.round("Sergo", "Jhon");
        int expected = 0;

        Assertions.assertEquals(actual, expected);


    }
}