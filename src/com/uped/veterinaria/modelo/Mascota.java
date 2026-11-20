package com.uped.veterinaria.modelo;

/**
 * Clase de dominio Mascota que representa a los pacientes de la veterinaria.
 */
public class Mascota {
    private String codigo;
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String codigo, String nombre, String especie, int edad) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código de la mascota no puede estar vacío.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la mascota no puede estar vacío.");
        }
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("La especie de la mascota no puede estar vacía.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad de la mascota no puede ser negativa.");
        }
        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.especie = especie.trim();
        this.edad = edad;
    }

    public String getDetalleMascota() {
        return nombre + " (" + especie + ", " + edad + " años) [Cód: " + codigo + "]";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
}