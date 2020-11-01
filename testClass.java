package lab8;

public class testClass {
    public static void main(String[] args) {
        int a = 10;
        People people = new People();
        people.printInfo();
        People peopleTwo = new People("Ivan","Ivanov",19);
        peopleTwo.printInfo();
        peopleTwo.walk();
        peopleTwo.voice();
        peopleTwo.run();
        Student student = new Student("Pavlov", "Pavel", 20);
        student.printInfo();
        student.learn();
        Teacher teacher = new Teacher("Petrov", "Petr", 25);
        teacher.printInfo();
        teacher.teach();
    }
}
