package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Account;
import inheritance_polymorphism.entities.BusinessAccount;
import inheritance_polymorphism.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Program02 {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();
        //adding accounts in the list
        list.add(new SavingAccount(1023, "Jonas", 500.00,100.00));
        list.add(new BusinessAccount(1022, "Pedro", 500.00, 100.00));
        double sum = 0.0;

        for(Account ac : list){
            sum += ac.getBalance();
        }
        for(Account ac : list){
            ac.deposit(10.0);
        }
        for(Account ac : list){
            System.out.printf("Sum of balance with tax: %.2f\n",ac.getBalance());
        }
        System.out.printf("Sum of balance: %.2f", sum);
    }
}
