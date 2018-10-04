package ru.mukhametzyanov.task1;
/**
 * Класс наследник {@link Animal}.
 */
public class Fish extends Animal implements Swim {
    private String fishName = "Щука";

    @Override
    void getName() {
        System.out.println(fishName);
    }

    @Override
    public void swim() {
        System.out.println("Плыви");
    }
}
