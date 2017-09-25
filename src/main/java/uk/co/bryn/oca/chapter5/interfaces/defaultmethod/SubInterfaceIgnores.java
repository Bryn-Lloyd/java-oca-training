package uk.co.bryn.oca.chapter5.interfaces.defaultmethod;

/**
 * @author david.stevenson
 */
public interface SubInterfaceIgnores extends InterfaceWithDefaultMethod {

    /*
    Does not define a default method so inherits it from InterfaceWithDefaultMethod.  Any concrete class implementing this interface will
     be able to use the parent interface's method
     */
}
