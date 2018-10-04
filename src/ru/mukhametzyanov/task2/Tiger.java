package ru.mukhametzyanov.task2;

/**
 * Наследник класса Animal {@link Animal}
 */
public class Tiger extends Animal {
    private String name = "Тигр";

    @Override
    public void getReady() {
        System.out.println("Приготовься!");
    }

    @Override
    public void getRun() {
        System.out.println("Беги!");
    }

    @Override
    public void getJump() {
        System.out.println("Прыгай!");
    }

    @Override
    public void getSwim() {
        System.out.println("Плыви!");
    }

    @Override
    void getName() {
        System.out.println(name);
    }
}
