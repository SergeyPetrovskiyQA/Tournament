package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotRegisteredExceptionTest {
    @Test
    public void playerNotRegistred() {
        Player player1 = new Player(1, "Sergo", 50);
        Player player2 = new Player(4, "Jhon", 30);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Sergo", "Jo"));
    }
}