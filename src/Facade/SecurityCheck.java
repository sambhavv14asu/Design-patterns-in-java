package Facade;

import java.util.ArrayList;
import java.util.List;

public class SecurityCheck {
    private List<Integer> codes = new ArrayList<>();
    public SecurityCheck(){
        codes.add(123);
        codes.add(1234);
    }
    public boolean isSecCodeValid(int code){
        return codes.contains(code);
    }
}
