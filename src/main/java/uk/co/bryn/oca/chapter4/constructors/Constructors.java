package uk.co.bryn.oca.chapter4.constructors;

/**
 * @author david.stevenson
 */
public class Constructors {

    private final int count;

    public Constructors() {
        this(6);
    }

    public Constructors(int count) {
        this.count = count;
    }

    public Constructors(String intAsString) {
        this(Integer.parseInt(intAsString));
    }
}
