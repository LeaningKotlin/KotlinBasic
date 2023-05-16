package lec01;

import java.util.Arrays;
import java.util.List;

public class Lec01Main {
    public static void main(String[] args) {
        long num1 = 10L;
        final long num2  = 10L;

        Long num3 = 1_000L;
        Person person = new Person("김장필");

        final List<Integer> list = Arrays.asList(1, 2);
        list.add(1); // 객체가 final이라도 엘리먼트는 추가 가능
    }
}
