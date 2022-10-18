import java.util.Scanner;

public class Ejercicio2M1C2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero:");
        var n = scanner.nextInt();

        System.out.print("Ingrese otro numero entero:");
        var m = scanner.nextInt();

        scanner.close();

        if (n < m) {
            System.out.println("Favor el primer número tiene que ser menor que el segundo");
        } else {
            imprimirMultiplosGeneralizados(n, m);
        }
    }

    static void imprimirMultiplosGeneralizados(int x, int y) {
        System.out.println("El resultado es: ");
        for (var i = y; i <= x; i++) {
            if (i % y == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
