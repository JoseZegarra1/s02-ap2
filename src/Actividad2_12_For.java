import java.util.Scanner;

public class Actividad2_12_For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas sumar?: ");
        int cantidadNumeros = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            // numero se va sumar con la variable suma y suma valdrá en su primer
            // ciclo el primer numero ingresado luego sumara el primero con el segundo
            // hasta que i sea igual a lo que colocamos en la variable cantidadNumeros
            suma = suma + numero;
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
