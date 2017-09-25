package uk.co.bryn.oca.chapter4.lambdas.domain;

import java.util.ArrayList;
import java.util.List;

import uk.co.bryn.oca.chapter4.lambdas.domain.builder.PersonBuilder;

/**
 * @author david.stevenson
 */
public class PersonFixtures {

    public static List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();

        personList.add(PersonBuilder.aPerson()
                               .withForename("Arthur")
                               .withSurname("Arthurson")
                               .withAge(21)
                               .withGender(Person.Gender.MALE)
                               .withEmail("arthur@example.com")
                               .build());

        personList.add(PersonBuilder.aPerson()
                               .withForename("Betty")
                               .withSurname("Boo")
                               .withAge(25)
                               .withGender(Person.Gender.FEMALE)
                               .withEmail("betty@example.com")
                               .build());

        personList.add(PersonBuilder.aPerson()
                               .withForename("Charlie")
                               .withSurname("Drake")
                               .withAge(25)
                               .withGender(Person.Gender.MALE)
                               .withEmail("chaplie@example.com")
                               .build());


        return personList;
    }


}
