package uk.co.bryn.oca.chapter5.interfaces.defaultmethod.multipleinheritance;

/**
 * @author david.stevenson
 */
public interface Interface3 extends Interface1, Interface2 {

    default int getValue() {
        return 100;
    }
}
