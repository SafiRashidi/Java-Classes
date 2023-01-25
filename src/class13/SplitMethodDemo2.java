package class13;

public class SplitMethodDemo2 {
    public static void main(String[] args) {
        String str= "I like Java. I write a lot of code daily. I am from batch 15";
        String [] strArr= str.split("[.?!]"); //splitting the sentences using the following grammar
        System.out.println(strArr.length);
        System.out.println(strArr[1]);
        /*
        whenever we are working with Arrays we use the length
        and whenever we are working with Strings we use the length()

         */
    }
}
