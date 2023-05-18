package lec07;

import org.jetbrains.annotations.NotNull;

public class Lec07Main {
    public static void main(String[] args) {
    }

    private int parseIntThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(String.format("주어진 문자열 %s 는 문자열이 아닙니다", str));
        }
    }
}
