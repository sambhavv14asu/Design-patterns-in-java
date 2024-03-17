package Facade;

import java.util.ArrayList;
import java.util.List;

public class AccountNumberCheck {
    private List<Integer> codes = new ArrayList<>();
    public AccountNumberCheck(){
        codes.add(123456789);
        codes.add(123456);
    }
    public boolean isAccoundNumberValid(int code){
        return codes.contains(code);
    }
}
