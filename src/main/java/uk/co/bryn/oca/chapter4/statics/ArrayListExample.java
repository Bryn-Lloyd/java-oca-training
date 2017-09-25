package uk.co.bryn.oca.chapter4.statics;

import java.util.ArrayList;
import java.util.List;


/**
 * @author david.stevenson
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<String> string2 = asList("one", "two", "three");
    }

    public static List<String> asList(String... strings) {
        return new ArrayList<>();
    }
}
