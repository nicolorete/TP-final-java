package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gjson {

    public Gjson() {

    }




    public static List<Client> gson() {
        List<Client> clients= new ArrayList<Client>();
        Client client = new Client("German", "Oyarzo", 36384624, "Las heras", "german@hotmail.com", 22359393, "Eventual");
        Client client2= new Client("Pepe", "Argento", 1034889348, "Mexico 1223", "pepeargento@gmail.com", 22233333, "Eventual");

        clients.add(client);
        clients.add(client2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); /// create a gson to print better


        ///----- safe in a file---------------------

        BufferedWriter fWriter = null;

        try {
            /// open file

            fWriter = new BufferedWriter(new FileWriter(new File("personas.json")));
            for (Client cli : clients) {
                gson.toJson(cli, cli.getClass(), fWriter);

                System.out.println("--------------------------------------");
                System.out.println(cli);
                System.out.println("--------------------------------------");
            }




        } catch (IOException e) {  // put an exception
            System.out.println("Se produjo un error " + e.getMessage());
        } finally {
            if (fWriter != null) {
                try {
                fWriter.close();///we have to close the file to be sure that all information is going to be safe

                } catch (IOException e) {
                e.printStackTrace();

               // String JsonClient = gson.toJson(client1); /// convierto un objeto a string, lo guardo en un archivo
                ///System.out.println("json: " + client1);
                ///Client newClient = gson.fromJson(JsonClient, Client.class); ///convertimos el string en una clase
                //System.out.println(newClient);
                ///gson.toJson(client1, writeFile());
                // client1.setName("German ");
                //client1.setLastName("Oyarzo");
                }

            }

        }


        return clients;
    }

    ///TODO
    ///---------------------READ A FILE------------------------------------------------------------
    public static void readFile( ){


        if(!new File("personas.json").exists()){/// if doesnt exists the file it will go out the funtion

            return;
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        BufferedReader fReader = null;

        List<Client> clients;
        try{
            fReader = new BufferedReader(new FileReader(new File("personas.json")));
            clients = gson.fromJson(fReader, (new TypeToken<List<Client>>() {}.getType()));


            //String linea = null;


            for(var cli : clients)
            {


                System.out.println("--------------------------------------");
                System.out.println(cli);
                System.out.println("--------------------------------------");
            }


            //while((linea = fReader.readLine())!= null){
              //  System.out.println(linea);
            //}

        }catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            /// close the file
            if(fReader!= null){
                try{
                    fReader.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }

    }
}