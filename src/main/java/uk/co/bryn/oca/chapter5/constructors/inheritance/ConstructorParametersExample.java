package uk.co.bryn.oca.chapter5.constructors.inheritance;

/**
 * @author david.stevenson
 */
public class ConstructorParametersExample {
}

class Parent {

    private int age;
    private String name;

    /**
     * Note two parameters
     *
     * @param age
     * @param name
     */
    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Child extends Parent {

    /**
     * Note only one parameter, but we can still call the parent constructor by adding in a second argument
     *
     * @param age
     */
    public Child(int age) {
        super(age, "");
    }
}

class Grandchild extends Child {

    Grandchild() {
        super(0);
    }
}
