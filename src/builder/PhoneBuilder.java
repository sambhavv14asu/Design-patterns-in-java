package builder;

public class PhoneBuilder {

    private String os;
    private double screenSize;
    private int ram;
    private String processor;

    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os, screenSize, ram, processor);
    }
}
