package com.uped.veterinaria.modelo;

//  Clase de dominio CitaMedica que gestiona la atención realizada por un médico
//  veterinario a un paciente, aplicando sobrecarga de métodos para el cálculo de costos.

public class CitaMedica {
    private String idCita;
    private Mascota mascota;
    private Veterinario veterinario;
    private Dueno dueno;
    private double costoBase;

    public CitaMedica(String idCita, Mascota mascota, Veterinario veterinario, Dueno dueno, double costoBase) {
        if (costoBase < 0) {
            throw new IllegalArgumentException("El costo base no puede ser negativo.");
        }
        this.idCita = (idCita != null && !idCita.isBlank()) ? idCita.trim() : "CITA-000";
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.dueno = dueno;
        this.costoBase = costoBase;
    }

    // ======================================================================
    // MÉTODOS SOBRECARGADOS (Overloading)
    // ======================================================================

    // Sobrecarga 1: Cobro normal
    public double calcularCostoTotal() {
        return costoBase;
    }

    // Sobrecarga 2: Cobro con porcentaje de descuento
    public double calcularCostoTotal(double porcentajeDescuento) {
        double descuento = (porcentajeDescuento > 0) ? porcentajeDescuento : 0.0;
        return costoBase - (costoBase * (descuento / 100.0));
    }

    // Sobrecarga 3: Cobro de emergencia (con recargo de $15.00)
    public double calcularCostoTotal(double porcentajeDescuento, boolean esEmergencia) {
        double recargo = esEmergencia ? 15.00 : 0.0;
        return calcularCostoTotal(porcentajeDescuento) + recargo;
    }

    // Método para resumen completo de la cita
    public String getResumenCita() {
        String nombreMascota = (mascota != null) ? mascota.getNombre() : "SIN-MASCOTA";
        String nombreVet = (veterinario != null) ? veterinario.getNombre() : "SIN-VET";
        String nombreDueno = (dueno != null) ? dueno.getNombre() : "SIN-DUEÑO";

        return "Cita " + idCita + " | Paciente: " + nombreMascota +
                " | Atendido por: Dr(a). " + nombreVet +
                " | Dueño: " + nombreDueno +
                " | Costo Base: $" + String.format("%.2f", costoBase);
    }

    // Getters
    public String getIdCita() {
        return idCita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public double getCostoBase() {
        return costoBase;
    }
}
