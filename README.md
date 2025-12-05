# 🧮 Sistema Básico de Registro de Estudiantes

Este proyecto forma parte del **Módulo 1** y tiene como objetivo consolidar los conocimientos básicos de programación en Java mediante la creación de un sistema de consola que permite **registrar, consultar y calcular el promedio de notas de un estudiante**.

---

##  Objetivo del Proyecto

Desarrollar una aplicación en consola que:
- Registre los datos de un estudiante (nombre y tres notas).  
- Calcule el promedio y determine si el estudiante **aprueba o reprueba**.  
- Permita mostrar, limpiar o actualizar los datos registrados.  

---

## Características Principales

- Estructura basada en **métodos independientes**.  
- Uso de **variables estáticas** para mantener los datos del estudiante actual.  
- Validaciones de entrada para evitar errores (nombre vacío o notas fuera del rango 0–100).  
- Interfaz de texto clara e intuitiva.  
- Menú principal controlado desde el método `main()`.

---

## Menú Principal

```text
--- Menú de Gestión de Estudiantes ---

1. Registrar datos de un estudiante
2. Mostrar datos del estudiante actual
3. Calcular promedio de notas
4. Mostrar resumen completo del estudiante
5. Limpiar datos del estudiante actual
0. Salir
```

---

## Estructura del Código

| Método | Descripción |
|--------|--------------|
| `mostrarMenu()` | Muestra las opciones disponibles. |
| `registrarEstudiante()` | Pide nombre y notas, validando cada entrada. |
| `mostrarEstudiante()` | Imprime los datos actuales del estudiante. |
| `calcularPromedio()` | Calcula e imprime el promedio de notas. |
| `setEstado()` | Determina si el estudiante aprueba o reprueba. |
| `leerNota()` | Lee y valida una nota ingresada. |
| `validarNota()` | Retorna `true` si la nota está entre 0 y 100. |
| `validarNombre()` | Asegura que el nombre no esté vacío. |

---

## Lógica del Programa

1. El programa inicia mostrando el **menú principal**.  
2. El usuario selecciona una opción.  
3. Se ejecuta el método correspondiente.  
4. El menú se repite hasta que el usuario elija **0 (Salir)**.  

---

## Ejecución

1. Compila el programa:  
   ```bash
   javac App.java
   ```
2. Ejecuta el programa:  
   ```bash
   java App
   ```

---

## Ejemplo de Salida

```text
--- Menú de Gestión de Estudiantes ---
1. Registrar datos de un estudiante
2. Mostrar datos del estudiante actual
3. Calcular promedio de notas
4. Mostrar resumen completo del estudiante
5. Limpiar datos del estudiante actual
0. Salir
Seleccione una opción: 1
Ingrese el nombre del estudiante: María López
Ingrese la nota 1: 80
Ingrese la nota 2: 90
Ingrese la nota 3: 70
Datos del estudiante registrados correctamente.

Promedio: 80.00
Estado: Aprobado
```
