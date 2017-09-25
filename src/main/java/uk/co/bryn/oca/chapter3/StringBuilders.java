package uk.co.bryn.oca.chapter3;

/**
 * @author david.stevenson
 */
public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuffer stringBuffer = new StringBuffer();

        String s = "";
        s.length();

        sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

    }
}
