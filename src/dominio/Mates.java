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

    public static int f(int n) {
        if (n == 0) return 1;
        else if (n < 0) return -1;
        else{
            int m = 1/f(n/2) + f(n/2);
            return sumaIterativa(m);
        }
    }

}


    




