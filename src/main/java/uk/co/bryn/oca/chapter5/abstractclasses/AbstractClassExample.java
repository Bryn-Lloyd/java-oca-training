package uk.co.bryn.oca.chapter5.abstractclasses;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author david.stevenson
 */
public class AbstractClassExample {
}

abstract class Parent {

    protected abstract Number getValue() throws IOException;

}

class Child extends Parent {


    @Override
    public Integer getValue() throws FileNotFoundException {
        return 0;
    }
}

abstract class Grandchild extends Child {

    public abstract Integer getValue() throws FileNotFoundException;
}