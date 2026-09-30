# Diagrama de Clases - Sistema de Gestión de Clínica Veterinaria
**Packege:** `com.uped.veterinaria.modelo` 

```mermaid
classDiagram
    class Dueno {
        -String nombre
        -String dui
        -String telefono
        -String direccion
        +Dueno(String nombre, String dui, String telefono, String direccion)
        +getNombre() String
        +setNombre(String nombre) void
        +getDui() String
        +getTelefono() String
        +getDireccion() String
        +setDireccion(String direccion) void
        +toString() String
        
    }

    class Mascota {
        -String nombre 
        -String especie 
        -String raza 
        -int edad 
        -double peso 
        -Dueno dueno 
        +Mascota(String nombre, String especie, String raza, int edad, double peso, Dueno dueno) 
        +getNombre() String 
        +setNombre(String nombre) void 
        +getEspecie() String 
        +getRaza() String 
        +getEdad() int 
        +setEdad(int edad) void +getPeso() double +setPeso(double peso) void 
        +getDueno() Dueno 
        +setDueno(Dueno dueno) void 
        +esPacienteGeriatrico() boolean +toString() String

    }

    class Veterinario {
        -String nombre 
        -String numeroJvm 
        -String especialidad 
        -int aniosExperiencia 
        +Veterinario(String nombre, String numeroJvm, String especialidad, int aniosExperiencia) 
        +getNombre() String 
        +setNombre(String nombre) void 
        +getNumeroJvm() String 
        +getEspecialidad() String 
        +setEspecialidad(String especialidad) void +getAniosExperiencia() int 
        +setAniosExperiencia(int aniosExperiencia) void +toString() String

    }

    class CitaMedica { 
        -String codigoCita 
        -String fecha 
        -Mascota mascota 
        -Veterinario veterinario 
        -String motivo 
        -String estado 
        -String diagnostico 
        +CitaMedica(String codigoCita, String fecha, Mascota mascota, Veterinario veterinario, String motivo) 
        +completarCita(String diagnostico) void 
        +getCodigoCita() String 
        +getFecha() String 
        +getMascota() Mascota 
        +getVeterinario() Veterinario 
        +getMotivo() String +getEstado() String 
        +getDiagnostico() String +toString() String

    }

    class Tratamiento { 
        +double RECARGO\_CONTROL = 15.0 
        -String codigoTratamiento 
        -String nombreMedicamento 
        -int diasDuracion 
        -double costoBase 
        -boolean requiereControl 
        +Tratamiento(String codigoTratamiento, String nombreMedicamento, int diasDuracion, double costoBase, boolean requiereControl) 
        +calcularCostoTotal() double 
        +getCodigoTratamiento() String 
        +getNombreMedicamento() String 
        +setNombreMedicamento(String nombreMedicamento) void +getDiasDuracion() int 
        +setDiasDuracion(int diasDuracion) void +getCostoBase() double 
        +setCostoBase(double costoBase) void 
        +isRequiereControl() boolean 
        +setRequiereControl(boolean requiereControl) void 
        +toString() String

    }
    
    Dueno "1" <-- "0..*" Mascota : posee 
    Mascota "1" <-- "0..*" CitaMedica : registra 
    Veterinario "1" <-- "0..*" CitaMedica : atiende 
    CitaMedica "1" ..> "0..*" Tratamiento : prescribe

```      