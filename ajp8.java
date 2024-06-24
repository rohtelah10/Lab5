class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class ajp8 {
    public static void main(String[] args) {
        Animal animalObject = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Calling makeSound() on a animal:");
        animalObject.makeSound(); 

        System.out.println("\nCalling makeSound() on a dog:");
        dog.makeSound();

        System.out.println("\nCalling makeSound() on a cat:");
        cat.makeSound();
    }
}