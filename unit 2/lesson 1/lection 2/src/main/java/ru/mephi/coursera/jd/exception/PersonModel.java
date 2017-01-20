package ru.mephi.coursera.jd.exception;

public class PersonModel {

    private final String name;
    private final int age;

    public PersonModel(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonModel [name=" + name + ", age=" + age + "]";
    }

}
