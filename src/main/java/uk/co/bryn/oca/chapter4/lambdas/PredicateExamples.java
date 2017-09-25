package uk.co.bryn.oca.chapter4.lambdas;

import java.util.List;
import java.util.function.Predicate;

import uk.co.bryn.oca.chapter4.lambdas.domain.Person;
import uk.co.bryn.oca.chapter4.lambdas.domain.PersonFixtures;

/**
 * @author david.stevenson
 */
public class PredicateExamples {

    public static void print(List<Person> personList, Predicate<Person> predicate) {
        for (Person p : personList) {
            if (predicate.test(p)) {
                System.out.println(p.getForename() + " " + p.getSurname());
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = PersonFixtures.createPersonList();

        Predicate<Person> allDrinkers = p -> p.getAge() >= 18;
        Predicate<Person> allFemales = (p) -> p.getGender().equals(Person.Gender.FEMALE);
        Predicate<Person> allAlliterative = (Person p) -> {return p.getSurname().startsWith(p.getForename().substring(0, 1)); };

        System.out.println("");
        System.out.println("printDrinkers");
        print(personList, allDrinkers);
        System.out.println("");
        System.out.println("printFemales");
        print(personList, allFemales);
        System.out.println("");
        System.out.println("printAlliterative");
        print(personList, allAlliterative);

    }
}
