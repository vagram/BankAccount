import java.time.LocalDate;
import java.util.Locale;

public class Main extends BankAccount{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.put(100);
        bankAccount.take(10);
        //System.out.println(bankAccount.getMoneyAmount());
        CardAccount cardAccount = new CardAccount();
        cardAccount.put(100);
        cardAccount.take(100);
        //System.out.println(cardAccount.getMoneyAmount());
        DepositAccount depositAccount = new DepositAccount(100);
        depositAccount.take(10);
        depositAccount.put(20);
        depositAccount.take(10);
        System.out.println(depositAccount.getMoneyAmount());
    }
}
