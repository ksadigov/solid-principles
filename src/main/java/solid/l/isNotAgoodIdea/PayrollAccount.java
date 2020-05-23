package solid.l.isNotAgoodIdea;

/**
 *  A payroll account has no income, it is only for receiving a salary.
 */
public class PayrollAccount extends CommonBankAccount {

    public void income() throws Exception {
        throw new Exception("This account has no income");
    }
}
