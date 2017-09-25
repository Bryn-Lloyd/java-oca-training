package uk.co.bryn.oca.chapter5.overriding;

/**
 * @author david.stevenson
 */
public class HidingPrivateMethods {
}

class Car {

    private boolean isCool() {
        return false;
    }

    public static void main(String[] args) {
        Car car = new Citroen2CV();
        System.out.println(car.isCool());
    }
}

class Citroen2CV extends Car {

    public boolean isCool() {
        return true;
    }

}