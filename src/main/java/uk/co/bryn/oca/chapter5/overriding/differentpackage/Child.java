package uk.co.bryn.oca.chapter5.overriding.differentpackage;

import uk.co.bryn.oca.chapter5.overriding.HidingDefaultAccessMethods;

/**
 * @author david.stevenson
 */
public class Child extends HidingDefaultAccessMethods.Parent{

    public void count() {
        System.out.println(2);
    }

    void print() {
        System.out.println("Child");
    }

    public static void main(String[] args) {

        HidingDefaultAccessMethods.Parent parent = new Child();
        parent.count();

        Child child = new Child();
        child.print();
    }
}
