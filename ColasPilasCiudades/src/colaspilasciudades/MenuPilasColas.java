package colaspilasciudades;

import java.util.Scanner;

public class MenuPilasColas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola colaCiudades = new Cola();
        Pila pilaCiudades = new Pila();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Usar Colas");
            System.out.println("2. Usar Pilas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    manejarCola(scanner, colaCiudades);
                    break;
                case 2:
                    manejarPila(scanner, pilaCiudades);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 3);
    }

    public static void manejarCola(Scanner scanner, Cola cola) {
        int opcion;
        do {
            System.out.println("\nMenú Colas:");
            System.out.println("1.1. Insertar ciudad");
            System.out.println("1.2. Eliminar ciudad");
            System.out.println("1.3. Mostrar cantidad de ciudades");
            System.out.println("1.4. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    cola.insertar(scanner.nextLine());
                    System.out.println("Ciudad agregada.");
                    break;
                case 2:
                    System.out.println(cola.eliminar());
                    break;
                case 3:
                    System.out.println("Cantidad de ciudades en la cola: " + cola.tamanio());
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    public static void manejarPila(Scanner scanner, Pila pila) {
        int opcion;
        do {
            System.out.println("\nMenú Pilas:");
            System.out.println("2.1. Insertar ciudad");
            System.out.println("2.2. Retirar ciudad");
            System.out.println("2.3. Mostrar la última ciudad");
            System.out.println("2.4. Mostrar cantidad de ciudades");
            System.out.println("2.5. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    pila.insertar(scanner.nextLine());
                    System.out.println("Ciudad agregada.");
                    break;
                case 2:
                    System.out.println(pila.retirar());
                    break;
                case 3:
                    System.out.println(pila.verUltima());
                    break;
                case 4:
                    System.out.println("Cantidad de ciudades en la pila: " + pila.tamaño());
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
    

