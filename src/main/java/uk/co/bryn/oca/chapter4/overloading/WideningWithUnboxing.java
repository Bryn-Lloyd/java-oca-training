package uk.co.bryn.oca.chapter4.overloading;

/**
 * @author david.stevenson
 */
public class WideningWithUnboxing {

    public void print(short s) {
        System.out.println("short");
    }

    public void print(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        WideningWithUnboxing w = new WideningWithUnboxing();

        /*
        This works as we first unbox from Integer to int, then widen to a long
         */
        w.print(Integer.valueOf(3)); // "long"

        /*
        This works by simple widening
         */
        w.print(3); // "long"
    }
}
