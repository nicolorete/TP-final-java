package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;



public class Turno {
    private UUID uuid;
    private Client client;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private TipoCancha TipodeCancha ;
    private boolean isOcupado;
    private ItemRent [] item;

    public Turno() {
    }

    public Turno( Client client, LocalDateTime checkIn, LocalDateTime checkOut, TipoCancha tipodeCancha, boolean isOcupado, ItemRent[] item) {
        this.uuid = uuid.randomUUID();
        this.client = client;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        TipodeCancha = tipodeCancha;
        this.isOcupado = isOcupado;
        this.item = item;
    }

    ///region GETTERS AND SETTERS


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public TipoCancha getTipodeCancha() {
        return TipodeCancha;
    }

    public void setTipodeCancha(TipoCancha tipodeCancha) {
        TipodeCancha = tipodeCancha;
    }

    public boolean isOcupado() {
        return isOcupado;
    }

    public void setOcupado(boolean ocupado) {
        isOcupado = ocupado;
    }

    public ItemRent[] getItem() {
        return item;
    }

    public void setItem(ItemRent[] item) {
        this.item = item;
    }

    ///endregion



    public void cargarTurno(LocalDateTime checkIn){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        BufferedWriter fWriter = null;
        try {
            /// open file

            fWriter = new BufferedWriter(new FileWriter(new File("turnos.json")));
             String JsonClient = gson.toJson(checkIn); /// convierto un objeto a string, lo guardo en un archivo
            System.out.println("Check in: " + checkIn);


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



    }



    public void modificarTurno(){

    }

    public void eliminateTurno(int id){
        for(int i=0; i<item.length; i++){
            if(item[i] !=null && item[i].getUuid() == uuid){
                item[i]=null;
                break;
            }
        }
    }




    @Override
    public String toString() {
        return "Turno{" +
                "\n ID: " + uuid.toString().substring(1,10) +
                "\n Client: " + client +
                "\n CheckIn: " + checkIn +
                "\n CheckOut:" + checkOut+
                "\n TipodeCancha=" + TipodeCancha +
                "\n isOcupado=" + isOcupado +
                "\n item: " + Arrays.toString(item) +
                '}';
    }
}
