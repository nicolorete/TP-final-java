package com.company;
import java.util.HashMap;

public class IdAndPassword {

    HashMap<String, String> loginInfo= new HashMap<>();

    IdAndPassword(){
        loginInfo.put("Cliente", "regular");
        loginInfo.put("germanoyarzo", "Paswword");
        loginInfo.put("usuario", "abc1234");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
