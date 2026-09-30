package com.uped.veterinaria.modelo;

public class CitaMedica {

    private String codigoCita;
    private String fecha;
    private Mascota mascota;
    private Veterinario veterinario;
    private String motivo;
    private String estado;
    private String diagnostico;

    // Constructor
    public CitaMedica(
            String codigoCita,
            String fecha,
            Mascota mascota,
            Veterinario veterinario,
            String motivo) {

        // Validar campos de texto
        String[] camposTexto = {
                codigoCita,
                fecha,
                motivo
        };

        for (String texto : camposTexto) {
            if (texto == null || texto.trim().isEmpty()) {
                throw new IllegalArgumentException(
                        "Los datos de texto de la cita son obligatorios."
                );
            }
        }

        // Validar objetos requeridos
        Object[] objetosRequeridos = {
                mascota,
                veterinario
        };

        for (Object obj : objetosRequeridos) {
            if (obj == null) {
                throw new IllegalArgumentException(
                        "La cita debe contar con una mascota y un veterinario válidos."
                );
            }
        }

        // Asignar valores
        this.codigoCita = codigoCita;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivo = motivo;

        // Valores iniciales
        this.estado = "PROGRAMADA";
        this.diagnostico = "Pendiente de atención";
    }

    // Método de negocio principal
    public void completarCita(String diagnostico) {

        if (diagnostico == null || diagnostico.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El diagnóstico no puede estar vacío al completar la cita."
            );
        }

        this.diagnostico = diagnostico;
        this.estado = "COMPLETADA";
    }

    // Getter y Setter de codigoCita
    public String getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(String codigoCita) {
        if (codigoCita == null || codigoCita.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El código de la cita no puede estar vacío."
            );
        }

        this.codigoCita = codigoCita;
    }

    // Getter y Setter de fecha
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha == null || fecha.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La fecha no puede estar vacía."
            );
        }

        this.fecha = fecha;
    }

    // Getter y Setter de mascota
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        if (mascota == null) {
            throw new IllegalArgumentException(
                    "La mascota no puede ser nula."
            );
        }

        this.mascota = mascota;
    }

    // Getter y Setter de veterinario
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        if (veterinario == null) {
            throw new IllegalArgumentException(
                    "El veterinario no puede ser nulo."
            );
        }

        this.veterinario = veterinario;
    }

    // Getter y Setter de motivo
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        if (motivo == null || motivo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El motivo no puede estar vacío."
            );
        }

        this.motivo = motivo;
    }

    // Getter de estado
    public String getEstado() {
        return estado;
    }

    // Getter y Setter de diagnostico
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        if (diagnostico == null || diagnostico.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El diagnóstico no puede estar vacío."
            );
        }

        this.diagnostico = diagnostico;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cita [" + codigoCita + "] - Fecha: " + fecha + "\n"
                + " Paciente: " + mascota.getNombre()
                + " | Atiende: " + veterinario.getNombre() + "\n"
                + " Motivo: " + motivo
                + " | Estado: " + estado + "\n"
                + " Diagnóstico: " + diagnostico;
    }
}
