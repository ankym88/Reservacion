package com.example.dell.reservacion;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by DELL on 28/07/2017.
 */

public class Ticket {

    private String cliente;
    private int numeroestacionamiento;
    private Date inicio, fin;
    private float costo;

    public Ticket(String cliente, int numeroestacionamiento, Date inicio, Date fin, float costo) {
        this.cliente = cliente;
        this.numeroestacionamiento = numeroestacionamiento;
        this.inicio = inicio;
        this.fin = fin;
        this.costo = costo;
    }


    public String getCliente() {

        return cliente;
    }

    public int getNumeroestacionamiento() {
        return numeroestacionamiento;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public float getCosto() {
        return costo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroestacionamiento(int numeroestacionamiento) {
        this.numeroestacionamiento = numeroestacionamiento;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
