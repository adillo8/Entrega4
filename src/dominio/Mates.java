package dominio;

public class Mates {

    //ejercicio 4 apartado 1
    public static int sumaNaturales(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser un entero positivo");
        }
        
        int acumulado = 0;
        for (int i = 1; i <= n; i++) {
            acumulado += i;
        }
        
        return acumulado;
    }

    //ejercicio 4 apartado 2
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser un entero positivo");
        }
        
        int acumulado = 1;
        for (int i = 1; i <= n; i++) {
            acumulado *= i;
        }
        
        return acumulado;
    }

    //ejercicio 4 apartado 3
    public static int potenciaNesima(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El exponente debe ser un entero positivo");
        }
        
        int acumulado = 1;
        for (int i = 1; i <= n; i++) {
            acumulado *= n;
        }
        
        return acumulado;
    }

    //ejercicio 4 apartado 4
    public static int sumaListaNumeros(int[] lista) {
        if (lista == null || lista.length == 0) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        
        int acumulado = 0;
        for (int i = 0; i < lista.length; i++) {
            acumulado += lista[i];
        }
        
        return acumulado;
    }

    //ejercicio 4 apartado 5
    public static int mediaListaNumeros(int[] lista) {
        if (lista == null || lista.length == 0) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        
        int acumulado = 0;
        for (int i = 0; i < lista.length; i++) {
            acumulado += lista[i];
        }
        
        return acumulado / lista.length; // Se cambió de división entera a división normal
    }

    //ejercicio 4 apartado 6
    public static double desviacionTipica(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo o vacío");
        }
        
        double acumulador = 0;
        for (int i = 0; i < array.length; i++) {
            acumulador += Math.pow(array[i] - mediaListaNumeros(array), 2);
        }
        
        return Math.sqrt(acumulador / array.length);
    }

    //ejercicio 4 apartado 7
    public static int sumaPares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser un entero positivo");
        }
        
        int acumulador = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                acumulador += i;
            }
        }
        
        return acumulador;
    }

    //ejercicio 4 apartado 8
    public static int sumaParesDos(int[] arrayList) {
        if (arrayList == null || arrayList.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo o vacío");
        }
        
        int acumulador = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                acumulador += i;
            }
        }
        
        return acumulador;
    }

    //ejercicio 4 apartado 9
    public static String obtenerListaPar(int[] arrayList) {
        if (arrayList == null || arrayList.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo o vacío");
        }
        
        StringBuilder listaPares = new StringBuilder();
        for (int i : arrayList) {
            if (i % 2 == 0) {
                listaPares.append(i).append(" ");
            }
        }
        return listaPares.toString();
    }

    //ejercicio 4 apartado 10
    public static String listaPares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser un entero positivo");
        }
        
        StringBuilder lista = new StringBuilder();
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                lista.append(i).append(",");
            }
        }
        return lista.toString();
    }

    //ejercicio 4 apartado 11
    public static int productoVectorial(int[] arrayList1, int[] arrayList2) {
        if (arrayList1 == null || arrayList1.length == 0 || arrayList2 == null || arrayList2.length == 0) {
            throw new IllegalArgumentException("Los arrays no pueden ser nulos o vacíos");
        }
        
        if (arrayList1.length != arrayList2.length) {
            throw new IllegalArgumentException("Los arrays deben tener la misma longitud");
        }
        
        int acumulador = 0;
        for (int i = 0; i < arrayList1.length; i++) {
            acumulador += arrayList1[i] * arrayList2[i];
        }
        return acumulador;
    }


}

// Los otros métodos permanecen sin cambios porque 
// no requieren verificaciones de entrada adicionales porque no tienen restricciones en los argumentos que reciben




