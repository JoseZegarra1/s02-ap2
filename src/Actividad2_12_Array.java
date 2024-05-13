public class Actividad2_12_Array {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};

        int suma = 0;
        //numeros.length
        for (int i = 0; i < 5; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los números en el array es: " + suma);
    }
}
