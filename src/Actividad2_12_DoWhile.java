import java.util.Scanner;

public class Actividad2_12_DoWhile {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            int suma = 0;

            do {
                System.out.print("Ingresa un número (ingresa un número negativo para terminar): ");
                numero = scanner.nextInt();
                if(numero >= 0) {
                    suma += numero;
                }
            } while(numero >= 0);

            System.out.println("La suma de los números ingresados es: " + suma);
            scanner.close();
        }

}
