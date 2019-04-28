package com.arosado.moviles.paginasamarillasapp;

public class NombresAnimales {
    //--Declaramos la variable que tomara los nombres recibidos en la función
    private String nombresAnimales;
    //--Función que recibe los nombres
    public NombresAnimales(String nombresAnimales) {
        this.nombresAnimales = nombresAnimales;
    }
    //--Función que regresa el nombre recibido y asigando a la variable
    public String getAnimalName() {
        return this.nombresAnimales;
    }
}