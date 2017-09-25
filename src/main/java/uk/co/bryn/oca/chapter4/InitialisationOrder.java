package uk.co.bryn.oca.chapter4;

/**
 * @author david.stevenson
 */
public class InitialisationOrder {
    static {
        print(1);
    }

    {
        print(2);
    }

    public InitialisationOrder() {
        print(3);
    }

    {
        print(4);
    }

    static {
        print(5);
    }

    public static void main(String[] args) {
        new InitialisationOrder();
    }

    private static void print(int i) {
        System.out.print(i + " ");
    }
}
