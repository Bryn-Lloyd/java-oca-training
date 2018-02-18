package uk.co.bryn.oca.chapter1.codeblocks;

public class CodeBlocksExample {

    {
        System.out.println("Class initialiser");
//        double d = -1.9;
//        float f = (float) d;
//        int i = (int) f;
//        System.out.println(i);
    }

    private CodeBlocksExample() {
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {

        new CodeBlocksExample();

        System.out.println("Method body");
        {
            System.out.println("Method code block");
        }
    }
}
