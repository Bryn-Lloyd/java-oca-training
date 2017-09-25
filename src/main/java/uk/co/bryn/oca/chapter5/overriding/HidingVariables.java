package uk.co.bryn.oca.chapter5.overriding;

/**
 * @author david.stevenson
 */
public class HidingVariables {
}

class Bird {

    protected boolean canFly = true;
}

class Ostrich extends Bird {

    public boolean canFly = false;

    public static void main(String[] args) {
        Bird b = new Ostrich();
        System.out.println(b.canFly);
    }
}