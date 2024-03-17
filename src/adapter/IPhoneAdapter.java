package adapter;

public class IPhoneAdapter implements Phone{

    IPhone i = new IPhone();

    @Override
    public void show(String str) {
        i.show(str);
    }
}
