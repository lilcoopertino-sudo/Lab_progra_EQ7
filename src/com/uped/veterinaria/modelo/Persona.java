package com.uped.veterinaria.modelo;

public abstract class Persona {
    protected String dui;
    protected String nombre;
    protected String telefono;
    protected String email;

    // Constructor base invocado por las subclases mediante super(...)
    public Persona(String dui, String nombre, String telefono, String email) {
        this.dui = (dui != null && !dui.isBlank()) ? dui.trim() : "SIN-DUI";
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre.trim() : "SIN-NOMBRE";
        this.telefono = (telefono != null && !telefono.isBlank()) ? telefono.trim() : "SIN-TEL";
        this.email = (email != null && !email.isBlank()) ? email.trim() : "SIN-EMAIL";
    }

    public String getDui() {
        return dui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Método concreto común
    public String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }

    // Métodos abstractos obligatorios
    public abstract void mostrarFichaCompleta();
    public abstract String getRol();
    public abstract String getDetalleCompleto();

    public abstract void mostrarFichacompleta();
}
