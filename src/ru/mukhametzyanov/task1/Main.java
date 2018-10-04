package ru.mukhametzyanov.task1;

/**
 * @author Ruslan Mukhmetzyanov
 */
public class Main {

    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();

        fish.getName();
        ((Fish) fish).swim();
        cat.getName();
        ((Cat) cat).swim();
        ((Cat) cat).run();
        dog.getName();
        ((Dog) dog).swim();
        ((Dog) dog).run();
        bird.getName();
        ((Bird) bird).swim();
        ((Bird) bird).run();
        ((Bird) bird).fly();
    }
}
