package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.UUID;

public class Client extends Person {

    private UUID uuid;
    private String typeClient; /// eventual or habitual

    public Client() {

    }

    public Client(UUID uuid, String typeClient) {
        this.uuid = UUID.randomUUID();
        this.typeClient = typeClient;
    }

    public Client(String name, String lastName, int dni, String adress, String email, int celphone, UUID uuid, String typeClient) {
        super(name, lastName, dni, adress, email, celphone);
        this.uuid = uuid;
        this.typeClient = typeClient;

    }

    ///region GETTERS AND SETTERS

    public UUID getId() {
        return uuid;
    }

    public void setId(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    ///endregion


    @Override
    public String toString() {
        return "Client{" +
                "\n ID: " + uuid.toString().substring(0,10) + /// id between 0 and 10
                "\n type: " + typeClient +
                '}';
    }
}
