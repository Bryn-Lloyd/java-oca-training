package uk.co.bryn.oca.misc;

import java.util.ArrayList;

public class StackOverflowExamples {
    public static void main(String[] args) {
        String a = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase>else.<upcase>dsadsa</upcase>";
        String upcaseStart = "<upcase>";
        String upcaseEnd = "</upcase>";
        ArrayList<String> allSubString = new ArrayList<>();
        int startIndex = a.indexOf(upcaseStart);
        int endIndex = a.indexOf(upcaseEnd);
        while (startIndex != -1 && endIndex != -1) {
//            System.out.println(a.substring(a.indexOf(upcaseStart, startIndex)));
//            System.out.println(a.substring(a.indexOf(upcaseEnd, endIndex)));
            String subString = a.substring(a.indexOf(upcaseStart, startIndex) + 8, a.indexOf(upcaseEnd, endIndex));
            System.out.println(subString);
            allSubString.add(subString);
            startIndex = a.indexOf(upcaseStart, endIndex);
            endIndex = a.indexOf(upcaseEnd, startIndex);
        }
    }
}
