package Day3;

interface Animals {
    void eat();
    void sleep();
}

class Dog implements Animals {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animals {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.eat();
        dog.sleep();

        Animals cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}

