package uk.co.bryn.oca.twist.chapter1.nonaccessmodifiers;

public class StaticInstanceCounterExample {

    private static int numInstances = 0;

    protected static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    StaticInstanceCounterExample() {
        StaticInstanceCounterExample.addInstance();
    }

    public static void main(String[] args) {

        System.out.println("Starting with " + StaticInstanceCounterExample.getCount() + " instances");

        for (int i = 0; i < 500; ++i) {
            new StaticInstanceCounterExample();
        }

        System.out.println("Created " + StaticInstanceCounterExample.getCount() + " instances");

    }
}
