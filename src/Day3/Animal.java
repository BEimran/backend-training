package Day3;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}

