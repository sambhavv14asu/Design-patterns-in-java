package Facade;

public class BankSystem {

    private int secCode;
    private int accountNumber;

    WelcomeBank welcome;
    SecurityCheck secCheck;
    AccountNumberCheck accCheck;

    FundCheck fundCheck;

    public BankSystem(int secCode, int accountNumber){
        welcome = new WelcomeBank();
        this.secCode = secCode;
        this.accountNumber = accountNumber;
        secCheck = new SecurityCheck();
        accCheck = new AccountNumberCheck();
        fundCheck = new FundCheck();
    }
    public void withdrawMoney(int money) {
        if(!secCheck.isSecCodeValid(secCode) || !accCheck.isAccoundNumberValid(accountNumber)){
            System.out.println("Account number or security number invalid");
        }else{
            fundCheck.withdraw(money);
        }
    }

    public void depositCash(int money) {
        if(!secCheck.isSecCodeValid(secCode) || !accCheck.isAccoundNumberValid(accountNumber)){
            System.out.println("Account number or security number invalid");
        }else{
            fundCheck.deposit(money);
        }
    }

}
