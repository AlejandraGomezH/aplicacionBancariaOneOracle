import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        int cantidadRetiro = 0;
        double saldoDisponible = 1999.99;
        int opcion = 0;

            System.out.println("*************************");
            System.out.println("Nombre del cliente: " + nombreCliente);
            System.out.println("Tipo de cuenta: " + tipoCuenta);
            System.out.println("Saldo disponible: " + saldoDisponible);
            System.out.println("*************************");

        while (opcion != 9){
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1. Consultar");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("9. Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible +"$");
                    break;
                case 2:
                    System.out.println("¿Cuanto deseas retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if(saldoDisponible < valorRetirar){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldoDisponible = saldoDisponible - valorRetirar;
                        System.out.println("El saldo actualizado es:" + saldoDisponible);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto deseas depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldoDisponible  += valorDepositar;
                    System.out.println("Tu saldo es " + saldoDisponible);
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no válida");

            }


        }




    }
}