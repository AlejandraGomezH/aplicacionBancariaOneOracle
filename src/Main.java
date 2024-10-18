import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        int saldoDisponible = 0;
        int opcion = 0;

            System.out.println("*************************");
            System.out.println("Nombre del cliente: " + nombreCliente);
            System.out.println("Tipo de cuenta: " + tipoCuenta);
            System.out.println("Saldo disponible: " + saldoDisponible);
            System.out.println("*************************");

        while (opcion == 9){
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1. Consultar");
            System.out.println("2. Retorar");
            System.out.println("3. Depositar");
            System.out.println("9. Salir");
            opcion = teclado.nextInt();

            if (opcion == 1){
                System.out.println("El saldo actualizado es: " + saldoDisponible);
            }
        }


    }
}