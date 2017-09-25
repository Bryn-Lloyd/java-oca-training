package uk.co.bryn.oca.chapter2.statements;

/**
 * @author david.stevenson
 */
public class SwitchExamples {

    public static void main(String[] args) {

        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 5:
                System.out.println("Friday");
//                break;
            default:
                System.out.println("Default");
            case 6:
                System.out.println("Saturday");
                break;
        }

        int y = 100;
        int x = 2;
        switch (x) {
            case 1:
                y++; // Note - intentional fall-through
            case 2: {
                y++;
            } ; // Blocks
            default:
                y++;
                break;
        }
        System.out.println(y);

    }
}
