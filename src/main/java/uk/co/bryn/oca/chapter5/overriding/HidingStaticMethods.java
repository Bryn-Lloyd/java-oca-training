package uk.co.bryn.oca.chapter5.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author david.stevenson
 */
public class HidingStaticMethods {
}

class StaticsParent {

    /*
    Parent implementation - note static
     */
    public static String getDescription() throws IOException {
        return "parent";
    }

    /*
    Call to getDescription() method from parent class invokes parent implementation
     */
    public void printParentDescription() throws IOException {
        System.out.println(getDescription());
    }
}

class StaticsChild extends StaticsParent {

    /*
    Child implementation - also static
     */
    public static String getDescription() throws FileNotFoundException {
        return "child";
    }

    /*
    Call to getDescription() method from child class invokes child implementation
     */
    public void printChildDescription() throws IOException {
        System.out.println(getDescription());
    }

    public static void main(String[] args) throws IOException {
        StaticsChild staticsChild = new StaticsChild();
        staticsChild.printChildDescription(); // child
        staticsChild.printParentDescription(); // parent
    }
}
