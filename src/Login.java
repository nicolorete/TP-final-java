package com.company;


import com.google.gson.Gson;

import java.io.*;
import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Login {

    List<Client> clients;


    public static void menuLogin() {

        /*String[] options = {"ADMIN", "CLIENT"};
        ImageIcon icon = new ImageIcon("D:/2 º año 1º cuatrimestre Programacion/TPFINAL/src/images.png");
        String n = (String) JOptionPane.showInputDialog(null, "Ingrese una opcion",
                "TURNOS ", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        System.out.println(n);*/


        int option;
        int option2;
        int option3;
        int option4;
        int option5;
        int option6;
        int option7;

        Scanner myScanner = new Scanner(System.in);

        do {


            System.out.println("Choose an option (0 to exit)");
            System.out.println("1: Admin");
            System.out.println("2: Client");


            option = myScanner.nextInt();



            switch (option) {

                case 1:

                    do {
                        Administrador admin = new Administrador();

                        System.out.println("1: show all clients");
                        System.out.println("2: eliminate a client");
                        System.out.println("3: show a client");
                        System.out.println("0 to exit");
                        option2 = myScanner.nextInt();

                        switch (option2) {
                            case 1:
                                admin.showClients("personas.json");
                                break;
                            case 2:
                                /// TODO BUSCAR CLIENTE Y ELIMINAR.
                                DataBase dataBase = new DataBase();
                                System.out.println("Ingrese un dni");
                                String dniBuscar;

                                dniBuscar=myScanner.next();
                                dataBase.deleteClient(dniBuscar);
                                System.out.println("Client deleted");

                                break;

                            case 3:


                                System.out.println("Ingrese un dni");
                                String dni;

                                dni=myScanner.next();
                                Client clientEncontrado = new Client();

                                clientEncontrado = DataBase.getOurInstance().searchClient(dni);
                                System.out.println("-----Client found------");
                                System.out.println(clientEncontrado);
                                System.out.println("--------------------------------");

                                break;
                        }
                    } while (option2 != 0);
                    break;


                case 2:
                    do {

                        Client client = new Client();
                        System.out.println("Choose an option (0 to exit)");
                        System.out.println("1: First Time?, LOAD CLIENT");
                        System.out.println("2: Modify Client");
                        System.out.println("3: Login");

                        option3 = myScanner.nextInt();

                        switch (option3) {
                            case 1:
                                /// CARGAR CLIENTES
                                Gjson gson= new Gjson();
                                Gjson.writeFile( gson.gson(Gjson.LoadClient()));


                                break;
                            case 2:
                                /// MODIFICAR CLIENTE
                                System.out.println("Ingrese un dni");
                                String dni;

                                dni=myScanner.next();
                                Client clientmod = new Client();

                                clientmod = DataBase.getOurInstance().modifyClient(dni);
                                System.out.println("-----Client modify------");
                                System.out.println(clientmod);
                                System.out.println("--------------------------------");
                                break;

                            case 3:
                                //// TODO INGRESAR CON NUMERO DOCUMENTO
                                /// if existe dni
                                System.out.println("Ingrese su dni");
                                //dni=myScanner.nextInt();


                                do
                                {
                                    System.out.println("Choose an option (0 to exit)");
                                    System.out.println("Select the sport");
                                    System.out.println("1: Papi");
                                    System.out.println("2: Tenis");
                                    System.out.println("3: Paddel");


                                    option4 = myScanner.nextInt();

                                    switch (option4)
                                    {
                                        case 1:
                                            do{
                                                System.out.println("Choose an option (0 to exit)");
                                                System.out.println("PAPI");
                                                System.out.println("Select the time");
                                                System.out.println("1: 08:00 AM");
                                                System.out.println("2: 14:00 PM");
                                                System.out.println("3: 20:00 PM");

                                                option5= myScanner.nextInt();

                                                switch (option5)
                                                {
                                                    case 1:
                                                        /// TODO RESERVAR HORARIO
                                                        break;

                                                    case 2:
                                                        /// TODO RESERVAR HORARIO
                                                        break;

                                                    case 3:
                                                        /// TODO RESERVAR HORARIO
                                                        break;

                                                    case 0:
                                                        break;

                                                    default:
                                                        System.out.println("Incorrect option");
                                                        break;

                                                }
                                            }while(option5!=0);

                                            break;

                                        case 2:
                                            do{
                                                System.out.println("Choose an option (0 to exit)");
                                                System.out.println("TENIS");
                                                System.out.println("Select the time");
                                                System.out.println("1: 09:00 AM");
                                                System.out.println("2: 15:00 PM");
                                                System.out.println("3: 21:00 PM");

                                                option6= myScanner.nextInt();

                                                switch (option6)
                                                {
                                                    case 1:
                                                        /// TODO RESERVAR HORARIO

                                                        break;

                                                    case 2:
                                                        /// TODO RESERVAR HORARIO
                                                        System.out.println("RESERVANDO HORARIO...");
                                                        break;

                                                    case 3:
                                                        /// TODO RESERVAR HORARIO
                                                        System.out.println("FALTA RESERVANDO HORARIO...");
                                                        break;

                                                    case 0:
                                                        break;

                                                    default:
                                                        System.out.println("Incorrect option");
                                                        break;

                                                }
                                            }while(option6!=0);

                                            break;

                                        case 3:
                                            do{
                                                System.out.println("Choose an option (0 to exit)");
                                                System.out.println("PADDEL");
                                                System.out.println("Select the time");
                                                System.out.println("1: 10:00 AM");
                                                System.out.println("2: 16:00 PM");
                                                System.out.println("3: 22:00 PM");

                                                option7= myScanner.nextInt();

                                                switch (option7)
                                                {
                                                    case 1:
                                                        /// TODO RESERVAR HORARIO
                                                        break;

                                                    case 2:
                                                        /// TODO RESERVAR HORARIO
                                                        break;

                                                    case 3:
                                                        /// TODO RESERVAR HORARIO
                                                        break;

                                                    case 0:
                                                        break;

                                                    default:
                                                        System.out.println("Incorrect option");
                                                        break;

                                                }
                                            }while(option7!=0);

                                            break;


                                    }
                                }while(option4 !=0);

                        }
                    } while (option3 != 0);
                    break;


                case 0:
                    break;

                default:
                    System.out.println("Incorrect option");
                    break;

            }


        } while (option != 0);
    }
}

