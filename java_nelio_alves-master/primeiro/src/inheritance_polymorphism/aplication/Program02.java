package inheritance_polymorphism.aplication;

import inheritance_polymorphism.entities.Account;
//import inheritance_polymorphism.entities.BusinessAccount;
import inheritance_polymorphism.entities.SavingAccount;

public class Program02 {
    public static void main(String[] args) {

        Account x = new Account(1020, "Ana", 1000.0);
        Account y = new SavingAccount(1023, "Mary", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
