import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4M1C2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero entre 2 y 15: ");
        var n = scanner.nextInt();

        var lista = crearListaIntegers(n);
        imprimirMenu();

        scanner.nextLine(); //resolver el problema de leer numero y luego string

        var opcion = scanner.nextLine(); // A, B, C u Otra opcion
        scanner.close();

        ejecutarOpcion(lista, opcion);
    }

    static List<Integer> crearListaIntegers(int n) {
        var lista = new ArrayList<Integer>();

        for (var i = 1; i < n + 1; i++) {
            lista.add(i);
        }
        return lista;
    }

    static void imprimirMenu() {
        System.out.println("***Elija una opción:***");
        System.out.println("A: Sumar");
        System.out.println("B: Multiplicar");
        System.out.println("C: Listar elementos lista");
        System.out.println("D: Mostrar tamaño lista");
    }

    static void ejecutarOpcion(List<Integer> lista, String opcion) {
        switch (opcion) {
            case "A":
                sumarLista(lista);
                break;
            case "B":
                multiplicarLista(lista);
                break;
            case "C":
                imprimirLista(lista);
                break;
            case "D":
                mostrarTamLista(lista);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }

    static void sumarLista(List<Integer> listaInteger) {
        var suma = 0;
        for (var numeroInteger : listaInteger) {
            suma += numeroInteger;
            System.out.println(numeroInteger);
        }
        System.out.print("La suma es: " + suma);
    }

    static void multiplicarLista(List<Integer> listaInteger) {
        var multiplicar = 1;
        for (var numeroInteger : listaInteger) {
            multiplicar *= numeroInteger;
            System.out.println(numeroInteger);
        }
        System.out.print("La multiplicación es: " + multiplicar);
    }

    static void imprimirLista(List<Integer> listaInteger) {
        for (var numeroInteger : listaInteger) {
            System.out.print(numeroInteger + " ");
        }
    }

    static void mostrarTamLista(List<Integer> listaInteger) {
        var tamLista = listaInteger.size();
        System.out.println("La longitud de la lista es: " + tamLista);
    }
}


