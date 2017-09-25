package uk.co.bryn.oca.chapter5.overriding;

/**
 * @author david.stevenson
 */
public class HidingDefaultAccessMethods {

    public static class Parent {

        public void count() {
            System.out.println(1);
        }

        void print() {
            System.out.println("Parent");
        }
    }
}
