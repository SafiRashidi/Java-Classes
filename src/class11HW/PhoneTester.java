package class11HW;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone=new Phone();
        iPhone.brandName="Apple";
        iPhone.quality="Very Good";
        iPhone.color="Blue";
        iPhone.calls();
        iPhone.text();

        Phone Pixel=new Phone();
        Pixel.brandName="Google";
        Pixel.quality="Good";
        Pixel.color="Black";
        Pixel.calls();
        Pixel.text();

        Phone Samsung=new Phone();
        Samsung.brandName="Samsung";
        Samsung.quality="Good";
        Samsung.color="White";
        Samsung.calls();
        Samsung.text();
    }
}
