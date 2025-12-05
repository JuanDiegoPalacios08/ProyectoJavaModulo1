import java.util.Scanner;

public class App {

    static String nombre = "N/A", estado = "N/A";
    static double nota1 = -1, nota2 = -1, nota3 = -1;
    static double promedio = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();

            opcion = leerEntero(sc, "Seleccione una opcion: ");

            switch (opcion) {
                case 1:
                    // TODO: Registrar datos de un estudiante
                    registrarEstudiante(sc);
                    break;
                case 2:
                    // TODO: Mostrar datos del estudiate actual
                    mostrarEstudiante(sc);
                    break;
                case 3:
                    // TODO: Calcular promedio de las notas
                    calcularPromedio();
                    break;
                case 4:
                    // TODO: Mostrar resumen del estudiante
                    mostrarEstudiante(sc);
                    System.out.printf("Promedio: %.2f%n", promedio);
                    setEstado();
                    break;
                case 5:
                    // TODO: Limpiar datos del estudiante
                    nombre = "N/A";
                    nota1 = -1;
                    nota2 = -1;
                    nota3 = -1;
                    estado = "N/A";
                    break;
                case 0:
                    System.out.println("Saliendo del progrma");
                    sc.close();
                    break;
                default:
                    break;
            }

        } while (opcion != 0);
    }

    static void mostrarMenu() {
        System.out.println("\n ---MENU DE GESTION DE ESTUDIANTES ---");
        System.out.println("1. Registrar datos de un estudiante");
        System.out.println("2. Mostrar datos del estudiante actual");
        System.out.println("3. Calcular promedio de notas");
        System.out.println("4. Mostrar resumen completo del estudiante");
        System.out.println("5. Limpiar datos del estudiante actual");
        System.out.println("0. Salir");
    }

    static int leerEntero(Scanner sc, String mensaje) {
        int numero;
        System.out.print(mensaje);
        numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    static double leerNota(Scanner sc, String mensaje) {
        double nota;
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().replace(",", ".");
            nota = Double.parseDouble(linea);
            if (validarNota(nota)) {
                break;
            } else {
                System.out.println("Nota invalida. Debe estar entre 0 y 100");
            }
        }
        return nota;
    }

    static void registrarEstudiante(Scanner sc) {
        nombre = validarNombre(sc);
        nota1 = leerNota(sc, "Ingrese la Nota 1: ");
        nota2 = leerNota(sc, "Ingrese la Nota 2: ");
        nota3 = leerNota(sc, "Ingrese la Nota 3: ");
        System.out.println("Datos del estudiante registrados correctamente.");
    }

    static void mostrarEstudiante(Scanner sc) {
        if (nombre.equals("N/A")) {
            System.out.println("No hay datos de estudiante registrados.");
        } else {
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
        }
    }

    static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 100;
    }

    static void calcularPromedio() {
        if (nombre.equals("N/A")) {
            System.out.println("No hay datos de estudiante registrados.");
        } else {
            promedio = (nota1 + nota2 + nota3) / 3;
            System.out.printf("Promedio: %.2f%n", promedio);
        }
    }

    static void setEstado() {
        estado = (promedio >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Estado: " + estado);
    }

    static String validarNombre(Scanner sc) {
        String nombreInput;
        while (true) {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombreInput = sc.nextLine().trim();
            if (!nombreInput.isEmpty()) {
                break;
            } else {
                System.out.println("El nombre no puede esta vacio");
            }
        }
        return nombreInput;
    }

}
