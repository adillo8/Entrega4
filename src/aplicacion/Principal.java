package aplicacion;
import dominio.Mates;

public class Principal {
    public static void main(String[] args) {
        //ejercicio 10
        System.out.println("la relacion entre list y el arraylist es que el array es una clase que implementa la interfaz list");
        //ejerccio 4 apartado 1
        System.out.println("la suma de los numeros hasta el 10 es "+Mates.sumaNaturales(-110));
        //ejercicio 4 apartado 2
        System.out.println("el factorial de 10 es "+Mates.factorial(10));
        //ejercicio 4 apartado 3
        System.out.println("la potencia n-esima de 2 es "+Mates.potenciaNesima(2));
        //ejercicio 4 apartado 4
        int[] lista = {1,2,3,4,5};
        System.out.println("la suma de los numeros de la lista es "+Mates.sumaListaNumeros(lista));
        //ejercicio 4 apartado 5    
        System.out.println("la media de los numeros de la lista es "+Mates.mediaListaNumeros(lista));
        //ejercicio 4 apartado 6
        System.out.println("la desviacion tipica de los numeros de la lista es "+ Mates.desviacionTipica(lista));
        //ejercicio 4 apartado 7
        System.out.println("La suma de los primeros números pares hasta n es "+Mates.sumaPares(9));
        //ejercicio 4 apartado 8
        System.out.println("La suma de los elementos pares de una lista de enteros es "+Mates.sumaParesDos(lista));
        //ejercicio 4 apartado 9
        System.out.println("La lista con los números pares de la lista inicial es "+Mates.obtenerListaPar(lista));
        //ejercicio 4 apartado 10
        System.out.println("La lista de los primeros números pares hasta n es "+Mates.listaPares(9));
        //ejercicio 4 apartado 11
        int[] lista2 = {1,2,3,};
        int[] lista3 = {2,4,6};
        System.out.println("Producto escalar de dos listas de números es "+Mates.productoVectorial(lista2, lista3));
    }
}
