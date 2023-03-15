package bai1_animals;

import bai1_animals.animals.Animal;
import bai1_animals.animals.Chicken;
import bai1_animals.animals.Tiger;
import bai1_animals.fruit.Apple;
import bai1_animals.fruit.Fruit;
import bai1_animals.fruit.Orange;
import bai1_animals.person.IEdible;

public class Bai1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
