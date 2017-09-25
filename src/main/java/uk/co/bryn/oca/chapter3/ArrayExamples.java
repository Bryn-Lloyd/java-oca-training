package uk.co.bryn.oca.chapter3;

import java.util.Arrays;

/**
 * @author david.stevenson
 */
public class ArrayExamples {

    public static void main(String[] args) {

        int[] x = {4, 5}, y[] = {{1,2}, {3, 4}};
        int[] z = new int[] {0, 1, 2, 3};
//        System.out.println(x + ", " + y);

        String[] s1[] = new String[0][];

        String[] strings = {"A", "E", "I", "O", "U"};
        System.out.println(Arrays.binarySearch(strings, "I"));
        System.out.println(Arrays.binarySearch(strings, "H"));
        System.out.println(Arrays.binarySearch(strings, "j"));
    }
}
