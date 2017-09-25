package uk.co.bryn.oca.chapter4.lambdas;

import java.util.ArrayList;

/**
 * @author david.stevenson
 */
public class AnotherPredicateExample{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        list.removeIf(s -> s.equals("a"));
        System.out.println(list);
    }
}
