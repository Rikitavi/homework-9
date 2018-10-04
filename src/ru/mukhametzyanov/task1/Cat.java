package ru.mukhametzyanov.task1;
/**
 * Класс наследник {@link Animal}.
 */
public class Cat extends Animal implements Run, Swim {
    private String catName = "Муська";

    @Override
    void getName() {
        System.out.println(catName);
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