import java.time.LocalDate;

public class TestProducto {
    static void main(String[] args) {
        LocalDate caducidadPlatanos = LocalDate.of(2027, 3, 3);
        Producto[] listaCompra = {
                new Electronico("Lavadora", 370, 1, 23),
                new Alimento("Manzanas", 1.67, 12, 2026, 12, 2),
                new Alimento("Platanos", 1.88, 7, caducidadPlatanos)
        };

        for(Producto p : listaCompra){
            p.mostrarInformacion();
            System.out.println("Precio Total: " + p.calcularValorTotal());
            if(p instanceof Electronico){
                System.out.println("Fin de Garantía: " + ((Electronico) p).fechaGarantia(10, 2025));
            }
            System.out.println();
        }

        try {
            listaCompra[0].setCantidad(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Alimento comidaBarata = new Alimento("Berenjena", -200, 2, caducidadPlatanos);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
