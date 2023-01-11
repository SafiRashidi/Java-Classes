package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";
/*
java executes code from top to bottom but if we have multiple
operations on the same lines it execute them from left to right.
 */
        System.out.println(firstName+" "+lastName);
        System.out.println("****"+firstName+" "+lastName+"****");
        System.out.println("First Name= "+firstName);
        System.out.println("Last Name= "+lastName);
/*
in String data type java only combined two different data
for example: 10+10= 1010, not 20
 */
    }
}
