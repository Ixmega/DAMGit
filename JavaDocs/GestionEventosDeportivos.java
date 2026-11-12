import java.util.Scanner;

public class GestionEventosDeportivos {
    public static final String[] DIAS_FINDE = {
        "Viernes",
        "Sábado",
        "Domingo"
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bienvenido al gestor de eventos deportivos del%nfin de semana%n¿En que dia (Numero) cae el viernes? ");
        int viernes = sc.nextInt();
        System.out.println("Gestionaremos el finde (" + viernes + " - " + (viernes+2) + ")");
        System.out.println("¿Cuantos eventos se van a realizar?");
        int eventosTotales = sc.nextInt();
        EventoDeportivo[] eventos = new EventoDeportivo[eventosTotales];
        int opc = 0;

        do {
            System.out.println("\n===== GESTIÓN EVENTOS DEPORTIVOS =====");
            System.out.println("1. Registrar nuevo evento");
            System.out.println("2. Consultar eventos registrados");
            System.out.println("3. Gestionar evento");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    registrarEvento(sc, eventos, viernes);
                    break;

                case 2:
                    consultarEventos(sc, eventos);
                    break;

                case 3:
                    gestionarEvento(sc, eventos, viernes);
                    break;

                case 4:
                    System.out.println("bye bye");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opc != 4);

        sc.close();
    }

    public static void registrarEvento(Scanner sc, EventoDeportivo[] eventos, int finde){
        boolean hueco = false;
        for(int i = 0; i<eventos.length; i++){
            if(eventos[i] == null){
                System.out.println("Vamos a registrar un nuevo evento en la posicion " + i);
                eventos[i] = nuevoEvento(sc, finde);
                hueco = true;
                break;
            }
        }

        if(!hueco){
            System.out.println("No hay espacio para más eventos deportivos.");
        }
    }

    public static EventoDeportivo nuevoEvento(Scanner sc, int d){
        sc.nextLine();
        EventoDeportivo eventoACrear = new EventoDeportivo();
        System.out.print("Introduce el nombre del evento: ");
        eventoACrear.nombre = sc.nextLine();
        System.out.print("Introduce el deporte a practicar: ");
        eventoACrear.deporte = sc.nextLine();
        eventoACrear.dia = introducirDia(sc, d);

        int[] horario = introducirHorario(sc);
        eventoACrear.hora = horario[0];
        eventoACrear.minutos = horario[1];

        System.out.print("Introduce el numero de participantes: ");
        eventoACrear.participantes = sc.nextInt();
        return eventoACrear;
    }

    public static void consultarEventos(Scanner sc, EventoDeportivo[] eventos){
        int opc;
        System.out.println();
        System.out.println();

        do {
            System.out.println("\n===== CONSULTA DE EVENTOS =====");
            System.out.println("1. Consultar un evento");
            System.out.println("2. Buscar eventos por deporte");
            System.out.println("3. Buscar eventos por dia");
            System.out.println("4. Ver todos los eventos");
            System.out.println("5. Ver NºEventos y NºParticipantes");
            System.out.println("6. Cancelar");
            System.out.print("Selecciona una opción: ");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    int indice = buscarEvento(sc, eventos);
                    if(indice != -1){
                        eventos[indice].mostrarDatos();
                    }
                    break;

                case 2:
                    buscarEventosLista(sc, eventos, 0);
                    break;

                case 3:
                    buscarEventosLista(sc, eventos, 1);
                    break;

                case 4:
                    verTodosEventos(eventos);
                    break;

                case 5:
                    mostrarStats(eventos);
                    break;

                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opc != 6);
    }

    public static void verTodosEventos(EventoDeportivo[] eventos){
        for(EventoDeportivo evento : eventos){
            if(evento != null){
                evento.mostrarDatos();
            }
        }
    }

    public static int buscarEvento(Scanner sc, EventoDeportivo[] eventos){
        int ind = -1;
        sc.nextLine();
        System.out.println("Introduce el nombre del elemento a buscar: ");
        String nombreBuscado = sc.nextLine().trim().toLowerCase();
        System.out.println("En caso de duplicados se detectará el primero...");
        for(int i=0; i<eventos.length; i++){
            if(eventos[i] != null){
                if(eventos[i].nombre.toLowerCase().equals(nombreBuscado)){
                    ind = i;
                    break;
                }
            }
        }
        if(ind == -1){
            System.out.println("Evento no encontrado (-1)");
        }
        return ind;
    }

    public static void mostrarStats(EventoDeportivo[] eventos){
        int contador = 0;
        int[] participantes = new int[eventos.length];
        int participantesTotales = 0;

        for(int i=0; i<eventos.length; i++){
            if(eventos[i] != null){
                contador++;
                participantes[i] = eventos[i].participantes;
                participantesTotales += participantes[i];
            }
        }

        System.out.println("EVENTOS: " + contador + "/" + eventos.length);
        System.out.println("Participantes Totales: " + participantesTotales);

        for(int i=0; i<eventos.length; i++){
            if(eventos[i] != null){
                System.out.println("Participantes de " + eventos[i].nombre + ": " + participantes[i]);
            }
        }
    }

