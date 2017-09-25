package uk.co.bryn.oca.chapter3;

/**
 * @author david.stevenson
 */
public class Strings {

    public void changeArguments(String s, int i, StringBuilder sb) {
        s += "anything";
        i++;
        sb.append("text");

        System.out.println(s + i + sb.toString());
    }


    public static void main(String[] args) {

        Strings strings = new Strings();

        String string = "";
        int j = 0;
        StringBuilder sb1 = new StringBuilder("string builder");
        strings.changeArguments(string, j, sb1);

        System.out.println(string + j + sb1.toString());
    }
}
