package com.uped.veterinaria.modelo;
public abstract class Persona {
    protected String nombre;
    protected String dui;
    protected String telefono;
    protected String direccion;

    public Persona(String nombre,
                   String dui,
                   String telefono,
                   String direccion) {
        validarDatosBasicos(nombre, dui);
        this.nombre = nombre.trim();
        this.dui = dui.trim();
        this.telefono = (telefono != null && !telefono.isBlank())
                ? telefono.trim()
                : "SIN TELEFONO";
        this.direccion = (direccion != null && !direccion.isBlank())
                ? direccion.trim()
                : "SIN DIRECCION";
    }

    private void validarDatosBasicos(String nombre, String dui) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre de la persona no puede estar vacío."
            );
        }
        if (dui == null || dui.isBlank()) {
            throw new IllegalArgumentException(
                    "El DUI de la persona no puede estar vacío."
            );
        }
    }


    public String getNombre() {
        return nombre;
    }
    public String getDui() {
        return dui;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    public String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }

    public abstract String getRol();

    public abstract String getDetalleCompleto();
}


