package uk.co.bryn.oca.chapter4.immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author david.stevenson
 */
public final class ImmutableExample {

    private final List<String> strings;

    private ImmutableExample(List<String> strings) {
        this.strings = strings;
    }

    public static ImmutableExample getInstance(List<String> list) {
        return new ImmutableExample(list);    }

    /**
     * ArrayList is mutable so return a defensive copy to prevent calling code changing our internal list
     * @return
     */
    public List<String> getStrings() {
        return new ArrayList<>(strings);
    }
}
