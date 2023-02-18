package class27;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList <Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('Z');
        characters.add('D');
        characters.add('F');
        characters.add('G');
        characters.add('H');
        //  dataType - name of array : name of arrayList from above
        for (Character c : characters){
            System.out.print(c + " ");
        }
    }
}
