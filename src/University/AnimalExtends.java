package University;

public class AnimalExtends {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();
        Animal bird = new Bird();
        bird.run();
    }
}

class Animal {
    public void run() {
        System.out.println("Animal is moving.");
    }
}

class Bird extends Animal {
    @Override
    public void run() {
        System.out.println("Bird is moving.");
    }
}
