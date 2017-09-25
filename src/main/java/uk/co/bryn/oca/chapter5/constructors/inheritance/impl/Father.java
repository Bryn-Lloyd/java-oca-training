package uk.co.bryn.oca.chapter5.constructors.inheritance.impl;

import uk.co.bryn.oca.chapter5.constructors.inheritance.Guardian;

/**
 * @author david.stevenson
 */
public class Father extends Guardian {

    public Father() {
        System.out.println("In Father()");
    }

    public Father(int age) {
        super(age, Gender.MALE);
        System.out.println("In Father(age)");
    }

    @Override
    protected String getName() {
        return "father";
    }

    public static void main(String[] args) {
        new Father(45);
        System.out.println("");
        new Father();
    }
}
