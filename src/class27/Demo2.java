package class27;

public class Demo2 {
    public static void main(String[] args) {

        String name="Hiral";
        String[] names= {"Hiral", "Nima", "Laura", "Nat"};
        // create a method which can search a name from this array return true if name is present in the array
        System.out.println(contains(name,names));
    }
    public static boolean contains (String nameToBeSearched, String [] names) {
        for (String name : names) {
            if (nameToBeSearched.equals(name)) {
                return true;
            }
        }
        return false;
    }
    /*String[] names = {"Hiral", "Nima", "Laura", "Nat"};
    String target = "Laura";

    public static boolean searchName(String[]names, String target){
        for (String name : names) {
            if (name.equals(target)) {
                return true;
            }
        }
        return false;
    }*/
}