package aplicacion;
import dominio.*;

public class Principal {
    public static void main(String[] args) {
        // Ejercicio 34: 
        System.out.println("Un algoritmo es un conjunto de secuencias que resuelve un problema");

        // Ejercicio 35
        int n = 5; // Número de elementos a sumar
        System.out.println("Suma de los primeros " + n + " números naturales:");
        System.out.println("Algoritmo Iterativo: " + Mates.sumaIterativa(n));
        System.out.println("Algoritmo Recursivo: " + Mates.sumaRecursiva(n));
        System.out.println();

        // Ejercicio 36
        System.out.println("O(n) muestra el peor caso de tiempo de ejecución de un algoritmo, donde n representa el tamaño del input");
        System.out.println();

        // Ejercicio 37
        System.out.println("La complejidad temporal de e = 1/2 * g * t^2 es O(1) ya que no depende del tamaño del input por lo que tiene un tipo constante .");
        System.out.println();

        // Ejercicio 38
        System.out.println("El método 'primero' tiene complejidad temporal O(1) ya que acceder al primer elemento de una lista ArrayList es una operación de tipo constante.");
        System.out.println("El método 'nEsimo' tiene complejidad temporal O(1) también ya que acceder a un elemento específico de una lista ArrayList es una operación de tipo constante.");
        
        // Ejercicio 39
        System.out.println("El algoritmo recursivo iterará hasta llegar a n = 0, lo que implica n + 1 llamadas recursivas. Por lo tanto, su complejidad temporal es O(n).");
        System.out.println("El algoritmo iterativo realizará exactamente n iteraciones del bucle for. Por lo tanto, su complejidad temporal también es O(n).");

        // Ejercicio 40
        System.out.println("Para el enfoque iterativo: El bucle se ejecutará exactamente n + 1 veces, donde n es el número dado. Por lo tanto, la complejidad temporal es O(n).");
        System.out.println("Para el enfoque matemático: La operación (n * (n + 1)) / 2 implica solo algunas operaciones aritméticas básicas, independientemente del tamaño de n. Por lo tanto, la complejidad temporal es O(1).");
        
        // Ejercicio 41
        System.out.println("la complejidad temporal de este algoritmo es O(n^2), ya que debe realizar una operación para cada uno de los n^2 elementos del producto cartesiano.");

        //Ejercicio 43
        System.out.println(" la complejidad temporal de este método es O(m*n), donde m es el número de filas y n es el número de columnas de la matriz.");

        //Ejercicio 44
        System.out.println("En el peor caso, cuando el número no está presente en el array o está al final del mismo, se deben recorrer todos los elementos del array. Por lo tanto, la complejidad temporal en el peor caso es O(n), donde n es el tamaño del array. En el mejor caso, cuando el número a buscar está en la primera posición del array, la complejidad es O(1). En el caso promedio, la complejidad es O(n/2)");

        //Ejercicio 45
        System.out.println("En el peor caso, la búsqueda binaria tiene una complejidad temporal de O(log n), donde n es el tamaño del array.");

        //Ejercicio 46
        System.out.println("El algoritmo recursivo para calcular el elemento n-ésimo de la sucesión de Fibonacci tiene una complejidad temporal de O(2^n) y una complejidad espacial de O(n).");    

        //Ejercicio 47
        System.out.println("se utiliza para describir el comportamiento asintótico de una función t y otra f");

        //Ejercicio 48 ?????
        //Ejercicio 49 ??????
        //Ejercicio 50 ????

        //Ejercicio 51
        System.out.println("el orden de crecimiento de estas funciones de menor a mayor es: f(0)<f(1)<f(2)<f(3)<f(4)"); 
        
        //Ejercicio 52

        //Ejercicio 53
        System.out.println("En un Arraylist ordenado la inserción en la posición correcta puede requerir un tiempo lineal en el peor de los casos, ya que puede ser necesario desplazar todos los elementos para abrir espacio mientras que en un  ArrayList no ordenado, la inserción al final del ArrayList es constante en el tiempo promedio, pero lineal en el peor caso");

        //Ejercicio 54

        //Ejercicio 55
        System.out.println(" El número de posiciones posibles en el ajedrez es extremadamente grande, lo que hace que sea computacionalmente imposible examinar exhaustivamente todas las posibles combinaciones de movimientos. Por lo tanto, el ajedrez es un problema NP-completo.");
      

    }
}
