package uk.co.bryn.oca.chapter5.interfaces.defaultmethod;

/**
 * @author david.stevenson
 */
public interface SubInterfaceOverrides extends InterfaceWithDefaultMethod {

    /*
    Overrides the definition of the default method. Any concrete class implementing this interface will be able to use this method
     */
    default double modify(double d) {
        return Math.pow(d, 3.0);
    }
}
