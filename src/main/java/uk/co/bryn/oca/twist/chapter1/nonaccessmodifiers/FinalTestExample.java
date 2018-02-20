package uk.co.bryn.oca.twist.chapter1.nonaccessmodifiers;

public class FinalTestExample {

    final int value = 10;

    // The following are examples of declaring constants:
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue() {
        //value = 12;   // Will give an error as variable is final
    }

}
