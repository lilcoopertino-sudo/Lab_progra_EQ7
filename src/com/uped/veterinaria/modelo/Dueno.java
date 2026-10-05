package com.veterinaria.modelo;

/**
 * Subclase Dueno que hereda de Persona (Relación "es un" / Is-A).
 */
public class Dueno extends Persona {
    private String direccion;
    private String nombreMascota;

    public Dueno(String id, String nombre, String telefono, String email, String direccion, String nombreMascota) {
        // Propagación de constructores hacia la superclase mediante super()
        super(id, nombre, telefono, email);
        this.direccion = direccion;
        this.nombreMascota = nombreMascota;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    @Override
    public void mostrarFichaCompleta() {
        System.out.println("==========================================");
        System.out.println("FICHA DE PROPIETARIO / DUEÑO DE MASCOTA");
        System.out.println("==========================================");
        // Acceso directo a los atributos protected heredados (id, nombre, telefono, email)
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Dirección: " + direccion);
        System.out.println("Mascota asignada: " + nombreMascota);
        System.out.println("------------------------------------------");
    }
}
