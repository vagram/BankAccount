import java.time.LocalDate;
import java.util.Scanner;

public class CardAccount extends BankAccount {
    public CardAccount() {
    }

    public CardAccount(double moneyAmount) {
        super(moneyAmount);
    }

    @Override
    public void take(double credit) {
        double commision = credit * 0.01;
        super.take(credit + commision);
    }
}
