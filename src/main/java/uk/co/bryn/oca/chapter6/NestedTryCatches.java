package uk.co.bryn.oca.chapter6;

/**
 * @author david.stevenson
 */
public class NestedTryCatches {

    public static void main(String[] args) {
        try {
            doStuff();
        } catch (Exception e) {
            System.out.println("Caught an unhandled Exception: " + e.getClass().getSimpleName());
        }
    }
    private static void doStuff() throws Exception {
        try {
            try {
                methodA(); // throws a MySimpleException
            } catch (RuntimeException re) {
                System.out.println("Caught RuntimeException"); // MySimpleException is not a RuntimeException so this isn't executed
            }
        } catch (MySimpleException mse) {
            System.out.println("Caught MySimpleException");
            try {
                methodB(); // throws an AnotherSimpleException
            } catch (MySimpleException e) {
                System.out.println("Caught inner MySimpleException"); // Not reached
            }
        } catch (AnotherSimpleException e) {
            // This is not reached at runtime because AnotherSimpleException is thrown from within a 'catch' block, not a 'try'
            System.out.println("Caught outer AnotherSimpleException");
        } finally {
            System.out.println("In finally block");
        }
    }

    private static void methodA() throws MySimpleException, AnotherSimpleException {
        throw new MySimpleException();
    }

    private static void methodB() throws MySimpleException, AnotherSimpleException {
        throw new AnotherSimpleException();
    }
}

class MySimpleException extends Exception {}
class AnotherSimpleException extends Exception {}