package uk.co.bryn.oca.chapter4.protectedaccess.packageC;

import uk.co.bryn.oca.chapter4.protectedaccess.packageA.ParentClassWithProtectedMethod;
import uk.co.bryn.oca.chapter4.protectedaccess.packageB.ChildClass;

/**
 * @author david.stevenson
 */
public class GrandchildClass extends ChildClass {

    {
        getTitle();
    }

    public static void main(String[] args) {

        /*
        Works because the reference type (GrandchildClass) is the same type as the containing class (GrandchildClass)
         */
        GrandchildClass grandchildClass = new GrandchildClass();
        System.out.println(grandchildClass.getTitle());

        /*
        DOES NOT WORK as the reference type is neither the same type nor a sub-type of the containing class
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ParentClassWithProtectedMethod();
//        System.out.println(parentClassWithProtectedMethod.getTitle());

        /*
        DOES NOT WORK as the reference type is neither the same type nor a sub-type of the containing class
         */
        ChildClass childClass = new ChildClass();
//        System.out.println(childClass.getTitle());
    }
}
