package uk.co.bryn.oca.chapter4.protectedaccess.packageB;

import uk.co.bryn.oca.chapter4.protectedaccess.packageA.ParentClassWithProtectedMethod;

/**
 * @author david.stevenson
 */
public class UnrelatedClassInSamePackageAsChild {

    public static void main(String[] args) {

        /*
        DOES NOT WORK as the reference type is neither the same type nor a sub-type of the containing class
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ParentClassWithProtectedMethod();
//        System.out.println(parentClassWithProtectedMethod.getTitle());

        /*
        DOES NOT WORK because, even though we're in the same package as ChildClass, the protected method (getTitle()) is declared in
        ParentClassWithProtectedMethod which is in a different package to this one
         */
        ChildClass childClass = new ChildClass();
//        System.out.println(childClass.getTitle());

        /*
        Works because the getTitle() method is overridden in ChildClassOverridingMethod which is in the same package as this
         */
        ChildClassOverridingMethod childClassOverridingMethod = new ChildClassOverridingMethod();
        System.out.println(childClassOverridingMethod.getTitle());
    }
}
