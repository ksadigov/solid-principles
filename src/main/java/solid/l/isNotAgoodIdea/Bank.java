package solid.l.isNotAgoodIdea;

import java.util.ArrayList;
import java.util.List;

/**
 * If we were to try to access the income() method of all bank accounts in a loop, for example,
 * and one of them is a PayrollAccount, our application doesn’t work, because for any payroll account an exception is thrown.
 */
public class Bank {

    public static void main(String[] args) {
        List<CommonBankAccount> accountsList = new ArrayList<>();
        accountsList.add(new CommonBankAccount());
        accountsList.add(new PayrollAccount());

        for (CommonBankAccount account : accountsList) {
//            account.income();

            System.out.println("New balance:");
            System.out.println(account.getBalance());
        }
    }
}
