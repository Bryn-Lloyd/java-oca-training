package uk.co.bryn.oca.chapter4.protectedaccess.packageA;

import uk.co.bryn.oca.chapter4.protectedaccess.packageB.ChildClass;
import uk.co.bryn.oca.chapter4.protectedaccess.packageB.ChildClassOverridingMethod;
import uk.co.bryn.oca.chapter4.protectedaccess.packageC.GrandchildClass;

/**
 * @author david.stevenson
 */
public class UnrelatedClassInSamePackageAsParent {

    public static void main(String[] args) {

        /*
        Works because the protected method declaration is in the same package as this containing class
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ParentClassWithProtectedMethod();
        System.out.println(parentClassWithProtectedMethod.getTitle());

        /*
        Works because the protected method declaration is in the same package as this containing class
         */
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.getTitle());

        /*
        DOES NOT WORK because the getTitle() method is overridden and the implementation is in a different package to this one
         */
        ChildClassOverridingMethod childClassOverridingMethod = new ChildClassOverridingMethod();
//        System.out.println(childClassOverridingMethod.getTitle());

        /*
        Works because the protected method declaration is in the same package as this containing class
         */
        GrandchildClass grandchildClass = new GrandchildClass();
        System.out.println(grandchildClass.getTitle());
    }
}
