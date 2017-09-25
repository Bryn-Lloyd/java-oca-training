package uk.co.bryn.oca.chapter4;

import java.time.Period;
import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

/**
 * @author david.stevenson
 */
public class Statics {

    public static void sampleMethod() {
        System.out.println("sampleMethod");
    }

    {
        final List<String> strings = Arrays.asList("one", "two", "three");
        String b = valueOf(false);
        String i = valueOf(2);
    }

    public static void main(String... args) {

        Statics s = null;
        s.sampleMethod();

        String s1 = valueOf(false);
        s1 = s1.concat(" true");
        System.out.println(s1);


//        Period p = Period.ofYears(1).ofMonths(2);


        Period p = Period.ofYears(1);
        p = p.ofMonths(2);


        System.out.println(p);
    }
}
