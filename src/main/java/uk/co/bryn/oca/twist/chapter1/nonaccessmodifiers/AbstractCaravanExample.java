package uk.co.bryn.oca.twist.chapter1.nonaccessmodifiers;

abstract class AbstractCaravanExample {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();   // an abstract method (not, this requires the class to be abstract)
    public abstract void changeColor();
}
