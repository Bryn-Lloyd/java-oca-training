package uk.co.bryn.oca.twist.chapter1.nonaccessmodifiers;

public abstract class SuperClass {
    abstract void m();   // abstract method
}

class SubClass extends SuperClass {
    // implements the abstract method from the SuperClass
    void m() {
      // some code.........
    }
}