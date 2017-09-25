package uk.co.bryn.oca.chapter4.lambdas.domain.builder;

import uk.co.bryn.oca.chapter4.lambdas.domain.Person;
import uk.co.bryn.oca.chapter4.lambdas.domain.Person.Gender;

/**
 * @author david.stevenson
 */
public final class PersonBuilder {
    private String forename;
    private String surname;
    private int age;
    private Gender gender;
    private String email;
    private String phone;
    private String address;

    private PersonBuilder() {
    }

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withForename(String forename) {
        this.forename = forename;
        return this;
    }

    public PersonBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setForename(forename);
        person.setSurname(surname);
        person.setAge(age);
        person.setGender(gender);
        person.setEmail(email);
        person.setPhone(phone);
        person.setAddress(address);
        return person;
    }
}
