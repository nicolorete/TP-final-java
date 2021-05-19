package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; /// library for cursor

import java.util.HashMap;
import javax.swing.*;

public class Login implements ActionListener {
    JFrame jFrame= new JFrame();
    JButton jButton

    HashMap<String, String> loginInfo= new HashMap<String, String>();
    Login(HashMap<String, String> loginInfoOriginal){

        loginInfo= loginInfoOriginal;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
