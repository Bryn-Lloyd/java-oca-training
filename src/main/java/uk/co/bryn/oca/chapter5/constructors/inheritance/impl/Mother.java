package uk.co.bryn.oca.chapter5.constructors.inheritance.impl;

import uk.co.bryn.oca.chapter5.constructors.inheritance.Guardian;

/**
 * @author david.stevenson
 */
public class Mother extends Guardian {

    public Mother() {
        super(46, Gender.FEMALE);
    }

    @Override
    protected String getName() {
        return "mother";
    }

    public void print() {
        System.out.println(super.getName());
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.print();
    }
}
