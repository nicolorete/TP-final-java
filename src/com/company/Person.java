package com.company;

import java.io.*;

public abstract class Person {

    private String name;
    private String lastName;
    private int dni;
    private String adress;
    private String email;
    private int celphone;


    public Person() {
    }

    public Person(String name, String lastName, int dni, String adress, String email, int celphone) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.adress = adress;
        this.email = email;
        this.celphone = celphone;
    }

    ///region GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelphone() {
        return celphone;
    }

    public void setCelphone(int celphone) {
        this.celphone = celphone;
    }
    ///endregion



    public static void writeFile(){
        try{
            /// open file
            BufferedWriter file = new BufferedWriter( new FileWriter(new File("personas.txt")));


            file.write("German Oyarzo"); /// write in the file
            file.newLine(); /// jumpLine

            file.close(); /// we have to close the file to be sure that all information is going to be safe



        } catch (IOException e) {  // put an exception
            System.out.println("Se produjo un error " + e.getMessage());
        }
    }

    public static void readFile(){

        if(!new File("personas.txt").exists()){/// if doesnt exists the file it will go out the funtion

            return;
        }
        BufferedReader fEntrada = null;

        try{
            fEntrada = new BufferedReader(new FileReader(new File("personas.txt")));

            String linea = null;

            while((linea = fEntrada.readLine())!= null){
                System.out.println(linea);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            /// close the file
            if(fEntrada != null){
                try{
                    fEntrada.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }

    }

    public void existeDni(int dni){
        if (equals(this.dni = dni)){
            System.out.println("El dni ya se encuentra cargado");
        }else
        {
            writeFile();
        }

    }


    @Override
    public String toString() {
        return "Persona{" +
                "\n name: " + name +
                "\n lastName: " + lastName +
                "\n  dni: " + dni +
                "\n adress: " + adress +
                "\n email: " + email +
                "\n celphone: " + celphone +
                '}';
    }
}
