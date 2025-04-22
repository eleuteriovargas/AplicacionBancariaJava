
import java.util.Scanner;

public class AplicacionBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial
        int opcion;

        do {
            System.out.println("\nEl saldo actualizado es: $" + saldo);
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar saldo.");
            System.out.println("2 - Retirar.");
            System.out.println("3 - Depositar.");
            System.out.println("9 - Salir.");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("\nIngrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else if (retiro <= 0) {
                        System.out.println("Cantidad no válida.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Cantidad no válida.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 9:
                    System.out.println("\nSaliendo del sistema... ¡Gracias por usar nuestro banco!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}