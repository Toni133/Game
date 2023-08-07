package ru.netology.javaqa.Game;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        super("грок с именем" + playerName + "не найден");
    }
}
