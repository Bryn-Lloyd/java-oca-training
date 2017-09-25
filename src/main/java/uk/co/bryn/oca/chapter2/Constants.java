package uk.co.bryn.oca.chapter2;

/**
 * @author david.stevenson
 */
public class Constants {

    private final String s1 = "A_CONSTANT";
    private final String s2;

    {
        s2 = "ANOTHER_CONSTANT";
    }

    public void test(String testValue) {

        switch (testValue) {
            case s1:
                System.out.println("s1");
                break;
//            case s2:
        }
    }

}
