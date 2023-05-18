package lec06;

import java.util.Arrays;
import java.util.List;

public class Lec06Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
