package com.uped.veterinaria.modelo;

public class Tratamiento {

    // Constante pública para el recargo por control obligatorio
    public static final double RECARGO_CONTROL = 15.0;

    private String codigoTratamiento;
    private String nombreMedicamento;
    private int diasDuracion;
    private double costoBase;
    private boolean requiereControl;

    // Constructor
    public Tratamiento(String codigoTratamiento,
                       String nombreMedicamento,
                       int diasDuracion,
                       double costoBase,
                       boolean requiereControl) {

        // Validar código del tratamiento
        if (codigoTratamiento == null || codigoTratamiento.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El código del tratamiento no puede estar vacío."
            );
        }

        // Validar nombre del medicamento
        if (nombreMedicamento == null || nombreMedicamento.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre del medicamento no puede estar vacío."
            );
        }

        // Validar días de duración
        if (diasDuracion <= 0) {
            throw new IllegalArgumentException(
                    "Los días de duración deben ser mayores a cero."
            );
        }

        // Validar costo base
        if (costoBase <= 0) {
            throw new IllegalArgumentException(
                    "El costo base debe ser mayor a cero."
            );
        }

        // Asignar valores
        this.codigoTratamiento = codigoTratamiento;
        this.nombreMedicamento = nombreMedicamento;
        this.diasDuracion = diasDuracion;
        this.costoBase = costoBase;
        this.requiereControl = requiereControl;
    }

    // Método para calcular el costo total
    public double calcularCostoTotal() {

        if (requiereControl) {
            return costoBase + RECARGO_CONTROL;
        }

        return costoBase;
    }

    // Getter y Setter de codigoTratamiento
    public String getCodigoTratamiento() {
        return codigoTratamiento;
    }

    public void setCodigoTratamiento(String codigoTratamiento) {

        if (codigoTratamiento == null || codigoTratamiento.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El código del tratamiento no puede estar vacío."
            );
        }

        this.codigoTratamiento = codigoTratamiento;
    }

    // Getter y Setter de nombreMedicamento
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {

        if (nombreMedicamento == null || nombreMedicamento.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre del medicamento no puede estar vacío."
            );
        }

        this.nombreMedicamento = nombreMedicamento;
    }

    // Getter y Setter de diasDuracion
    public int getDiasDuracion() {
        return diasDuracion;
    }

    public void setDiasDuracion(int diasDuracion) {

        if (diasDuracion <= 0) {
            throw new IllegalArgumentException(
                    "Los días de duración deben ser mayores a cero."
            );
        }

        this.diasDuracion = diasDuracion;
    }

    // Getter y Setter de costoBase
    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {

        if (costoBase <= 0) {
            throw new IllegalArgumentException(
                    "El costo base debe ser mayor a cero."
            );
        }

        this.costoBase = costoBase;
    }

    // Getter y Setter de requiereControl
    public boolean isRequiereControl() {
        return requiereControl;
    }

    public void setRequiereControl(boolean requiereControl) {
        this.requiereControl = requiereControl;
    }

    // Método toString
    @Override
    public String toString() {

        return "Tratamiento [" + codigoTratamiento + "] "
                + nombreMedicamento + "\n"
                + "Duración: " + diasDuracion + " días"
                + " | Costo Base: $" + String.format("%.2f", costoBase) + "\n"
                + "Requiere Control: "
                + (requiereControl
                ? "SÍ (+$" + String.format("%.2f", RECARGO_CONTROL) + ")"
                : "NO") + "\n"
                + "Costo Total: $"
                + String.format("%.2f", calcularCostoTotal());
    }
}
