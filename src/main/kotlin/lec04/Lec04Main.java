package lec04;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);

        if (money1.compareTo(money2) > 0) {
            System.out.println("Money1 이 Money2 보다 큽니다.");
        }
    }
}
