package com.veterinaria.modelo;

/**
 * Subclase Veterinario que hereda de Persona (Relación "es un" / Is-A).
 */
public class Veterinario extends Persona {
    private String numJuntaVET;
    private String especialidad;
    private double salarioBase;

    public Veterinario(String id, String nombre, String telefono, String email, String numJuntaVET, String especialidad, double salarioBase) {
        // Propagación del constructor base mediante super(...)
        super(id, nombre, telefono, email);
        this.numJuntaVET = numJuntaVET;
        this.especialidad = especialidad;
        this.salarioBase = salarioBase;
    }

    public String getNumJuntaVET() {
        return numJuntaVET;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioTotal(double bonoEmergencia) {
        return salarioBase + bonoEmergencia;
    }

    @Override
    public void presentarse() {
        // Reutilización y extensión del método de la superclase
        super.presentarse();
        System.out.println("Especialidad: " + especialidad + " | N° Junta Médica: " + numJuntaVET);
    }

    @Override
    public void mostrarFichaCompleta() {
        System.out.println("==========================================");
        System.out.println("FICHA DE PERSONAL VETERINARIO");
        System.out.println("==========================================");
        // Reutilización directa de atributos protected heredados
        System.out.println("ID Personal: " + id);
        System.out.println("Dr(a).: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("N° JSV: " + numJuntaVET);
        System.out.println("Contacto: " + telefono + " | " + email);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("------------------------------------------");
    }
}
