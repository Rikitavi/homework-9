package ru.mukhametzyanov.task1;
/**
 * Класс наследник {@link Animal}.
 */
public class Bird extends Animal implements Fly, Run, Swim {
    private String birdName = "Утка";

    @Override
    void getName() {
        System.out.println(birdName);
    }

    @Override
    public void fly() {
        System.out.println("Лети");
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


