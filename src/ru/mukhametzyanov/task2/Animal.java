package ru.mukhametzyanov.task2;

/**
 * Абстрактный класс реализующий один метод {@link Animal#getName()}, который выводит имена животных.
 */
public abstract class Animal implements Run, Swim {

    abstract void getName();

}
