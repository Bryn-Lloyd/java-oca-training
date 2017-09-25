package uk.co.bryn.oca.chapter5.interfaces.defaultmethod.impl;

import uk.co.bryn.oca.chapter5.interfaces.defaultmethod.SubInterfaceOverrides;

/**
 * @author david.stevenson
 */
public class ConcreteClass2 implements SubInterfaceOverrides {

    public static void main(String[] args) {
        ConcreteClass2 c = new ConcreteClass2();
        /*
        This class implements SubInterfaceOverrides so will use the default method definition in that interface
         */
        System.out.println(c.modify(4.0));
    }
}
