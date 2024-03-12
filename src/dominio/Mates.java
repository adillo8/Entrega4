package dominio;
import java.util.ArrayList;

public class Mates {
    
    // Algoritmo Iterativo para sumar los primeros n números naturales
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Algoritmo Recursivo para sumar los primeros n números naturales
    public static int sumaRecursiva(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }

}


    




