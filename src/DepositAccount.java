import java.time.LocalDate;
import java.util.Scanner;

public class DepositAccount extends BankAccount {
    private LocalDate localDate = null;
    public DepositAccount() {
    }

    public DepositAccount(double moneyAmount) {
        super(moneyAmount);
    }

    @Override
    public void put(double deposit) {
        localDate = LocalDate.now();
        super.put(deposit);
    }

    @Override
    public void take(double credit) {
        if (localDate == null || !localDate.plusDays(30).isAfter(LocalDate.now())) {
            super.take(credit);
            return;
        }
        System.out.println("Месяц не завершен!");

    }
}


