package uk.co.bryn.oca.chapter4.lambdas;

import java.util.List;

import uk.co.bryn.oca.chapter4.lambdas.domain.Person;
import uk.co.bryn.oca.chapter4.lambdas.domain.PersonFixtures;

/**
 * @author david.stevenson
 */
public class MoreLambdaExamples {

    public static void printAll(List<Person> personList, Printer printer) {
        for (Person p : personList) {
            System.out.println(printer.print(p.getForename(), p.getSurname()));
        }
    }

    public static void main(String[] args) {
        List<Person> personList = PersonFixtures.createPersonList();

        // create as anonymous inner class
        printAll(personList, new Printer() {
            @Override
            public String print(Object... values) {
                StringBuilder sb = new StringBuilder();
                for (Object o : values) {
                    sb.append(o).append(" ");
                }
                return sb.toString();
            }
        });

        // create as a lambda
        printAll(personList, values -> {
            StringBuilder sb = new StringBuilder();
            for (Object o : values) {
                sb.append(o).append(" ");
            }
            return sb.toString();
        });

    }
}

interface Printer {

    String print(Object... values);

}
