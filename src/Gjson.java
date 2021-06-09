package com.company;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.UUID;

public class Gjson {

    private List<Client> clients;

    public Gjson() {
        List<Client> clients = new ArrayList<Client>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }



    public static Client LoadClient() {

        Client client = new Client();

        String name, lastName, email, type;
        String adress;
        String dni;
        int celphone;
        UUID uuid;
        Scanner keyboard = new Scanner(System.in);// create a new object with the word "new"

        try {
            client.setId(UUID.randomUUID());

            System.out.println("Introduce your name");

            client.setName(name = keyboard.nextLine());
            System.out.println("Lastaname:");

            client.setLastName(lastName = keyboard.nextLine());
            System.out.println("DNI");
            client.setDni(dni = keyboard.nextLine());
            System.out.println("Adress:");
            client.setAdress(adress = keyboard.nextLine());
            System.out.println("Email: ");
            client.setEmail(email = keyboard.next());
            System.out.println("Celphone: ");
            client.setCelphone(celphone = keyboard.nextInt());
            System.out.println("Type: ");
            client.setTypeClient(type = keyboard.next());
        } catch (IndexOutOfBoundsException e) {  // put an exception
            System.out.println("Se produjo un error " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Inserto mal los datos " + e.getMessage());
        }

        return client;

        ///TODO
        /*if (!existeDni(dni)){
            Client client = new Client(name, lastName, dni, adress, email, celphone);
            gson(client);
            flag = true;
        }
        return flag;
         }
          */

    }



    public static List<Client> gson(Client client) {
        List<Client> clients = new ArrayList<Client>(100);


        /*Client client1 = new Client("German", "Oyarzo", 36384624, "Las heras", "german@hotmail.com", 22359393, "Eventual");
        Client client2 = new Client("Pepe", "Argento", 1034889348, "Mexico 1223", "pepeargento@gmail.com", 22233333, "Eventual");
        Client client3 = new Client("Homero", "Simpson", 111345455, "Calle Falsa 1234", "homero@gmail.com", 11434554, "Eventual");



        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);*/

        clients=DataBase.addList(client);

        //addToList(clients);

        return clients;
    }



    ///----- safe in a file---------------------

    public static void writeFile(List<Client> clients) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); /// create a gson to print better
        BufferedWriter fWriter = null;

        try {
            /// open file

            fWriter = new BufferedWriter(new FileWriter(new File("personas.json")));

            String json= gson.toJson(clients, clients.getClass());

            System.out.println("--------------------------------------");
            System.out.println(json);
            System.out.println("--------------------------------------");

            fWriter.write(json);


        } catch (IOException e) {  // put an exception
            System.out.println("Se produjo un error " + e.getMessage());
        } finally {
            if (fWriter != null) {
                try {
                    fWriter.close();///we have to close the file to be sure that all information is going to be safe

                } catch (IOException e) {
                    e.printStackTrace();

                }

            }

        }


        //return clients;
    }

    ///TODO
    ///---------------------READ A FILE------------------------------------------------------------
    public static void readFile(String nameFile) {


        //if(!new File("personas.json").exists()){/// if doesnt exists the file it will go out the funtion

        if (!new File(nameFile).exists()) {/// if doesnt exists the file it will go out the funtion

            return;
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        BufferedReader fReader = null;

        List<Client> clients;
        try {
            fReader = new BufferedReader(new FileReader(new File(nameFile)));
            clients = gson.fromJson(fReader, (new TypeToken<List<Client>>() {
            }.getType()));

            /*System.out.println("--------------------------");
            clients.forEach(System.out::println);
            System.out.println("--------------------------");*/
            ///== es lo mismo a lo de abajo
            for(var cli : clients)
            {


                System.out.println("--------------------------------------");
                System.out.println(cli);
                System.out.println("--------------------------------------");
            }


        } catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            /// close the file
            try {
                if (fReader != null) {
                    fReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    ///---------------------------------DELETE A OBJECT----------------------------------


}
