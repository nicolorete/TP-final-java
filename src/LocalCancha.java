package com.company;

import java.util.Arrays;

public class LocalCancha {
    private Client [] clients;
    private ItemRent []itemRents;

    public LocalCancha() {
    }

    public LocalCancha(Client[] clients, ItemRent[] itemRents) {
        this.clients = clients;
        this.itemRents = itemRents;
    }

    ///region GETTERS AND SETTERS

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public ItemRent[] getItemRents() {
        return itemRents;
    }

    public void setItemRents(ItemRent[] itemRents) {
        this.itemRents = itemRents;
    }
    ///endregion

    @Override
    public String toString() {
        return "LocalCancha{" +
                "clients:" + Arrays.toString(clients) +
                ", itemRents: " + Arrays.toString(itemRents) +
                '}';
    }
}
