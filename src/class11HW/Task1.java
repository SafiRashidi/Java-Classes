package class11HW;

public class Task3 {
    public static void main(String[] args) {
        /*
Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade.
         */

        String [][] studentsGrad= {{"Safi","Asghar","Hanna","Sarah" },
                                    {"A","B","C","A"}};
        for (int i = 0; i < studentsGrad.length; i++) {
            for (int j = 0; j < studentsGrad[i].length; j++) {
                if (studentsGrad [i][j].equals ("A")|| studentsGrad [i][j].equals("B")){
                    System.out.println(studentsGrad[0][j]);
                }
            }
        }

    }
}
