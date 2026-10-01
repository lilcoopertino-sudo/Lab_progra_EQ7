package com.uped.veterinaria.modelo;

public class Mascota {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private com.uped.veterinaria.modelo.Dueno dueno;

    public Mascota(String nombre, String especie, String raza, int edad, double peso, com.uped.veterinaria.modelo.Dueno dueno) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("La especie no puede estar vacía.");
        }

        if (raza == null || raza.trim().isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía.");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }

        if (dueno == null) {
            throw new IllegalArgumentException("La mascota debe tener un dueño.");
        }

        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.dueno = dueno;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("La especie no puede estar vacía.");
        }

        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.trim().isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía.");
        }

        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }

        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }

        this.peso = peso;
    }

    public com.uped.veterinaria.modelo.Dueno getDueno() {
        return dueno;
    }

    public void setDueno(com.uped.veterinaria.modelo.Dueno dueno) {
        if (dueno == null) {
            throw new IllegalArgumentException("La mascota debe tener un dueño.");
        }

        this.dueno = dueno;
    }

    public boolean esPacienteGeriatrico() {
        return edad >= 7;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", dueno=" + dueno.getNombre() +
                '}';
    }
}