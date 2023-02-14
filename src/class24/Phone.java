package class24;

public abstract class Phone {
    /*

     */
    abstract void displayPictures ();
    abstract void unlockPhone ();
    abstract void sendText();

}
class IPhone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Display Picture");
    }
    @Override
    void unlockPhone() {
        System.out.println("Unlock your iPhone with faceID");
    }
    @Override
    void sendText() {
        System.out.println("send a text message via iMessage");
    }
}
class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Display picture");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlock your phone by using finger print");
    }

    @Override
    void sendText() {
        System.out.println("sending a message with android software");
    }
}
