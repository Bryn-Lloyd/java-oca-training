package uk.co.bryn.oca.chapter6;

import java.io.IOException;

/**
 * @author david.stevenson
 */
public class CallingMethodsThatThrowExceptions {

    private static void doStuff() {
    }

    private static void doStuffAndThrowException() throws IOException {
        // Code doesn't actually throw the declared Exception
    }

    public static void main(String[] args) {
//        try {
//            doStuff();
//        } catch (IOException ioe) { // Does not compile
//            System.out.println("Unreachable code");
//        }

        try {
            doStuffAndThrowException();
        } catch (IOException e) {
            System.out.println("Handle Exception declared by method, even though it isn't thrown from the method code");
        }
    }
}
