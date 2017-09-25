package uk.co.bryn.oca.chapter4.overloading;

/**
 * @author david.stevenson
 */
public class WideningPrimitives {

    public void print(short s) {
        System.out.println("short");
    }

    public void print(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        WideningPrimitives w = new WideningPrimitives();

        w.print(3); // "long"
    }
}
