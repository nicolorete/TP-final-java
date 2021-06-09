package com.company;

import javax.swing.*;
import java.util.*;


public class DataBase {
    private static DataBase ourInstance = new DataBase();

    private static List<Client> listClient = new ArrayList<>(100);

    public DataBase() {
    }

    public static DataBase getOurInstance() {
        return ourInstance;
    }

    public static void setOurInstance(DataBase ourInstance) {
        DataBase.ourInstance = ourInstance;
    }

    public static List<Client> getListClient() {
        return listClient;
    }

    public static void setListClient(List<Client> listClient) {
        DataBase.listClient = listClient;
    }


    public static List<Client> addList(Client client) {


        if (listClient == null) {
            listClient = new ArrayList<Client>();

            listClient.add(client);
        } else {
            //exist(client);
            listClient.add(client);

        }
        try {
            Gjson.writeFile(listClient);


        } catch (Exception e) {
            System.out.print("Error to save the file" + e.toString());
        }
        return listClient;
    }


    public Client searchClient(String dni) {
        Gjson.readFile("personas.json");
        for (Client client : listClient) {
            if (dni.equals(client.getDni())) {

                return client;


            }
        }
        return null;
    }

    public void deleteClient(String dni) {
        try{
            listClient.removeIf(client -> dni.equals(client.getDni()));

        }catch (Exception e){
            System.out.println("No existe dni" +e.getMessage());
        }finally {
            Gjson.writeFile(listClient);
        }



    }



    public Client modifyClient(String dni) {

        Gjson.readFile("personas.json");
        for (Client client : listClient) {
            if (dni.equals(client.getDni())) {

                try {
                    deleteClient(dni);
                  Gjson.gson(Gjson.LoadClient());

                } catch (IndexOutOfBoundsException e) {  // put an exception
                    System.out.println("Se produjo un error " + e.getMessage());
                } catch (InputMismatchException e){
                    System.out.println("Inserto mal los datos " + e.getMessage());
                }finally {
                    Gjson.writeFile(listClient);
                }

                return client;
            }
        }
        return null;
    }




    /*public Client exist(Client client) {


        for (Object cli : listClient) {
            if (cli.equals(client)) {
                System.out.println("");
            } else {
                System.out.println("new Client");
                listClient.add(client);
            }
        }
        return client;
    }*/



    /*public  Client buscar (Client objeto) {
        Client copia = null;
        for(Client e : listaAL)
        {
            if(e.equals(objeto))
                copia = objeto;
        }
        return copia;

    }*/
}
