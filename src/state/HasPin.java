package state;

public class HasPin implements ATMState{
    ATMMachine atmMachine;

    public HasPin(ATMMachine machine){
        this.atmMachine = machine;
    }
    @Override
    public void insertCard() {
        System.out.println("Card is already present in the machine");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected successfully");
        atmMachine.setATMState(atmMachine.getNoCard());
    }

    @Override
    public void enterPin(int pin) {

            System.out.println("Pin has already been entered");


    }

    @Override
    public void withdrawCash(int cash) {
        if(atmMachine.cash<cash){
            System.out.println("Not enough balance to withdraw this amount");
            atmMachine.setATMState(atmMachine.getNoCard());
        }else{
            System.out.println(cash+" has been successfully withdrawn from the account and card ejected");
            atmMachine.cash = atmMachine.cash - cash;
            atmMachine.setATMState(atmMachine.getNoCard());
        }
        if(atmMachine.cash == 0){
            atmMachine.setATMState(atmMachine.getNoCash());
        }
    }
}
