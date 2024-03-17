package state;

public class HasCard implements ATMState{

    ATMMachine atmMachine;

    public HasCard(ATMMachine machine){
        this.atmMachine = machine;
    }
    @Override
    public void insertCard() {
        System.out.println("Multiple cards cannot be inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected successfully");
        atmMachine.setATMState(atmMachine.getNoCard());
    }

    /**
     *
     * Write lock  read xx write xx
     * Read lock read ho skata hai write xxx
     * @param pin
     */

    @Override
    public void enterPin(int pin) {
        if(pin == 1234){
            System.out.println("Pin is correct");
            atmMachine.correctPin = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        }else{
            System.out.println("Incorrect pin, card ejected");
            atmMachine.setATMState(atmMachine.getNoCard());
        }
    }

    @Override
    public void withdrawCash(int cash) {
        System.out.println("Need to type in pin to withdraw cash");
    }
}
