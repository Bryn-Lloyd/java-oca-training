package uk.co.bryn.oca.chapter4.lambdas;

import java.util.List;

import uk.co.bryn.oca.chapter4.lambdas.domain.Person;
import uk.co.bryn.oca.chapter4.lambdas.domain.PersonFixtures;

/**
 * @author david.stevenson
 */
public class NonLambdasExamples {

    public static void printDrinkers(List<Person> personList) {
        for (Person p : personList) {
            if (p.getAge() >= 18) {
                System.out.println(p.getForename() + " " + p.getSurname());
            }
        }
    }

    public static void printFemales(List<Person> personList) {
        for (Person p : personList) {
            if (p.getGender().equals(Person.Gender.FEMALE)) {
                System.out.println(p.getForename() + " " + p.getSurname());
            }
        }
    }

    public static void printAlliterative(List<Person> personList) {
        for (Person p : personList) {
            if (p.getSurname().startsWith(p.getForename().substring(0, 1))) {
                System.out.println(p.getForename() + " " + p.getSurname());
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = PersonFixtures.createPersonList();

        System.out.println("");
        System.out.println("printDrinkers");
        printDrinkers(personList);
        System.out.println("");
        System.out.println("printFemales");
        printFemales(personList);
        System.out.println("");
        System.out.println("printAlliterative");
        printAlliterative(personList);
    }
}
