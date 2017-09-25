package uk.co.bryn.oca.chapter4;

/**
 * @author david.stevenson
 */
public class VirtualMethodInvocation {

    public static void main(String[] args) {

        A a = new B();
        a.print();
    }
}

class A {
    private String getName() {
        return "A";
    }

    public void print() {
        System.out.println(getName());
    }
}

class B extends A {
    public String getName() {
        return "B";
    }
}
