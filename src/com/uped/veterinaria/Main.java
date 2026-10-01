package com.uped.veterinaria;

import com.uped.veterinaria.modelo.CitaMedica;
import com.uped.veterinaria.modelo.Dueno;
import com.uped.veterinaria.modelo.Mascota;
import com.uped.veterinaria.modelo.Tratamiento;
import com.uped.veterinaria.modelo.Veterinario;

public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("     SISTEMA DE GESTIÓN VETERINARIA - UPED");
        System.out.println("                    EQUIPO 7");
        System.out.println("=======================================================\n");

        try {

            // =====================================================
            // 1. REGISTRO DEL DUEÑO
            // =====================================================

            System.out.println("--- 1. REGISTRO DE DUEÑO ---");

            Dueno dueno1 = new Dueno(
                    "Carlos Mendoza",
                    "01234567-8",
                    "7890-1234",
                    "Colonia Escalón, San Salvador"
            );

            System.out.println(dueno1);
            System.out.println();


            // =====================================================
            // 2. REGISTRO DE LA MASCOTA
            // =====================================================

            System.out.println("--- 2. REGISTRO DE MASCOTA ---");

            Mascota mascota1 = new Mascota(
                    "Max",
                    "Perro",
                    "Golden Retriever",
                    8,
                    28.5,
                    dueno1
            );

            System.out.println(mascota1);

            System.out.println(
                    "¿Es paciente geriátrico?: "
                            + (mascota1.esPacienteGeriatrico()
                            ? "SÍ (>= 7 años)"
                            : "NO")
            );

            System.out.println();


            // =====================================================
            // 3. REGISTRO DEL TRATAMIENTO
            // =====================================================

            System.out.println("--- 3. REGISTRO DE TRATAMIENTO ---");

            Tratamiento tratamiento1 = new Tratamiento(
                    "TRAT-101",
                    "Amoxicilina + Antiinflamatorio",
                    7,
                    30.00,
                    true
            );

            System.out.println(tratamiento1);

            System.out.println(
                    "Requiere control obligatorio: "
                            + (tratamiento1.isRequiereControl()
                            ? "SÍ"
                            : "NO")
            );

            System.out.println();


            // =====================================================
            // 4. REGISTRO DEL VETERINARIO
            // =====================================================

            System.out.println("--- 4. REGISTRO DE VETERINARIO ---");

            Veterinario vet1 = new Veterinario(
                    "Dr. Roberto Gómez",
                    "VET-001",
                    "Cirugía y Medicina General",
                    8
            );

            System.out.println(vet1);
            System.out.println();


            // =====================================================
            // 5. REGISTRO DE CITA MÉDICA
            // =====================================================

            System.out.println("--- 5. REGISTRO DE CITA MÉDICA ---");

            CitaMedica cita1 = new CitaMedica(
                    "CIT-2026-001",
                    "30/09/2026",
                    mascota1,
                    vet1,
                    "Chequeo general y control de tratamiento"
            );

            System.out.println(cita1);
            System.out.println();


            // =====================================================
            // 6. COMPLETAR CITA
            // =====================================================

            System.out.println("--- 6. COMPLETAR CITA MÉDICA ---");

            cita1.completarCita(
                    "Paciente en buenas condiciones. "
                            + "Continuar tratamiento indicado."
            );

            System.out.println(cita1);
            System.out.println();


            // =====================================================
            // 7. PRUEBA DE VALIDACIÓN DEFENSIVA
            // =====================================================

            System.out.println(
                    "--- 7. PRUEBA DE VALIDACIÓN DEFENSIVA ---"
            );

            System.out.println(
                    "Intentando crear un tratamiento "
                            + "con días de duración inválidos (0)..."
            );

            try {

                Tratamiento tratamientoInvalido = new Tratamiento(
                        "TRAT-ERR",
                        "Medicamento Prueba",
                        0,
                        15.0,
                        false
                );

            } catch (IllegalArgumentException e) {

                System.out.println(
                        "[✔] Excepción capturada correctamente: "
                                + e.getMessage()
                );
            }


            // =====================================================
            // FINAL
            // =====================================================

            System.out.println(
                    "\n======================================================="
            );

            System.out.println(
                    "     ¡EJECUCIÓN DEL PROYECTO COMPLETADA!"
            );

            System.out.println(
                    "======================================================="
            );

        } catch (Exception e) {

            System.err.println(
                    "Error inesperado durante la ejecución: "
                            + e.getMessage()
            );

            e.printStackTrace();
        }
    }
}