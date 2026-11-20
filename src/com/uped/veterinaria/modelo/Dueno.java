package com.uped.veterinaria.modelo;

import com.uped.veterinaria.interfaces.Notificable;


//  Subclase Dueno que hereda de Persona (Relación "es un" / Is-A)
//  e implementa Notificable (Entregable de Nelson).

public abstract class Dueno extends Persona implements Notificable {
    private String direccion;
    private String nombreMascota;

    public Dueno(String dui, String nombre, String telefono, String email, String direccion, String nombreMascota) {
        // Propagación de constructores hacia la superclase mediante super()
        super(dui, nombre, telefono, email);
        this.direccion = (direccion != null && !direccion.isBlank()) ? direccion.trim() : "SIN-DIRECCION";
        this.nombreMascota = (nombreMascota != null && !nombreMascota.isBlank()) ? nombreMascota.trim() : "SIN-MASCOTA";
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    // Implementación obligatoria de los métodos abstractos heredados de Persona
    @Override
    public String getRol() {
        return "Propietario / Dueño";
    }

    @Override
    public String getDetalleCompleto() {
        return "DUI: " + dui + " | Nombre: " + nombre + " | Tel: " + telefono +
                " | Email: " + email + " | Dirección: " + direccion +
                " | Mascota: " + nombreMascota;
    }

    // Método de la subclase
    public void mostrarFichaCompleta() {
        System.out.println("==========================================");
        System.out.println("FICHA DE PROPIETARIO / DUEÑO DE MASCOTA");
        System.out.println("==========================================");
        // Acceso directo a los atributos protected heredados (dui, nombre, telefono, email)
        System.out.println("DUI: " + dui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Dirección: " + direccion);
        System.out.println("Mascota asignada: " + nombreMascota);
        System.out.println("------------------------------------------");
    }

    // Implementación obligatoria de la interfaz Notificable
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("📩 [NOTIFICACIÓN A DUEÑO] " + nombre + " (" + telefono + "): " + mensaje);
    }
}
