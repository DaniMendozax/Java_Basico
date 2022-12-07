import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, number;
        double type, amount;

        //Se crea objeto cuenta1 sin parametros
        //Se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        name = sc.nextLine();
        System.out.print("Número de cuenta : ");
        number = sc.nextLine();
        System.out.print("Tipo de interes : ");
        type = sc.nextDouble();
        System.out.print("Saldo: ");
        amount = sc.nextDouble();

        cuenta1.setName(name);
        cuenta1.setAccountNumber(number);
        cuenta1.setTipoInteres(type);
        cuenta1.setSaldo(amount);

        //Se crea el objeto cuenta2 con los valores leidos por teclado
        //Se ejecuta el constructor con parametros
        Cuenta cuenta2 = new Cuenta("Daniel Mendoza", "123456789101112", 1.75, 300);

        // Se crea cuenta3 como copia de cuenta1
        //Se ejecuta el constructor copia

        Cuenta cuenta3 = new Cuenta(cuenta1);

        //Mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getName());
        System.out.println("Número de cuenta: " + cuenta1.getAccountNumber());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        // Se realiza un ingreso en cuenta1
        cuenta1.ingreso(4000);

        //Mostrar el saldo de cuenta1 despues del ingreso
        System.out.println("Saldo " + cuenta1.getSaldo());

        // Mostrar los datos de la cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getName());
        System.out.println("Número de cuenta: " + cuenta2.getAccountNumber());
        System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //Mostrar los datos de la cuenta3
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getName());
        System.out.println("Número de cuenta: " + cuenta3.getAccountNumber());
        System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //Realizar una transferencia de 10 euros desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

        //Mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //Mostrar el saldo de la cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();
    }
}