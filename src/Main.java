import Observer.StockObserver;
import Observer.StockUpdater;
import state.ATMMachine;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        MotorVehicle vehicle = MotorVehicleFactory.createInstance("car");
//        vehicle.build();

//        Phone p = new PhoneBuilder().setOs("IOS").setProcessor("Intel").getPhone();
//        System.out.println(p);
//        Phone p = new IPhoneAdapter();
//        ScreenDisplay display = new ScreenDisplay();
//        display.setP(p);
//        display.show("Hello");
//        BankSystem s = new BankSystem(123,123456789);
//        s.withdrawMoney(500);
//        s.depositCash(200);
//        s.withdrawMoney(600);
//        ParkingLot p =new ParkingLot();
//        p.enter(1,"Car",new Date());
//        p.exit(5,"Credit","automated");
//        StockUpdater u = new StockUpdater();
//        StockObserver observer1 = new StockObserver(u,1);
//        u.setStock1price(5);
//        u.setStock2price(10);
//        StockObserver observer2 = new StockObserver(u,2);
//        u.setStock1price(20);
//        u.setStock3price(5);

        ATMMachine machine = new ATMMachine();
        machine.ejectCard();

        machine.insertCard();
        machine.enterPin(1234);
        machine.withdrawCash(1500);
        machine.insertCard();
        machine.enterPin(1234);
        machine.withdrawCash(500);





    }
}