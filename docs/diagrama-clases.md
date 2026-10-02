# Diagrama de Clases - Sistema de Gestión de Clínica Veterinaria
**Packege:** `com.uped.veterinaria.modelo` 

```mermaid
classDiagram 
    %% Interfaz propia (Nelson) 
    class Facturable {
        <<interface>>
        +calcularMontoTotal() double 
        +generarComprobante() String
    }

    %% Clase Abstracta Base (Nathaly / Jessie) 
    class Persona {
        <<abstract>>
        #String nombre 
        #String dui #String telefono 
        #String direccion 
        +getNombre() String 
        +setNombre(String) void 
        +getDui() String 
        +getTelefono() String 
        +getDireccion() String
    }

    %% Subclases de Persona (Herencia - Jessie) 
    class Dueno { 
        +Dueno(String, String, String, String) 
        +toString() String
    }

    class Veterinario { 
        -String idVeterinario 
        -String especialidad 
        -double salario 
        +Veterinario(String, String, String, double) 
        +getIdVeterinario() String 
        +getEspecialidad() String 
        +toString() String
    }

    %% Entidades del Dominio Veterinario 
    class Mascota { 
        -String nombre 
        -String especie 
        -String raza 
        -int edad 
        -double peso 
        -Dueno dueno 
        +Mascota(String, String, String, int, double, Dueno) 
        +esPacienteGeriatrico() boolean 
        +toString() String
    }

    class Tratamiento { 
        -String codigo 
        -String descripcion 
        -int diasDuracion 
        -double costo 
        -boolean requiereControl 
        +Tratamiento(String, String, int, double, boolean) 
        +getRequiereControl() boolean 
        +calcularMontoTotal() double 
        +generarComprobante() String 
        +toString() String
    }

    class CitaMedica { 
        -String idCita 
        -String fecha 
        -String hora 
        -String motivo 
        -Mascota mascota 
        -Veterinario veterinario 
        -Tratamiento tratamiento 
        +CitaMedica(String, String, String, String, Mascota, Veterinario, Tratamiento) 
        +calcularMontoTotal() double 
        +generarComprobante() String 
        +toString() String
    }

    %% Relaciones de Herencia (extends) 
    Persona <|-- Dueno : Hereda (extends) 
    Persona <|-- Veterinario : Hereda (extends)

    %% Relaciones de Implementacion (implements) 
    Facturable <|.. Tratamiento : Implementa 
    Facturable <|.. CitaMedica : Implementa

    %% Relaciones de Asociacion 
    Mascota "1" --> "1" Dueno : Pertenece a 
    CitaMedica "1" --> "1" Mascota : Asignada a 
    CitaMedica "1" --> "1" Veterinario : Atendida por 
    CitaMedica "1" --> "1" Tratamiento : Incluye
    
    
    

        

```      