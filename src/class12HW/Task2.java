package class12HW;

public class Task2 {
    public static void main(String[] args) {
        // Create a String and print it in reverse order (Sunday → yadnuS).

        String originalStr = "Friday";
        String reverseStr = "";

        for (int i = originalStr.length()-1; i >= 0; i--) {
            reverseStr += originalStr.charAt(i);
        }
        System.out.println("Original String: " + originalStr);
        System.out.println("Reverse String: " + reverseStr);
    }
}
