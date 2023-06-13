import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la serie de Fibonacci: ");
        long valor = scanner.nextLong();

        SerieFibonacci serie = new SerieFibonacci(valor);

        System.out.println("Serie de Fibonacci:");
        System.out.println(serie);

        System.out.print("Ingrese un número de Fibonacci para buscar su posición: ");
        long numeroFibonacci = scanner.nextLong();

        long posicion = serie.obtenerPosicionDeFibonacci(numeroFibonacci);
        if (posicion != -1) {
            System.out.println("El número " + numeroFibonacci + " se encuentra en la posición " + (posicion + 1) + " de la serie.");
        } else {
            System.out.println("El número " + numeroFibonacci + " no está en la serie de Fibonacci.");
        }
    }
}