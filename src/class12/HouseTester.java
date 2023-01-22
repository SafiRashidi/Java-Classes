package class12;

public class HouseTester {
    public static void main(String[] args) {
        House classicHome=new House();
        classicHome.design="Classic";
        classicHome.color="yellow";
        classicHome.bedroom=5;
        classicHome.bathroom=5;
        classicHome.year=2022;
        classicHome.carGarage();
        classicHome.neighborhood();
    }
}
