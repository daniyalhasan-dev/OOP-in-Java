abstract class Animal {

    abstract void sound();

    public void eats(){
        System.out.println("Eat");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.eats();
    }
}