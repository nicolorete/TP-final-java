package com.company;

import javax.swing.*;
import java.io.*;
import com.google.gson.Gson;
<<<<<<< HEAD
=======

>>>>>>> 90c7711 (tercer commit)

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD


        String[] options = {"Ingresar", "Registrarse"};
        //ImageIcon icon = new ImageIcon("D:/2 º año 1º cuatrimestre Programacion/TPFINAL/src/images.png");
        ImageIcon icon = new ImageIcon("C:/Users/User/OneDrive/Documentos/2 año 1º cuatri/lab 3/TPFINAL/src/images.png");
        String n = (String)JOptionPane.showInputDialog(null, "Ingrese una opcion",
                "TURNOS ", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        System.out.println(n);


    }

    public static void gson(){
        Client client1 = new Client();
        client1.setName("German ");

=======
        Login menu = new Login ();
        Login.menuLogin();


    }


    public static void gson(){
        Client client1 = new Client();
        client1.setName("German ");

>>>>>>> 90c7711 (tercer commit)


    }

}
