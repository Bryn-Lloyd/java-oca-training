package uk.co.bryn.oca.chapter4.overloading;

/**
 * @author david.stevenson
 */
public class ResolutionOrder {

    public void print(short s) {
        System.out.println("short");
    }

    public void print(long lng) {
        System.out.println("long");
    }

    public void print(Integer integer) {
        System.out.println("Integer");
    }

    public void print(Number number) {
        System.out.println("Number");
    }

    public void print(Object o) {
        System.out.println("object");
    }

    public void printWrapper(Short s) {
        System.out.println("Short");
    }

    public void printWrapper(Long l) {
        System.out.println("Long");
    }

    public void printWrapper(Number number) {
        System.out.println("Number");
    }

    public void printPrimitive(short s) {
        System.out.println("short");
    }

    public void printPrimitive(long l) {
        System.out.println("long");
    }

    public void printVarargs(Integer i1, Integer i2) {
        System.out.println("Integers");
    }

    public void printVarargs(Object... objects) {
        System.out.println("varargs");
    }

    public void printInteger(Integer integer) {
        System.out.println("integer");
    }

    public void printInteger(int... ints) {
        System.out.println("ints");
    }

    public static void main(String[] args) {
        ResolutionOrder ro = new ResolutionOrder();
        ro.print((short) 3); // short
        ro.print(Short.valueOf((short) 3)); // Number - widening before autoboxing
        ro.print(3); // long - widening before autoboxing
        ro.print(Integer.valueOf(3)); // Integer
        ro.print(3L); // long
        ro.print(Long.valueOf(3L)); // Number - widening of Long to Number

        ro.printWrapper(3);
        ro.printPrimitive(3);
        ro.printPrimitive(Integer.valueOf(3));

        ro.printVarargs(3, 4);
        ro.printVarargs((short) 3, 4L);
        ro.printVarargs(3);
        ro.printVarargs(3, 4, 5);

        ro.printInteger(3);
    }
}
