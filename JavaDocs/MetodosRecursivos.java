import java.util.Scanner;

public class MetodosRecursivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            // Mostrar el menú principal
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Secuencia de Fibonacci");
            System.out.println("2. Calcular Potencia");
            System.out.println("3. Calcular Factorial");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción (1-4): ");
            
            opc = sc.nextInt();

            // Switch que controla el menú y llama a cada función
            switch (opc) {
                case 1:
                    calcularFibonacci(sc);
                    break;

                case 2:
                    calcularPotencia(sc);
                    break;

                case 3:
                    calcularFactorial(sc);
                    break;

                case 4:
                    System.out.println("\nbye bye");
                    break;

                default:
                    System.out.println("\nOpción no válida...");
            }

        } while (opc != 4);

        sc.close();
    }

    public static void calcularFibonacci(Scanner sc){
        int numFib;
        int a=0, b=1;

        System.out.println("¿Cuántos números de la secuencia de fibonacci quieres?");
        numFib = sc.nextInt();
        
        if(numFib != 0) { fibonacci(numFib, a, b); }
    }

    public static void fibonacci(int indice, int a, int b){
        System.out.print(a + " | ");
        int next = a+b;
        a=b;
        b=next;
        indice--;
        if(indice != 0){
            fibonacci(indice, a, b);
        }
    }

    public static void calcularPotencia(Scanner sc){
        int base, exp;
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        exp = sc.nextInt();

        int resultado = potencia(base, exp, 1);
        System.out.print("El resultado es: " + resultado);
    }

    public static int potencia(int b, int e, int acum){
        if(e!=0){
            acum *= b;
            e--;
            return potencia(b, e, acum);
        }else{
            return acum;
        }
    }

    public static void calcularFactorial(Scanner sc){
        int n;
        System.out.print("Introduce n: ");
        n = sc.nextInt();
        int resultado = factorial(n, 1);
        System.out.print(" = " + resultado);
    }

    public static int factorial(int n, int acum){
        if(n!=0){
            if(n==1){
                System.out.print(n);
            } else{
                System.out.print(n + " + ");
            }
            acum += n;
            n--;
            return factorial(n, acum);
        } else{
            return acum;
        }
    }
}
