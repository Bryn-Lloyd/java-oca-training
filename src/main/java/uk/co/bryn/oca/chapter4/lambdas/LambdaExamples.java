package uk.co.bryn.oca.chapter4.lambdas;

/**
 * @author david.stevenson
 */
public class LambdaExamples {

    /*
    Method expects an Integer, and an instance of Tester
     */
    public static void print(Integer integer, Tester tester) {
        System.out.println(tester.test(integer));
    }

    public static void main(String[] args) {

        /*
        This invocation passes in an Integer, and an anonymous instance of Tester, which returns true if the Integer value > 0
         */
        print(3, new Tester() {
            @Override
            public boolean test(Integer i) {
                return i > 0;
            }
        });

        /*
        The same code written using a lambda expression.  Note there is no reference to Tester, nor to the method name 'test'

        This only works with 'functional interfaces', which contain only one method, so Java knows which method to call and its name is
        irrelevant

        Knowing the method to call means Java can derive the input argument type of 'i' (Integer), and the return value (boolean)
         */
        print(3, i -> i > 0);
    }

    /*
    Interface created as an inner class for ease of reference
     */
    public interface Tester {
        boolean test(Integer i);
    }
}
