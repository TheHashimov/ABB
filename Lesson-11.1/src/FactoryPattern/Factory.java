package FactoryPattern;

public class Factory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("cat")) return new Cat();
        else if (type.equalsIgnoreCase("dog")) return new Dog();
        else if (type.equalsIgnoreCase("elephant")) return new Elephant();
        else throw new IllegalArgumentException("Invalid animal type: " + type);
    }
}