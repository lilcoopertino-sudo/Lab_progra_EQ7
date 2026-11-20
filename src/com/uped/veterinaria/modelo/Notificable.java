package com.uped.veterinaria.interfaces;

/**
 * Interfaz Notificable (Entregable del sistema veterinario)
 * Define el contrato de comportamiento para el envío de notificaciones.
 */
public interface Notificable {
    void enviarNotificacion(String mensaje);
}