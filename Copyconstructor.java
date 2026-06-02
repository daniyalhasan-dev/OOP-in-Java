class Student {
    String name;
    int age;
    String gender;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.gender = s2.gender;
    }

    Student(){

    }

}

public class Copyconstructor {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Daniyal";
    s1.age = 20;
    s1.gender = "Male";

    Student s2 = new Student(s1);

    s2.printInfo();
    }
}