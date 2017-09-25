package uk.co.bryn.oca.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author david.stevenson
 */
public class WrapperClasses {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(1));
        numbers.add(2);

        numbers.remove(new Integer(1));

        System.out.println(numbers);

    }
}
