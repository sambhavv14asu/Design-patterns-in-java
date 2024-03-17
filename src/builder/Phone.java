package builder;

public class Phone {
    private String os;
    private double screenSize;
    private int ram;
    private String processor;

    public Phone(String os, double screenSize, int ram, String processor) {
        this.os = os;
        this.screenSize = screenSize;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone OS = "+os+" ,screensize = "+screenSize+" ,ram = "+ram+" ,processor = "+processor;
    }
}
