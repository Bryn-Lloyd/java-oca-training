package uk.co.bryn.oca.chapter2.statements;

/**
 * @author david.stevenson
 */
public class ForExamples {

    public static void main(String[] args) {

        for (int x = 0, y = 0; x < 20; System.out.print(x), x++, ++x, System.out.print(x), x*=2, System.out.println(x));

//        int x = 0;
//        long y = 10;
//        for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//            System.out.println(x + " ");
//        }

        for (int i = 0; i < 10; ) {

            i = i++;

            System.out.println(i);
        }

    }
}
