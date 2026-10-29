import java.util.Scanner;
// SIGUIENTE PASO COLORINCHIS
public class DibujarTriangulo {
    public static final String[] COLORS = {
        "\u001B[31m", // 1. Rojo
        "\u001B[32m", // 2. Verde
        "\u001B[34m", // 3. Azul
        "\u001B[33m", // 4. Amarillo
        "\u001B[35m"  // 5. Morado
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0, tipo = 0, colorOpc = 0;
        String color;
        System.out.print("Cuántos triangulos vas a registrar? ");
        int quantity = sc.nextInt();
        Triangulo[] triangulos = new Triangulo[quantity];

        for(int i = 0; i<quantity; i++){
            System.out.println("Vamos a registrar el triangulo Nº" + (i+1));
            System.out.print("Introduce la altura del triangulo: ");
            altura = sc.nextInt();
            do{
                System.out.printf("Introduce el tipo de triangulo:%n   1. Triangulo Rectangulo Izquierda%n   2. Triangulo Rectangulo derecha%n   3. Triangulo Priamide%n   4. Arbol Navidad%nTu Opcion: ");
                tipo = sc.nextInt();
                if (tipo < 1 || tipo > 4) { System.out.println("Opcion no reconocida..."); }
            } while (tipo < 1 || tipo > 4);

            do{
                System.out.printf("Introduce el color del triangulo:%n   1. Rojo%n   2. Verde%n   3. Azul%n   4. Amarillo%n   5. Morado%nTu Opcion: ");
                colorOpc = sc.nextInt();
                if (colorOpc < 1 || colorOpc > 4) { System.out.println("Opcion no reconocida..."); }
            } while (colorOpc < 1 || colorOpc > 4);
            color = COLORS[colorOpc-1];

            triangulos[i] = new Triangulo(altura, tipo, color);
            triangulos[i].dibujarTriangulo();
        }

        sc.close();

    }
}

class Triangulo{
    int altura;
    /*  1. Triangulo Rectangulo Izquierda
        2. Triangulo Rectangulo Derecha 
        3. Triangulo Piramide
        4. Arbol Navidad*/
    int tipo;

    String color;

    public Triangulo(int altura, int tipo, String color){
        this.altura = altura;
        this.tipo = tipo;
        this.color = color;
    }

    public void dibujarTriangulo(){
        int posiciones = 0;
        System.out.print(this.color);
        switch(tipo){
            case 1:
                for(int i = 0; i<altura; i++){
                    for(int j = 0; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            
            case 2:
                for(int i = 1; i<=altura; i++){
                    for(int j = 0; j<altura; j++){
                        if(j>=altura-i){
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3:
                posiciones=altura*2-1;

                for(int i = 0; i<altura; i++){
                    for(int j = 0; j<posiciones; j++){
                        if(j >= (posiciones / 2 - i) && j <= (posiciones / 2 + i)){
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 4:
                posiciones=altura*2-1;

                for(int i = 0; i<altura; i++){
                    for(int j = 0; j<posiciones; j++){
                        if(i==0 && j == (posiciones/2)){
                            System.out.print("o ");
                        } else{
                            if(j > (posiciones / 2 - i) && j < (posiciones / 2 + i)){
                                System.out.print("* ");
                            } else if (j == (posiciones / 2 - i) || j == (posiciones / 2 + i)) {
                                System.out.print("o ");
                            } else{
                                System.out.print("  ");
                            }
                        }
                    }
                    System.out.println();
                }
                break;
        }
        System.out.print("\u001B[0m");
    }
}