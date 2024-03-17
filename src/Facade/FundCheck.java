package Facade;

public class FundCheck {
    private int balance = 1000;

    public void increaseAmount(int amnt){
        this.balance += amnt;
    }

    public void decreaseAmount(int amnt){
        this.balance -= amnt;
    }

    public void withdraw(int withdrawal){
        if(withdrawal > this.balance){
            System.out.println("Not enough balance since the current balance is "+balance);
            return;
        }
        this.decreaseAmount(withdrawal);
        System.out.println("Withdrawal successful, current balance is "+balance);
    }

    public void deposit(int amount){
        increaseAmount(amount);
        System.out.println("Deposit complete , current balance is "+balance);
    }
}
