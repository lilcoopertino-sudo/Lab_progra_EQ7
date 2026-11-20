package com.uped.veterinaria.modelo;

// Importación obligatoria de la interfaz
import com.uped.veterinaria.interfaces.Notificable;

/**
 * Subclase Veterinario que hereda de Persona e implementa Notificable.
 */
public class Veterinario extends Persona implements Notificable {
    private String numJuntaVET;
    private String especialidad;
    private double salarioBase;

    public Veterinario(String dui, String nombre, String telefono, String email,
                       String numJuntaVET, String especialidad, double salarioBase) {
        // Propagación hacia el constructor de Persona
        super(dui, nombre, telefono, email);
        this.numJuntaVET = (numJuntaVET != null && !numJuntaVET.isBlank()) ? numJuntaVET.trim() : "SIN-JVPM";
        this.especialidad = (especialidad != null && !especialidad.isBlank()) ? especialidad.trim() : "GENERAL";
        this.salarioBase = (salarioBase >= 0) ? salarioBase : 0.0;
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
        return salarioBase + ((bonoEmergencia > 0) ? bonoEmergencia : 0.0);
    }

    // ======================================================================
    // IMPLEMENTACIÓN DE MÉTODOS ABSTRACTOS DE PERSONA
    // ======================================================================

    @Override
    public String getRol() {
        return "Personal Veterinario";
    }

    @Override
    public String getDetalleCompleto() {
        return "DUI: " + dui + " | Dr(a). " + nombre + " | JVPM: " + numJuntaVET +
                " | Especialidad: " + especialidad + " | Tel: " + telefono +
                " | Email: " + email + " | Salario Base: $" + String.format("%.2f", salarioBase);
    }

    @Override
    public void mostrarFichaCompleta() {
        System.out.println("==========================================");
        System.out.println("FICHA DE PERSONAL VETERINARIO");
        System.out.println("==========================================");
        System.out.println("DUI Personal: " + dui);
        System.out.println("Dr(a).: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("N° JSV: " + numJuntaVET);
        System.out.println("Contacto: " + telefono + " | " + email);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("------------------------------------------");
    }

    // Extensión del método de la superclase
    @Override
    public String presentarse() {
        return super.presentarse() + " | Especialidad: " + especialidad + " | N° JSV: " + numJuntaVET;
    }

    @Override
    public void mostrarFichacompleta() {

    }

    // ======================================================================
    // IMPLEMENTACIÓN DE LA INTERFAZ NOTIFICABLE
    // ======================================================================

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("📲 [SISTEMA MEDICO] Dr(a). " + nombre + " (JVPM: " + numJuntaVET + "): " + mensaje);
    }
}
