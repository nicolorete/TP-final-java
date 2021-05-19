package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        IdAndPassword idAndPassword= new IdAndPassword();

        Login login= new Login(idAndPassword.getLoginInfo());


    }

}
