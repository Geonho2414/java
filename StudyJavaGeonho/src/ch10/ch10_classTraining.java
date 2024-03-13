package ch10;

class Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}
class Student extends Human {
    int studentID;
    void goToSchool() {}
}
class Worker extends Human {
    int workerID;
    void goToWork() {}
}
public class ch10_classTraining {
    public static void main(String[] args){
        Human h = new Human();
        h.name = "조건호";
        h.age = 19;
        h.eat();
        h.sleep();

        Student s = new Student();
        s.name = "조건호";
        s.age = 19;
        s.studentID = 60122;
        s.eat();
        s.sleep();
        s.goToSchool();

        Worker w = new Worker();
        w.name = "조건호";
        w.age = 19;
        w.workerID = 113113;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}