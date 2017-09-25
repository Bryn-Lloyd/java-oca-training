package uk.co.bryn.oca.chapter5.constructors.inheritance;

/**
 * @author david.stevenson
 */
public abstract class Guardian {

    private int age;
    private Gender gender;

    public Guardian() {
        System.out.println("In Parent()");
    }

    public Guardian(int age) {
        this.age = age;
        System.out.println("In Parent(age)");
    }

    public Guardian(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    protected String getName() {
        return "parent";
    }

    protected enum Gender {
        MALE,
        FEMALE;
    }

}
