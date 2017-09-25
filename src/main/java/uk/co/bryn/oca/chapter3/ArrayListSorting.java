package uk.co.bryn.oca.chapter3;

import java.util.ArrayList;

/**
 * @author david.stevenson
 */
public class ArrayListSorting {

    public static void main(String[] args) {
        OurOwnObject o1 = new OurOwnObject(56, "foo");
        OurOwnObject o2 = new OurOwnObject(75, "bar");
        ArrayList<OurOwnObject> a = new ArrayList<>();
        a.add(o1);
        a.add(o2);
        System.out.println(a);
//        Collections.sort(a);
    }
}

class OurOwnObject {
    private int i;
    private String s;

    public OurOwnObject(int i, String s) {
        this.i = i;
        this.s = s;
    }
}
