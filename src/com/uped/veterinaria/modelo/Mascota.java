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
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la mascota no puede estar vacío.");
        }
        this.codigo = (codigo != null && !codigo.isBlank()) ? codigo.trim() : "M-000";
        this.nombre = nombre.trim();
        this.especie = (especie != null && !especie.isBlank()) ? especie.trim() : "Desconocida";
        this.edad = Math.max(0, edad);
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