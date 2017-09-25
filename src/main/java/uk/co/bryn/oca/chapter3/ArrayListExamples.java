package uk.co.bryn.oca.chapter3;

import java.util.Arrays;
import java.util.List;

/**
 * @author david.stevenson
 */
public class ArrayListExamples {

    public static void main(String[] args) {

        String[] array = {"one", "two", "three"};
        final List<String> strings = Arrays.asList(array);

        List<String> s2 = Arrays.asList("one", "two", "three");
        s2.remove(0);

        List<String> s3;
    }
}
