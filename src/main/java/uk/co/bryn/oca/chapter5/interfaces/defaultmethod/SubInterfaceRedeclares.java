package uk.co.bryn.oca.chapter5.interfaces.defaultmethod;

/**
 * @author david.stevenson
 */
public interface SubInterfaceRedeclares {

    /*
    Redeclares the default method as abstract. Any concrete class implementing this interface will need to provide its own implementation
     of this method
     */
    double modify(double d);
}
