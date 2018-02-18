package uk.co.bryn.oca.chapter1;

public class GarbageCollection {
    public static void main(String[] args) {
        Object a = null;
        Object b  = a;

        a = new String("abc");
        System.out.println(b);
    }
}
