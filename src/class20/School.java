package class20;

public class School {
    public static void main(String[] args) {

        Teacher tc = new Teacher();
        tc.teacherName="Barbara";
        tc.teacherId="T456";

        System.out.println("This is the principle " + tc.teacherName);
        // tc.extraPoint(); this is private

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M221";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+ mt.subject);
        mt.excellent(); //comes from child class
        mt.homework(); //comes from the parent
    }
}
