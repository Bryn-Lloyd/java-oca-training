package uk.co.bryn.oca.chapter1.primitives;

/**
 * @author david.stevenson
 */
public class Examples {

    private long longNumber = 3123456789L;

    private short s = (short) 65535;

    private float f = 1.0F;

    Integer i = Integer.MAX_VALUE;

    private String date = "today";

    {
        s = getShort();
    }

    public static void main(String[] args) {
        Examples examples = new Examples();
        System.out.println(examples.s);
    }

    private short getShort() {
        int i = Short.MAX_VALUE * 2;
        return (short) i;
    }

}
