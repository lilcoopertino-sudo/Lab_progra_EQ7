package com.veterinaria.modelo;

/**
 * Superclase abstracta Persona.
 * Demuestra la reutilización de código y encapsulamiento con atributos protected.
 */
public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String telefono;
    protected String email;

    // Constructor base que será invocado por las subclases mediante super(...)
    public Persona(String id, String nombre, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getId() {
        return id;
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

    // Método que demuestra el comportamiento común
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " [ID: " + id + "]");
    }

    // Método abstracto para obligar la implementación específica en las subclases
    public abstract void mostrarFichaCompleta();
}
