package com.uped.veterinaria;

import com.uped.veterinaria.modelo.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("====================================================================");
        System.out.println("   SISTEMA DE GESTIÓN VETERINARIA - DEMO DAY (LABORATORIO 2)");
        System.out.println("====================================================================\n");

        // ------------------------------------------------------------------
        // 1. DEMOSTRACIÓN DE NATHALY (Clase Abstracta) Y JESSIE (Herencia)
        // ------------------------------------------------------------------
        System.out.println("--- 1. HERENCIA Y CLASES ABSTRACTAS (Jessie & Nathaly) ---");

        // No se puede hacer: Persona p = new Persona(...); // Error: Persona es abstracta
        // Polimorfismo de asignación: referencia de la superclase apuntando a objetos de subclases
        Persona dueno1 = new Dueno("María López", "01234567-8", "7777-8888", "San Salvador", "M-101", 45.00);
        Persona vet1 = new Veterinario("Dr. Carlos Rivas", "08765432-1", "2222-3333", "Antiguo Cuscatlán", "JVPM-4521", "Cirugía");

        System.out.println("Objeto 1 (Dueño): " + dueno1.presentarse());
        System.out.println("Objeto 2 (Veterinario): " + vet1.presentarse());
        System.out.println();

        // ------------------------------------------------------------------
        // 2. DEMOSTRACIÓN DE JACKIE (Polimorfismo: Sobrescritura / Overriding)
        // ------------------------------------------------------------------
        System.out.println("--- 2. POLIMORFISMO EN TIEMPO DE EJECUCIÓN / SOBRESCRITURA (Jackie) ---");

        // Arreglo polimórfico de tipo Persona (Superclase abstracta)
        Persona[] personalClinica = new Persona[] { dueno1, vet1 };

        for (Persona p : personalClinica) {
            // Despacho dinámico: La JVM ejecuta la versión sobrescrita con @Override en tiempo de ejecución
            System.out.println("-> " + p.getDetalleCompleto());
        }
        System.out.println();

        // ------------------------------------------------------------------
        // 3. DEMOSTRACIÓN DE JACKIE (Polimorfismo: Sobrecarga / Overloading)
        // ------------------------------------------------------------------
        System.out.println("--- 3. POLIMORFISMO EN TIEMPO DE COMPILACIÓN / SOBRECARGA (Jackie) ---");

        // Invocación de métodos sobrecargados (mismo nombre, distinta firma de parámetros)
        System.out.println("Caso A (Consulta Estándar): " + registrarAtencion("Firu", 25.00));
        System.out.println("Caso B (Consulta con Descuento): " + registrarAtencion("Firu", 25.00, 10.0));
        System.out.println("Caso C (Atención de Emergencia): " + registrarAtencion("Firu", 25.00, 0.0, true));
        System.out.println();

        // ------------------------------------------------------------------
        // 4. DEMOSTRACIÓN DE NELSON (Polimorfismo de Interfaz: Notificable)
        // ------------------------------------------------------------------
        System.out.println("--- 4. INTERFACES Y POLIMORFISMO DE INTERFAZ (Nelson) ---");

        // Arreglo polimórfico utilizando la interfaz Notificable
        Notificable[] receptores = new Notificable[] {
                (Notificable) dueno1,
                (Notificable) vet1
        };

        for (Notificable receptor : receptores) {
            // Ligadura dinámica a través del tipo de la interfaz
            receptor.enviarNotificacion("Recordatorio: Jornada de vacunación programada para este sábado.");
        }

        System.out.println("\n====================================================================");
        System.out.println("   EJECUCIÓN FINALIZADA CON ÉXITO");
        System.out.println("====================================================================");
    }

    // ======================================================================
    // MÉTODOS SOBRECARGADOS (Overloading) - A cargo de Jackie
    // Misma función en la clase, diferente cantidad y tipo de argumentos
    // ======================================================================

    // Sobrecarga 1: Consulta básica
    public static String registrarAtencion(String nombreMascota, double costoBase) {
        return "Atención a " + nombreMascota + " | Total: $" + String.format("%.2f", costoBase);
    }

    // Sobrecarga 2: Consulta con porcentaje de descuento
    public static String registrarAtencion(String nombreMascota, double costoBase, double porcentajeDescuento) {
        double total = costoBase - (costoBase * (porcentajeDescuento / 100.0));
        return "Atención a " + nombreMascota + " (Desc. " + porcentajeDescuento + "%) | Total: $" + String.format("%.2f", total);
    }

    // Sobrecarga 3: Consulta de emergencia con recargo adicional
    public static String registrarAtencion(String nombreMascota, double costoBase, double porcentajeDescuento, boolean esEmergencia) {
        double recargo = esEmergencia ? 15.00 : 0.0;
        double total = (costoBase - (costoBase * (porcentajeDescuento / 100.0))) + recargo;
        return "EMERGENCIA a " + nombreMascota + " (+ $15.00) | Total: $" + String.format("%.2f", total);
    }
}
