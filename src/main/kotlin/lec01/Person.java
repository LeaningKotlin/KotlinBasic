package lec01;

import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;
    private int age;

    @Nullable
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
