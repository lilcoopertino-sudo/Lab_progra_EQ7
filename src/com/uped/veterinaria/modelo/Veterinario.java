package com.uped.veterinaria.modelo;

public class Veterinario {

    private String nombre;
    private String numeroJvm;
    private String especialidad;
    private int aniosExperiencia;

    // Constructor
    public Veterinario(String nombre, String numeroJvm, String especialidad, int aniosExperiencia) {

        // Validación de campos de texto
        String[] camposTexto = {nombre, numeroJvm, especialidad};

        for (String campo : camposTexto) {
            if (campo == null || campo.trim().isEmpty()) {
                throw new IllegalArgumentException(
                        "Todos los campos de texto del veterinario son obligatorios."
                );
            }
        }

        // Validación de años de experiencia
        if (aniosExperiencia < 0) {
            throw new IllegalArgumentException(
                    "Los años de experiencia no pueden ser negativos."
            );
        }

        this.nombre = nombre;
        this.numeroJvm = numeroJvm;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío."
            );
        }

        this.nombre = nombre;
    }

    // Getter y Setter de numeroJvm
    public String getNumeroJvm() {
        return numeroJvm;
    }

    public void setNumeroJvm(String numeroJvm) {
        if (numeroJvm == null || numeroJvm.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El número JVM no puede estar vacío."
            );
        }

        this.numeroJvm = numeroJvm;
    }

    // Getter y Setter de especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La especialidad no puede estar vacía."
            );
        }

        this.especialidad = especialidad;
    }

    // Getter y Setter de años de experiencia
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia < 0) {
            throw new IllegalArgumentException(
                    "Los años de experiencia no pueden ser negativos."
            );
        }

        this.aniosExperiencia = aniosExperiencia;
    }

    // Método toString
    @Override
    public String toString() {
        return "Dr(a). " + nombre
                + " [JVM: " + numeroJvm
                + " | Especialidad: " + especialidad
                + " | Exp: " + aniosExperiencia + " años]";
    }
}

