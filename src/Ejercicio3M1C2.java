import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3M1C2 {
    public static void main(String[] args) {
        var palabrasLista = crearListaStrings(5);
        var variable = concatenarListaStrings(palabrasLista);

    }

    static List<String> crearListaStrings(int n) {
        var listaString = new ArrayList<String>();
        var scanner = new Scanner(System.in);

        for (var i = 1; i < n + 1; i++) {
            System.out.println("Ingrese la palabra " + i + ": ");
            listaString.add(scanner.nextLine());
        }

        scanner.close();
        return listaString;
    }

    static String concatenarListaStrings(List<String> lista) {
        var concatenar = " ";
        for (var palabraString : lista) {
            concatenar += palabraString + " ";
        }
        System.out.println(concatenar + "bota vieja");
        return concatenar;
    }
}