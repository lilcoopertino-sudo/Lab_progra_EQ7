package com.uped.veterinaria.modelo;

public class Dueno {

    private String nombre;
    private String dui;
    private String telefono;
    private String direccion;

    public Dueno(String nombre, String dui, String telefono, String direccion) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        if (dui == null || dui.trim().isEmpty()) {
            throw new IllegalArgumentException("El DUI no puede estar vacío.");
        }

        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío.");
        }

        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }

        this.nombre = nombre;
        this.dui = dui;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        if (dui == null || dui.trim().isEmpty()) {
            throw new IllegalArgumentException("El DUI no puede estar vacío.");
        }

        this.dui = dui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío.");
        }

        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }

        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Dueno{" +
                "nombre='" + nombre + '\'' +
                ", dui='" + dui + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}