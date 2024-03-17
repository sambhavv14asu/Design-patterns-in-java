package adapter;

public class ScreenDisplay {
    Phone p;

    public Phone getP() {
        return p;
    }

    public void setP(Phone p) {
        this.p = p;
    }

    public void show(String str){
        p.show(str);
    }
}
