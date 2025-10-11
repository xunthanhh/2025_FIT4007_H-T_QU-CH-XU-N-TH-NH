import java.util.ArrayList;
import java.util.List;

interface CanRun {
    void run();
}

// Lớp trừu tượng
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound(); // đa hình qua override

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal implements CanRun {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Bird chirps.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("Buddy"));
        zoo.add(new Cat("Miu"));
        zoo.add(new Bird("Tweety"));

        // Đa hình: cùng gọi sound() trên kiểu tham chiếu Animal
        for (Animal a : zoo) {
            a.eat();
            a.sound();
        }

        
    }
}
