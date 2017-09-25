package uk.co.bryn.oca.chapter4.overloading;

/**
 * @author david.stevenson
 */
public class WideningWrappers {

    public void print(Short s) {
        System.out.println("Short");
    }

    public void print(Long l) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        WideningWrappers w = new WideningWrappers();

        /*
        Doesn't work. Tries to widen to long/float/double but can't find a match. Then autoboxes 3 to an Integer, but still no match
         */
//        w.print(3);
    }
}
