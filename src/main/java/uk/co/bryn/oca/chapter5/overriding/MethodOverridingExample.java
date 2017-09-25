package uk.co.bryn.oca.chapter5.overriding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarInputStream;

/**
 * @author david.stevenson
 */

public class MethodOverridingExample {
}

class Parent {

    /**
     * Parent definition - specifies a return type of InputStream and throws an IOException
     *
     * @return an InputStream
     * @throws IOException
     */
    protected InputStream getInputStream() throws IOException {
        return new JarInputStream(new FileInputStream("test.jar"));
    }

}

class Child extends Parent {

    /**
     * Child definition - returns a FileInputStream (which is a sub-class of InputStream), and throws a FileNotFoundException (which is a
     * sub-type of IOException). Is marked public which is broader than parent access of protected
     *
     * @return a FileInputStream (which is a sub-class of InputStream)
     * @throws FileNotFoundException (which is a sub-type of IOException)
     */
    @Override
    public FileInputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream("fileName");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        try {
            // Call to parent expects an InputStream and checks for an IOException
            InputStream is = parent.getInputStream();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Child child = new Child();
        try {
            // Call to child also expects an InputStream and checks for an IOException
            // We couldn't do this if the return type wasn't co-variant and the Exception wasn't a sub-type
            InputStream is = child.getInputStream();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
