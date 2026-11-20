package com.uped.veterinaria.modelo;

import com.uped.veterinaria.excepciones.DatoInvalidoException;
/**
 \* Subclase Veterinario con validaciones de Junta VET, especialidad, salario y control de cupos.
 \*/
public class Veterinario extends Persona {
    private String numJuntaVET;
    private String especialidad;
    private double salarioBase;
    private int citasAsignadasHoy;

    public Veterinario(String dui, String nombre, String telefono, String email,
                       String numJuntaVET, String especialidad, double salarioBase) {
        super(dui, nombre, telefono, email);
        setNumJuntaVET(numJuntaVET);
        setEspecialidad(especialidad);
        setSalarioBase(salarioBase);
        this.citasAsignadasHoy = 0; 
    }
    public String getNumJuntaVET() { return numJuntaVET; }
    public void setNumJuntaVET(String numJuntaVET) {
        if (numJuntaVET == null || numJuntaVET.isBlank() || !numJuntaVET.toUpperCase().startsWith("JV-")) {
            throw new DatoInvalidoException("El número de Junta VET debe iniciar con el prefijo 'JV-'", "NumJuntaVET"); 
        }
        this.numJuntaVET = numJuntaVET.trim().toUpperCase(); 
}

public String getEspecialidad() { return especialidad; }
public void setEspecialidad(String especialidad) {
    if (especialidad == null || especialidad.isBlank()) {
        throw new DatoInvalidoException("La especialidad del veterinario no puede estar vacía", "Especialidad"); 
    }
    this.especialidad = especialidad.trim();
}
    public double getSalarioBase() { return salarioBase; } 
    public void setSalarioBase(double salarioBase) {
        if (salarioBase &lt; 365.00) { 
            throw new DatoInvalidoException("El salario base no puede ser inferior al salario mínimo ($365.00)", "SalarioBase"); 
        }
        this.salarioBase = salarioBase; 
}

public int getCitasAsignadasHoy() { return citasAsignadasHoy; }

public void incrementarCitas() { 
    this.citasAsignadasHoy++; 
}

public void reiniciarCitasDiarias() { 
    this.citasAsignadasHoy = 0; 
}

@Override 
    public String getRol() { 
        return "Personal Veterinario (Junta: " + numJuntaVET + ")"; 
    } 
}
