package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is reserving a box in the computer's memory
        we are calling it box1 we need the information that we
        are storing inside this box. We can simple say to the
        computer give us the content of box1.
        int=> what type of data we want to store.
        box1=> is the name of the box.
        = sign will take whatever we write after it and will store
        it inside the box1.
        10=> is what we are storing inside the box
         */
        int box1=10;
        // if we are printing something from a box we don't need " "
        System.out.println(box1);
        /* to store whole number (numbers without decimals point)
        we have 4 different types of boxes. like 10 20 3000
        1) byte 2) short 3) int 4) long.
        For byte: limit is from -128 to 127
         */
        byte box2=127;
        byte box3=-128;
        short box4=32767; // range for short is from -32768 to 32767.
        int biggerBox=123456789; // most common type of box
        long maxBox=1246587985412184798l; //in long numbers at the end we should always put (L).

        short myBox=10000;
        System.out.println(myBox);
    }
}
