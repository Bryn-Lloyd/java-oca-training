package uk.co.bryn.oca.chapter6;

import java.io.IOException;

/**
 * @author david.stevenson
 */
public class Parent {


    public void doStuff() throws IOException {
        // Do nothing
    }
}

class Child extends Parent {

    public void doStuff() throws RuntimeException {

    }
}