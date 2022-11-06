public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 1100;

        int bonus;
        int summa;

        if (amount > 1000) {
            bonus = amount / 100;
            summa = bonus + balance + amount;
        } else {
            summa = balance + amount;
        }

        System.out.println("Итоговый баланс на счету " + summa + " рублей");
    }
}
