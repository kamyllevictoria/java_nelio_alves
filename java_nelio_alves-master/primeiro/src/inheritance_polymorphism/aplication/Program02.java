package inheritance_polymorphism.aplication;

import inheritance_polymorphism.entities.Account;
import inheritance_polymorphism.entities.BusinessAccount;
import inheritance_polymorphism.entities.SavingAccount;

public class Program02 {
    public static void main(String[] args) {

        Account acc1 = new Account(1010, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1011,"Pedro", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1012, "Lucas", 1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
