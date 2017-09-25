package uk.co.bryn.oca.chapter3;

import java.time.Period;

/**
 * @author david.stevenson
 */
public class MethodChaining {

    public static void main(String[] args) {
        String s = new String("a")
                .concat("b")
                .toUpperCase();

        s = new String("a");
        s = s.concat("b");
        s = s.toUpperCase();

        StringBuilder sb = new StringBuilder("a");
        sb.append("b");


        System.out.println(s);


//        Period p = Period.ofYears(1).ofMonths(2).ofDays(3);
//        System.out.println(p);

        Period p = Period.ofYears(1);
        p = p.ofMonths(2);
        p = p.ofDays(3);

        p = Period.ofYears(1);
        p = Period.ofMonths(2);
        p = Period.ofDays(3);

    }
}
