package state;

public class NoCard implements ATMState{
    ATMMachine atmMachine;

    public NoCard(ATMMachine machine){
        this.atmMachine = machine;
    }
    @Override
    public void insertCard() {
        System.out.println("Card inserted successfully");
        atmMachine.setATMState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card is present in the machine");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Need to enter card to enter pin");
    }

    @Override
    public void withdrawCash(int cash) {
        System.out.println("Need to enter card to withdraw cash");
    }
}
