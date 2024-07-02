package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Account;
import inheritance_polymorphism.entities.BusinessAccount;
import inheritance_polymorphism.entities.SavingAccount;

public class Program01{
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();
        account.getBalance();
        Account acc = new Account(1001, "Pedro",1500.00);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0, 500.0);

        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "lucas",100.0,500.0);
        Account acc3 = new SavingAccount(1004,"Kamylle",100.0, 500.0);

        //downcasting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

         //a variavel acc3 foi instanciada como savingaccount, logo, nao podemos realizar a operação
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.getBalance();
            System.out.println("Update!");
        }


    }
}
