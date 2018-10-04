package ru.mukhametzyanov.task1;
/**
 * Класс наследник {@link Animal}.
 */
public class Dog extends Animal implements Run, Swim {
    private String dogName = "Шарик";

    @Override
    void getName() {
        System.out.println(dogName);
    }

    @Override
    public void run() {
        System.out.println("Беги");
    }

    @Override
    public void swim() {
        System.out.println("Плыви");

    }
}

