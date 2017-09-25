package uk.co.bryn.oca.chapter4.protectedaccess.packageD;

import uk.co.bryn.oca.chapter4.protectedaccess.packageA.ParentClassWithProtectedMethod;
import uk.co.bryn.oca.chapter4.protectedaccess.packageB.ChildClass;
import uk.co.bryn.oca.chapter4.protectedaccess.packageC.GrandchildClass;

/**
 * @author david.stevenson
 */
public class UnrelatedClassInDifferentPackage {

    public static void main(String... args) {

        /*
        None of these work as the containing class is not related, nor is it in the same package
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ParentClassWithProtectedMethod();
//        System.out.println(parentClassWithProtectedMethod.getTitle());

        ChildClass childClass = new ChildClass();
//        System.out.println(childClass.getTitle());

        GrandchildClass grandchildClass = new GrandchildClass();
//        System.out.println(grandchildClass.getTitle());
    }
}
