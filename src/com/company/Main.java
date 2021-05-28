package com.company;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import static com.company.Gjson.gson;
import static com.company.Gjson.readFile;


public class Main {

    public static void main(String[] args) {

        Login menu = new Login ();
        Login.menuLogin();
        //Client client = new Client("German", "Oyarzo", 36384624, "Las heras", "german@hotmail.com", 22359393, "Eventual");
        //Client client2= new Client("Pepe", "Argento", 1034889348, "Mexico 1223", "pepeargento@gmail.com", 22233333, "Eventual");
        ///List<Client> clients;

        //traerClient();
        //gson();
        readFile();







    }

    /*public static List<Client> traerClient(){ /// guarda todos los clientes
        List<Client> clients= new ArrayList<Client>();

        Client client = new Client("German", "Oyarzo", 36384624, "Las heras", "german@hotmail.com", 22359393, "Eventual");

        clients.add(client);



        Client client2 = new Client("Pepe", "Argento", 1034889348, "Mexico 1223", "pepeargento@gmail.com", 22233333, "Eventual");

        clients.add(client2);


        gson(client);
        gson(client2);


        return clients;
    }*/


}
