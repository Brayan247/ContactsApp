package com.istl.contactsapp;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String nombre, ciudad, telefono, correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public void guardareContactosList () {
        List<Contact> contactArrayList = new ArrayList<>();
        Contact c = new Contact();
        c.setNombre("Brayan");
        c.setCiudad("El Pangui");
        c.setTelefono("0969736083");
        c.setCorreo("brayab@gmail.com");
        contactArrayList.add(c);
    }
}
