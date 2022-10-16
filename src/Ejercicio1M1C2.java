import java.util.Scanner;

public class Ejercicio1M1C2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero:");
        var a = scanner.nextInt();

        System.out.print("Ingrese otro numero entero:");
        var b = scanner.nextInt();

        imprimirMenu();

        scanner.nextLine(); //resolver el problema de leer numero y luego string

        var opcion = scanner.nextLine(); // A, B, C u Otra opcion
        scanner.close();

        ejecutarOpcion(opcion, a, b);
    }

    static void imprimirMenu() {
        System.out.println("***Elija una opción:***");
        System.out.println("A: Imprimir el mayor de los números");
        System.out.println("B: Imprimir el menor de los números");
        System.out.println("C: Sumarlos");
        System.out.println("D: Multiplicarlos");
        System.out.println("E: Restarlos");
        System.out.println("F: Dividirlos");
        System.out.println("G: Imprimir números entre ellos");
    }

    static void ejecutarOpcion(String letra, int x, int y) {
        switch (letra) {
            case "A":
                imprimirMayor(x, y);
                break;
            case "B":
                imprimirMenor(x, y);
                break;
            case "C":
                sumar(x, y);
                break;
            case "D":
                multiplicar(x, y);
                break;
            case "E":
                restar(x, y);
                break;
            case "F":
                dividir(x, y);
                break;
            case "G":
                System.out.println("Los numeros entre: " + x + " " + "y" + " " + y + " " + "son: ");
                imprimirNumerosEntreEllos(x, y);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }

    static void imprimirMayor(int x, int y) {
        System.out.print("El mayor de los numeros entre: " + x + " " + "y" + " " + y + " " + "es: " + y);
    }

    static void imprimirMenor(int x, int y) {
        System.out.print("El menor de los numeros entre: " + x + " " + "y" + " " + y + " " + "es: " + x);
    }

    static void sumar(int x, int y) {
        System.out.print("La suma es: " + (x + y));
    }

    static void restar(int x, int y) {
        System.out.print("La resta es: ");
    }

    static void multiplicar(int x, int y) {
        System.out.print("La multiplicación es: ");
    }

    static void dividir(int x, int y) {
        System.out.print("La división es: ");
    }

    static void imprimirNumerosEntreEllos(int x, int y) {
        for (var i = x; i <= y; i++) {
            System.out.println(i);
        }
    }
}
