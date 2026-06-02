class Animal {
    String name;
    int age;

    public void Printinfo(String name) {
        System.out.println(name);
    }

    public void Printinfo(int age) {
        System.out.println(age);
    }

    public void Printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Ant";
        a1.age = 2;

        a1.Printinfo(a1.name , a1.age);
    }

}
