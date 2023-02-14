package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone [] phones={new IPhone(), new Samsung()};
        for (Phone po : phones){
            po.unlockPhone();
            po.sendText();
            po.displayPictures();
        }
    }
}
