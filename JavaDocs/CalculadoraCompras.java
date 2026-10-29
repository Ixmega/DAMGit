import java.util.Scanner;

//REPASO 1
public class CalculadoraCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productosTotales = 0;
        System.out.println("Vamos a realizar tu compra, puedes comprar hasta 5 productos diferentes.");
        do{
            System.out.print("Introduce el numero de productos: ");
            productosTotales = sc.nextInt();
            sc.nextLine();
            if(productosTotales == 0){
                System.out.println("No hay productos a registrar?");
            } else if (productosTotales < 0){
                System.out.println("Valor inválido...");
            } else if (productosTotales > 5){
                System.out.println("Solo podemos registrar hasta 5 productos.");
            }
        } while (productosTotales <= 0 || productosTotales > 5);
        Producto[] productos = new Producto[productosTotales];

        for(int i = 0; i<productosTotales; i++){
            System.out.println("///VAMOS A REGISTRAR EL PRODUCTO Nº" + (i+1) + "///");
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("Precio Unitario: ");
            double precio = sc.nextDouble();
            System.out.print("Cantidad comprada: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            System.out.println();
            productos[i] = new Producto(nombre, precio, cantidad);
        }

        int opc;
        double[] descuentos = new double[productosTotales];
        boolean descuentosCalculados = false, importesCalculados = false;
        double precioTotal;
        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Mostrar datos de productos");
            System.out.println("2. Calcular descuento de productos");
            System.out.println("3. Calcular importe de productos");
            System.out.println("4. Calcular total compra");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();


            switch (opc) {
                case 1:
                    mostrarDatos(productos, importesCalculados, descuentosCalculados, descuentos);
                    break;

                case 2:
                    for(int i=0; i<productos.length; i++){
                        descuentos[i] = productos[i].calcularDescuento();
                        System.out.println("Descuento del producto " + (i+1) + ": " + descuentos[i]);
                    }
                    descuentosCalculados = true;
                    break;

                case 3:
                    if(descuentosCalculados){
                        for(int i=0; i<productos.length; i++){
                            productos[i].calcularImporte(descuentos[i]);
                            System.out.println("Importe final del producto " + (i+1) + ": " + productos[i].importeFinal);
                        }
                        importesCalculados = true;
                    } else {
                        System.out.println("Tendrías que calcular primero los descuentos...");
                    }
                    break;

                case 4:
                    if(importesCalculados){
                        precioTotal = calcularTotalCompra(productos);
                        System.out.println("El precio total de tu compra es: " + precioTotal);
                    } else {
                        System.out.println("Tendrías que calcular primero los importes finales...");
                    }
                    break;

                case 5:
                    System.out.println("bye bye");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 5);

        sc.close();
    }
   
    public static double calcularTotalCompra(Producto[] productos){
        double precioTotal=0;
        for(int i = 0; i<productos.length; i++){
            precioTotal += productos[i].importeFinal;
        }
        return precioTotal;
    }

    public static void mostrarDatos(Producto[] productos, boolean importeCalculado, boolean descuentosCalculados, double[] descuentos){
        for(int i = 0; i<productos.length; i++){
            System.out.println("//DATOS DEL PRODUCTO " + (i+1) + "//");
            System.out.println("Nombre: " + productos[i].nombre);
            System.out.println("Precio Unitario: " + productos[i].precio);
            System.out.println("Cantidad: " + productos[i].cantidad);
            System.out.println("Importe Base: " + productos[i].importeBase);

            if (descuentosCalculados) {
                System.out.println("Descuento: " + descuentos[i]);
            } else {
                System.out.println("Descuento desconocido");
            }

            if(!importeCalculado){
                System.out.println("Importe Final Desconocido");
            } else{
                System.out.println("Importe Final: " + productos[i].importeFinal);
            }

            System.out.println();
        }
    }

}

class Producto{
    String nombre;
    double precio, importeBase, importeFinal = 0;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importeBase = cantidad * precio;
    }

    public double calcularDescuento(){
        double descuento = 0;
        if (importeBase >= 100){
            descuento = importeBase * 0.15;
        } else if (importeBase >= 50){
            descuento = importeBase * 0.05;
        }
        return Math.round(descuento * 100.0) / 100.0;
    }

    public void calcularImporte(double descuento){
        this.importeFinal = importeBase - descuento;
    }

}
