package ru.netology.javaqa.Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void testWhenFirstPlayerWin(){
        Player vasya = new  Player(1, "Вася", 100);
        Player petya = new  Player(2, "Петя", 120);
        Geme geme = new Geme();

        geme.register(vasya);
        geme.register(petya);
        int actual = geme.round("Петя", "Вася");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhenFirstPlayerNotExist(){
        Player vasya = new  Player(1, "Вася", 100);
        Player petya = new  Player(2, "Петя", 120);
        Geme geme = new Geme();

        geme.register(vasya);
        geme.register(petya);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> geme.round("Жора","Вася")
        );

    }
}
