package state;

public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;


    ATMState hasPin;
    ATMState noCash;

    ATMState atmState;

    int cash = 2000;
    boolean correctPin = false;

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasPin;
    }

    public ATMState getNoCash() {
        return noCash;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public int getCash() {
        return cash;
    }

    public boolean isCorrectPin() {
        return correctPin;
    }


    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasPin = new HasPin(this);
        noCash = new NoCash(this);

        atmState = noCard;
    }

    public void setATMState(ATMState newATMState){
        atmState = newATMState;
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void withdrawCash(int cash){
        atmState.withdrawCash(cash);
    }

    public void enterPin(int pin){
        atmState.enterPin(pin);
    }

}
