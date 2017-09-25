package uk.co.bryn.oca.chapter5.interfaces.defaultmethod.impl;

import uk.co.bryn.oca.chapter5.interfaces.defaultmethod.SubInterfaceRedeclares;

/**
 * @author david.stevenson
 */
public class ConcreteClass3 implements SubInterfaceRedeclares {

    /*
    This class implements SubInterfaceRedeclares which has an abstract declaration of the #modify method.  This class therefore needs to
    provide its own implementation
     */
    @Override
    public double modify(double d) {
        return 0;
    }
}
