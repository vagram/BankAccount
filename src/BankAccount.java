import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    private double moneyAmount;

    public BankAccount(){

    }

    public BankAccount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }
    public void put(double deposit){
        if (deposit < 0){
            System.out.println("Нельзя поплнить на отрицательное значение!");
            return;
        }
        moneyAmount = moneyAmount + deposit;

    }
    public void take(double credit){
        if (credit > moneyAmount){
            System.out.println("Нельзя снять на отрицательное значение!");
            return;
        }
        moneyAmount = moneyAmount - credit;

    }
}
