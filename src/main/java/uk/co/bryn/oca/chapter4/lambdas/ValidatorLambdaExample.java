package uk.co.bryn.oca.chapter4.lambdas;

/**
 * @author david.stevenson
 */
public class ValidatorLambdaExample {

    public static void main(String[] args) {
        String s = "";

        callValidator(s, new ValidatorImpl());

        callValidator(s, new Validator() {
            @Override
            public boolean validate(String s) {
                return s != null && s.length() > 0;
            }
        });

        callValidator(s, (String s1) ->  {return s1 != null;});
    }

    private static void callValidator(String s, Validator validator) {
        System.out.println("Valid = " + validator.validate(s));
    }
}

interface Validator {
    boolean validate(String s);
}

class ValidatorImpl implements Validator {

    @Override
    public boolean validate(String s) {
        return s != null;
    }
}