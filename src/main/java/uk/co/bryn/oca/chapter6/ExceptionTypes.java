package uk.co.bryn.oca.chapter6;

import java.io.IOException;

/**
 * @author david.stevenson
 */
public class ExceptionTypes {

    private void methodA() {

    }

    private void methodB() throws IllegalArgumentException {

    }

    private void methodC() throws IOException {

    }

    private void methodD() throws ExceptionInInitializerError {

    }

    public void runMethods() throws IOException {
        methodA();
        methodB();
        methodC();
        methodD();
    }
}
