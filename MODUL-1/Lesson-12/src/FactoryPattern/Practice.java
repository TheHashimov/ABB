package FactoryPattern;

public class Practice {
    public static void main(String[] args) {
        System.out.println("=== Without Factory ===");
        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();

        Animal elephant = new Elephant();
        elephant.makeSound();

        System.out.println("\n=== With Factory ===");
        Animal catF = Factory.createAnimal("cat");
        catF.makeSound();

        Animal dogF = Factory.createAnimal("dog");
        dogF.makeSound();

        Animal elephantF = Factory.createAnimal("elephant");
        elephantF.makeSound();
    }
}