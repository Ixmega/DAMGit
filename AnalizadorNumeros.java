import java.util.Scanner;

//REPASO 2
public class AnalizadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("//REGISTRO NUMEROS//");
        for(int i = 0; i<10; i++){
            System.out.print("Introduce el entero Nº" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros);

        int[] conteo = contarNumeros(numeros);
        int positivos = conteo[0];
        int negativos = conteo[1];
        int ceros = conteo[2];

        int min = obtenerExtremo(numeros, 0);
        int max = obtenerExtremo(numeros, 1);

        mostrarDatos(numeros, suma, media, positivos, negativos, ceros, max, min);
    }

    public static int calcularSuma(int[] numeros){
        int suma=0;
        for(int i=0; i<numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }

    public static double calcularMedia(int[] numeros){
        double promedio = (double) calcularSuma(numeros) / numeros.length;
        return promedio;
    }

    public static int[] contarNumeros(int[] numeros){
        /* 0-positivos
         * 1-negativos
         * 2-ceros
         */
        int[] conteo = {0, 0, 0};

        for(int i=0; i<numeros.length; i++){
            if(numeros[i] > 0){
                conteo[0] += 1;
            } else if(numeros[i] < 0){
                conteo[1] += 1;
            } else {
                conteo[2] += 1;
            }
        }

        return conteo;
    }

    public static int obtenerExtremo(int[] numeros, int opc){
        /* opc 0 = Minimo
         * opc 1 = Maximo */
        int resultado = numeros[0];

        for(int i=1; i<numeros.length; i++){
            if((opc==0 && numeros[i] < resultado) || (opc==1 && numeros[i] > resultado)){
                resultado = numeros[i];
            }
        }

        return resultado;

    }

    public static void mostrarDatos(int[] numeros, int suma, double media, int positivos, int negativos, int ceros, int max, int min){
        System.out.println("//ESTADISTICAS DEL ARRAY//");
        System.out.print("Array: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i] + " | ");
        }
        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);

    }
}
