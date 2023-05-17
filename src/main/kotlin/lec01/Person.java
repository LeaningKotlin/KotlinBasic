package lec01;

import org.jetbrains.annotations.Nullable;

public class Person {
    private String name;

    @Nullable
    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}
