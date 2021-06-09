package com.company;
import com.google.gson.Gson;

import java.util.Scanner;

import static com.company.Gjson.readFile;

public class Administrador extends Person{


    public Administrador() {

    }

    public Administrador(String name, String lastName, String dni, String adress, String email, int celphone) {
        super(name, lastName, dni, adress, email, celphone);
    }


    public void showClients(String nameFile)
    {
        System.out.println("Show all clients");
        readFile(nameFile);
    }



    @Override
    public String toString() {
        return "Administrador{ "+ super.toString() + "}";
    }


}
