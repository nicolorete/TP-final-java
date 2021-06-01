package com.company;


import java.io.*;
import javax.swing.*;
import java.util.List;

public class Login  {

    List <Client> clients;


    public static void menuLogin()
    {
        String[] options = {"Ingresar", "Registrarse"};
        ImageIcon icon = new ImageIcon("D:/2 º año 1º cuatrimestre Programacion/TPFINAL/src/images.png");
        String n = (String)JOptionPane.showInputDialog(null, "Ingrese una opcion",
                "TURNOS ", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        System.out.println(n);
    }



}
