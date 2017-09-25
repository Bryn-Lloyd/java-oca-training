package uk.co.bryn.oca.chapter4.protectedaccess.packageB;

import uk.co.bryn.oca.chapter4.protectedaccess.packageA.ParentClassWithProtectedMethod;
import uk.co.bryn.oca.chapter4.protectedaccess.packageC.GrandchildClass;

/**
 * @author david.stevenson
 */
public class ChildClassOverridingMethod extends ParentClassWithProtectedMethod {

    {
        getTitle();
    }

    /**
     * Protected method
     *
     * @return the title
     */
    @Override
    protected String getTitle() {
        return super.getTitle();
    }

    public static void main(String[] args) {

        /*
        Works because the reference type (ChildClassOverridingMethod) is the same type as the containing class (ChildClassOverridingMethod)
         */
        ChildClassOverridingMethod childClass = new ChildClassOverridingMethod();
        System.out.println(childClass.getTitle());

        /*
        DOES NOT WORK as GrandchildClass is not a sub-class of this one
         */
        GrandchildClass grandchildClass = new GrandchildClass();
//        System.out.println(grandchildClass.getTitle());

        /*
        DOES NOT WORK as the reference type (ParentClassWithProtectedMethod) is neither the same type nor a sub-type of the containing
        class (ChildClass)
         */
        ParentClassWithProtectedMethod parentClassWithProtectedMethod = new ChildClassOverridingMethod();
//        System.out.println(parentClassWithProtectedMethod.getTitle());
    }
}
