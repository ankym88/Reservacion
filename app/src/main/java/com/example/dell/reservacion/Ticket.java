package com.example.dell.reservacion;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by DELL on 28/07/2017.
 */

public class Ticket {

    private String cliente;
    private int numeroestacionamiento;
    private String inicio, fin;


    public Ticket(String cliente, int numeroestacionamiento, String inicio, String fin) {
        this.cliente = cliente;
        this.numeroestacionamiento = numeroestacionamiento;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getCliente() {

        return cliente;
    }

    public int getNumeroestacionamiento() {
        return numeroestacionamiento;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }



    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroestacionamiento(int numeroestacionamiento) {
        this.numeroestacionamiento = numeroestacionamiento;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }


}
