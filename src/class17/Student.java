package class17;

public class Student {
    int id;
    String name;
    int age;
    double weight;

    Student (int studentId, String studentName, int studentAge, double studentWeight){
        id = studentId;
        name = studentName;
        age = studentAge;
        weight = studentWeight;
    }
    void printInfo () {
        System.out.println("ID "+id+" Name "+name+ " Age "+age+ " Weight "+weight);
    }
}
