package uk.co.bryn.oca.chapter5.interfaces.defaultmethod.impl;

import uk.co.bryn.oca.chapter5.interfaces.defaultmethod.SubInterfaceIgnores;

/**
 * @author david.stevenson
 */
public class ConcreteClass1 implements SubInterfaceIgnores {

    public static void main(String[] args) {
        ConcreteClass1 c = new ConcreteClass1();
        /*
        This class implements SubInterfaceIgnores so will use the default method defined in InterfaceWithDefaultMethod
         */
        System.out.println(c.modify(4.0));
    }
}
