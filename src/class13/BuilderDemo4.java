package class13;

public class BuilderDemo4 {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 10; i++) {
            str.append(i);
        }
        System.out.println(str);
    }
}
