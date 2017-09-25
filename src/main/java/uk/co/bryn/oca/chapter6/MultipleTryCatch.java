package uk.co.bryn.oca.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author david.stevenson
 */
public class MultipleTryCatch {
    public static void main(String[] args) {

        System.out.print("a");
        try {
            System.out.print("b");

            List<Integer> numbers = new ArrayList<>();
            for (Number n : numbers) {

            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
//        } finally {
//            System.out.print("e");
//            throw new RuntimeException("3");
        }
    }

    private RuntimeException throwException(String message) {
        return new RuntimeException(message);
    }


}


