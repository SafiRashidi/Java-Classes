package class16;

public class Students1 {
    /*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String name;
    String id;
    static int noOfStudent;

    public static void main(String[] args) {
        Students1 nezir=new Students1();
        nezir.name="Nezir";
        nezir.id="1";
        nezir.noOfStudent++;

        Students1 ardasher=new Students1();
        ardasher.name="Ardasher";
        ardasher.id="2";
        ardasher.noOfStudent++;

        Students1 safi=new Students1();
        safi.name="Safi";
        safi.id="03";
        safi.noOfStudent++;

        System.out.println(Students1.noOfStudent);
    }

}
