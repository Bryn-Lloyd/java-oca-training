package uk.co.bryn.oca.chapter5.interfaces.defaultmethod;

/**
 * @author david.stevenson
 */
public interface InterfaceWithDefaultMethod {

    /*
    Defines a default method
     */
    default double modify(double d) {
        return Math.pow(d, 2.0);
    }

}
