package state;

public class NoCash implements ATMState{
    ATMMachine atmMachine;

    public NoCash(ATMMachine machine){
        this.atmMachine = machine;
    }
    @Override
    public void insertCard() {
        System.out.println("No cash in the account");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card is present in the machine and no cash in account");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No cash in the account");
    }

    @Override
    public void withdrawCash(int cash) {
        System.out.println("No cash in the account");
    }
}
