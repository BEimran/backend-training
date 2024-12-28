package Day2;

class Animal {
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("The dog says: Woof Woof!");
    }
}


class Cat extends Animal {

    public void speak() {
        System.out.println("The cat says: Meow!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog:");
        dog.speak();

        System.out.println("Cat:");
        cat.speak();
    }
}