    public static void gestionarEvento(Scanner sc, EventoDeportivo[] eventos, int d){
        int opc;
        int indice = -1;

        do {
            System.out.println("\n===== GESTIÓN DE EVENTOS =====");
            System.out.println("1. Modificar evento");
            System.out.println("2. Eliminar evento");
            System.out.println("3. Cancelar");
            System.out.print("Selecciona una opción: ");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    indice = buscarEvento(sc, eventos);
                    if(indice != -1){
                        eventos[indice] = modificarEvento(sc, eventos[indice], d);
                    }
                    break;

                case 2:
                    indice = buscarEvento(sc, eventos);
                    if(indice != -1){
                        eventos[indice] = null;
                    }
                    break;

                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opc != 3);
    }


    public static EventoDeportivo modificarEvento(Scanner sc, EventoDeportivo eventoEditado, int d) {
        int opc;

        do {
            System.out.println("\n===== MODIFICAR EVENTO =====");
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar deporte");
            System.out.println("3. Modificar día");
            System.out.println("4. Modificar horario");
            System.out.println("5. Modificar participantes");
            System.out.println("6. Terminar modificación");
            System.out.print("¿Qué deseas modificar?: ");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Introduce el nuevo nombre: ");
                    eventoEditado.nombre = sc.nextLine();
                    break;

                case 2:
                    System.out.print("Introduce el nuevo deporte: ");
                    eventoEditado.deporte = sc.nextLine();
                    break;

                case 3:
                    eventoEditado.dia = introducirDia(sc, d);
                    break;

                case 4:
                    int[] horario = introducirHorario(sc);
                    eventoEditado.hora = horario[0];
                    eventoEditado.minutos = horario[1];
                    break;

                case 5:
                    System.out.print("Introduce el nuevo número de participantes: ");
                    eventoEditado.participantes = sc.nextInt();
                    break;

                case 6:
                    System.out.println("Modificación finalizada.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opc != 6);

        return eventoEditado;
    }


    public static String introducirDia(Scanner sc, int viernes) {

        int dia;
    
        do {
            System.out.println("\nSelecciona el día del evento:");
    
            for (int i = 0; i < DIAS_FINDE.length; i++) {
                System.out.println((viernes + i) + ". " + DIAS_FINDE[i]);
            }
    
            System.out.print("Día: ");
            dia = sc.nextInt();
            sc.nextLine();
    
            if (dia < viernes || dia > viernes + 2) {
                System.out.println("Día no válido. Inténtalo de nuevo.");
            }
    
        } while (dia < viernes || dia > viernes + 2);
    
        return (DIAS_FINDE[dia - viernes] + " " + dia);
    }


    public static int[] introducirHorario(Scanner sc) {

        int hora = -1;
        int minutos = -1;
        boolean valido = false;
    
        do {
            System.out.print("Introduce el horario (HH:MM): ");
            String horario = sc.nextLine();
    
            String[] partes = horario.split(":");
    
            if (partes.length == 2) {
                try {
                    hora = Integer.parseInt(partes[0]);
                    minutos = Integer.parseInt(partes[1]);
    
                    if (hora >= 0 && hora <= 23 &&
                        minutos >= 0 && minutos <= 59) {
    
                        valido = true;
    
                    } else {
                        System.out.println("Hora no válida. Ejemplo: 14:30");
                    }
    
                } catch (NumberFormatException e) {
                    System.out.println("Formato incorrecto. Ejemplo: 14:30");
                }
    
            } else {
                System.out.println("Formato incorrecto. Ejemplo: 14:30");
            }
    
        } while (!valido);
    
        return new int[]{hora, minutos};
    }
    
    public static void buscarEventosLista(Scanner sc, EventoDeportivo[] eventos, int tipo){
        boolean found = false;
        switch(tipo){
            case 0:
                System.out.print("Introduce el deporte buscado: ");
                String deporteBuscado = sc.nextLine().trim();
                for(EventoDeportivo evento : eventos){
                    if(evento != null && evento.deporte.trim().equalsIgnoreCase(deporteBuscado)){
                        evento.mostrarDatos();
                        found = true;
                    }
                }
                break;

            case 1:
                System.out.print("Introduce el dia o numero buscado: ");
                String diaBuscado = sc.nextLine().toLowerCase().trim();
                for(EventoDeportivo evento : eventos){
                    if(evento != null && evento.dia.trim().toLowerCase().contains(diaBuscado)){
                        evento.mostrarDatos();
                        found = true;
                    }
                }
                break;

            default:
                System.out.println("Parámetro " + tipo + " desconocido.");
                break;
        }

        if(!found){
            System.out.println("No se ha encontrado ningun evento.");
        }
    }

}

class EventoDeportivo{
    String nombre, deporte, dia;
    int hora, minutos, participantes;

    public void mostrarDatos(){
        System.out.println("\n===== DATOS DEL EVENTO =====");
        System.out.println("Nombre del evento: " + nombre);
        System.out.println("Deporte: " + deporte);
        System.out.println("Día: " + dia);
        System.out.println("Horario: " + hora + ":" + minutos);
        System.out.println("Número de participantes: " + participantes);
    }
}