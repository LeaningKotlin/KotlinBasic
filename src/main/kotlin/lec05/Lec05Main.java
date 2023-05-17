package lec05;

public class Lec05Main {
    public static void main(String[] args) {
    }

    private void validateScoreIsNotNegative(int score) {
        if (score < 0)
            throw new IllegalArgumentException(String.format("%s는 0 보다 작을 수 없습니다.", score));
    }

    private void validate(int score) {
        if (score >= 0 && score <= 100)
            System.out.println(score);
    }
}
