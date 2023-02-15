package class25;

public interface Movable {
    abstract void move();
}

interface OwnAble { // in interface, we can ONLY have one public
    void own ();
}

class Car implements Movable, OwnAble{
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}

class Dog implements Movable, OwnAble{
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}