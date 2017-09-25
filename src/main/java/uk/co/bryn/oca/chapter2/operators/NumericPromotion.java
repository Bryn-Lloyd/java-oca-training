package uk.co.bryn.oca.chapter2.operators;

/**
 * @author david.stevenson
 */
public class NumericPromotion {

    public static void main(String[] args) {

        long a = Long.MAX_VALUE;
        float b = Float.MAX_VALUE;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println("result is " + (a * b));

    }
}
