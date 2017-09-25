package uk.co.bryn.oca.chapter4.protectedaccess.packageB;

import uk.co.bryn.oca.chapter4.protectedaccess.packageA.ParentClassWithProtectedMethod;
import uk.co.bryn.oca.chapter4.protectedaccess.packageC.GrandchildClass;

/**
 * @author david.stevenson
 */
public class ChildClass extends ParentClassWithProtectedMethod {

    {
        getTitle();
    }

    public static void main(String[] args) {

        /*
        Works because the reference type (ChildClass) is the same type as the containing class (ChildClass)
         */
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.getTitle());

        /*
        Works because the reference type (GrandchildClass) is a sub-class of the containing class (ChildClass)
         */
        GrandchildClass grandchildClass = new GrandchildClass();
        System.out.println(grandchildClass.getTitle());

        /*
        DOES NOT WORK as the reference type (ParentClassWithProtectedMethod) is neither the same type nor a sub-type of the containing
        class (ChildClass)
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ChildClass();
//        System.out.println(parentClassWithProtectedMethod.getTitle());
    }
}
