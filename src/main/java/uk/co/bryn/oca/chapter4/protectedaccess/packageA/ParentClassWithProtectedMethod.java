package uk.co.bryn.oca.chapter4.protectedaccess.packageA;

import uk.co.bryn.oca.chapter4.protectedaccess.packageB.ChildClass;
import uk.co.bryn.oca.chapter4.protectedaccess.packageC.GrandchildClass;

/**
 * @author david.stevenson
 */
public class ParentClassWithProtectedMethod {

    /**
     * Protected method
     * @return the title
     */
    protected String getTitle() {
        return "This is ParentClassWithProtectedMethod";
    }

    public static void main(String[] args) {
        /*
        Works because the reference type (ParentClassWithProtectedMethod) is the same type as the containing class
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ParentClassWithProtectedMethod();
        System.out.println(parentClassWithProtectedMethod.getTitle());

        /*
        Works because the reference type (ChildClass) is a sub-class of the containing class
         */
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.getTitle());

        /*
        Works because the reference type (GrandchildClass) is a sub-class of the containing class
         */
        GrandchildClass grandchildClass = new GrandchildClass();
        System.out.println(grandchildClass.getTitle());
    }

}
