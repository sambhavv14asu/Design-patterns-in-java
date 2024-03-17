package Singleton;

public class Example {

    public static void main(String[] args){
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s.setVal(5);
        System.out.println(s.getVal());
        System.out.println(s2.getVal());
    }
}

class Singleton{
    private static Singleton instance;
    private int val=0;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance =  new Singleton();
        }
        return instance;
    }
    public void setVal(int val){
        this.val=val;
    }

    public int getVal(){
        return this.val;
    }
}
