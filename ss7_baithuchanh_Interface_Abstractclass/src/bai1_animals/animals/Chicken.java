package bai1_animals.animals;

import bai1_animals.person.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
