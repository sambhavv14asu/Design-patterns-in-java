package factory;

public class MotorVehicleFactory {
    public static MotorVehicle createInstance(String type){
        if(type.equals("car")){
            return new Car();
        }else{
            return new Motorcycle();
        }
    }
}
