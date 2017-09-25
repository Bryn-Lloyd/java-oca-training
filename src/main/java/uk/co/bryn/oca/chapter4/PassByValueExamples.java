package uk.co.bryn.oca.chapter4;

/**
 * @author david.stevenson
 */
public class PassByValueExamples {

    public static void main(String[] args) {
        int i = 0;
        modifyInt(i);

        System.out.println(i);

        i = modifyInt(i);
        System.out.println(i);

        StringBuilder sb = new StringBuilder("false ");
        modifySB(sb);

        System.out.println(sb);

        String s1 = "false ";
        modifyString(s1);

        System.out.println(s1);
    }

    private static int modifyInt(int i) {
        i++;
        return i;
    }

    private static void modifySB(StringBuilder sb) {
//        sb = new StringBuilder("still false ");
        sb.append(true);
    }

    private static String modifyString(String s) {
        s += "true";
        return s;
    }
}
