# 🐾 Sistema de Gestión Veterinaria — UPED (Equipo 7)
**Universidad Pedagógica de El Salvador "Dr. Luis Alonso Aparicio"**
**Facultad de Ingeniería — Asignatura:** Programación III (LG-016)
**Ciclo Académico:** 02-2026 | **Docente:** Ing. Oscar Armando Contreras Álvarez
**Repositorio:** `Lab_progra_EQ7` (Proyecto Incremental — Laboratorio 2)
--- 
## 👥 Integrantes y Coevaluación de Participación Individual
*De acuerdo con la normativa del Laboratorio 2, la coevaluación mide la participación individual acordada en consenso por el equipo en una escala de 0% a 100%: *

| Nombre Completo | Carnet | Coevaluación (%) | Concepto Asignado para Defensa | 
| :--- | :---: | :---: | :--- | 
| **Argumedo Cabrera, Jacqueline Ivonne** | `AC-69824-25` | **100%** | **Polimorfismo** (Sobrecarga y Sobrescritura) | 
| **Flores Gomez, Nathaly Marily** | `FG-69717-25` | **100%** | **Clases Abstractas** (`abstract class` y métodos abstractos) | 
| **Ordoñes Cardona, Jessie Carolina** | `OC-70296-25` | **100%** | **Herencia** (`extends` y `super`) | 
| **Marroquin Henriquez, Nelson Josue** | `MH-69803-25` | **100%** | **Interfaces** (`interface` e `implements`) | 
| **Duran Martinez, Jose Alberto** | `DM-67761-24` | **100%** | **Integración, Kanban, README y Video** | 
--- 
## 📖 Descripción y Evolución del Proyecto
El **Sistema de Gestión Veterinaria** es una aplicación orientada a objetos diseñada para automatizar el control de consultas, mascotas, dueños, tratamientos y personal médico veterinario. 

En esta **segunda iteración (Unidades II y III)**, el modelo evolucionó mediante la incorporación de los principios avanzados de POO:
* **Herencia (`extends` / `super`):** Reutilización de código base a partir de superclases organizadas. 
* * **Clases Abstractas (`abstract class`):** Definición de contratos obligatorios de comportamiento para las entidades del modelo. 
* * **Polimorfismo:** Implementación de ligadura estática (sobrecarga de métodos) y ligadura dinámica (sobrescritura `@Override`). 
* * **Interfaces (`interface` / `implements`):** Contratos de comportamiento independientes aplicados de forma polimórfica. 
* * **Programación Defensiva (*Fail-Fast*):** Validaciones centralizadas en constructores y setters que lanzan `IllegalArgumentException` ante datos nulos o inválidos. 
--- 
## 🛠️ Requisitos de Entorno e Instrucciones de Ejecución 
### Requisitos Previos 
* **Java Development Kit (JDK):** Versión 21 o superior instalado. 
* * **IDE Recomendado:** IntelliJ IDEA, Eclipse o VS Code (opcional). 
--- 
### 🖥️ Compilación y Ejecución desde Terminal 
1. **Clonar el repositorio y posicionarse en la raíz del proyecto:** 

```bash
git clone https://github.com/lilcoopertino-sudoLab_progra_EQ7.git 
cd Lab_progra_EQ7
```

## 🤖 Nota sobre el Uso Responsable de Inteligencia Artificial (Gemini Notebook)

De acuerdo con lo estipulado en la guía de la asignatura, se declara de forma transparente el uso de **Gemini Notebook** como herramienta de apoyo pedagógico durante el desarrollo de este proyecto: 
* **Naturaleza del Asistente (Gemini Notebook):** Se utilizó un entorno de IA alimentado e integrado **directamente con los contenidos y guías de trabajo vistos en clase** (cuadernillos, guías prácticas de las Semanas 2 a la 9 y la rúbrica del Laboratorio 2). Esto garantizó que todas las respuestas y sugerencias estuvieran estrictamente delimitadas por los lineamientos académicos impartidos por el docente. 
* **Propósito y Metodología de Uso:** Se empleó mediante **consultas puntuales y preguntas exactas** sobre los requerimientos específicos del proyecto. Se utilizó para: 
1. Revisar y validar la sintaxis de patrones avanzados en Java (programación defensiva *fail-fast*, visibilidad `protected`, jerarquías de herencia, clases abstractas, interfaces y polimorfismo). 
2. Apoyar en la estructuración de las fichas de trabajo y criterios de aceptación para el tablero Kanban. 
3. Formatear la documentación técnica del proyecto. * **Validación y Verificación:** Todo el código y las recomendaciones conceptuales brindadas por la herramienta fueron probados, analizados e integrados manualmente por el equipo, ejecutando verificaciones locales desde la terminal (`javac` y `java`) para asegurar el correcto funcionamiento del sistema.


