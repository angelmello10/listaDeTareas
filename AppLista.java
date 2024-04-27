import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppLista {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        ListaTareas listaTareas = new ListaTareas();

        
           
        
        
        int opcion;
        do{
            listaTareas.mostrarMenu();
            opcion = scan.nextInt();

            switch (opcion) {
              
                case 1:
                    System.out.print("Ingresa el nombre de la tarea: ");
                    scan.nextLine();
                    String nombre = scan.nextLine();

                    System.out.print("Ingresa la fecha de vencimiento en este formato: YYYY-MM-DD: ");
                    String fechaVencimientoStr = scan.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaVencimiento = LocalDate.parse(fechaVencimientoStr, formatter);

                    System.out.print("Ingresa el nivel de prioridad del 1 al 5: ");
                    int prioridad = scan.nextInt();
                    scan.nextLine();
                    Tarea nuevaTarea = new Tarea(nombre, fechaVencimiento, prioridad);
                   
                   listaTareas.agregarTarea(nuevaTarea);
                              
                   break;
                case 2:
                    System.out.print("Ingresa el nombre de la tarea a eliminar: ");
                    scan.nextLine();
                    String nombredel = scan.nextLine();
                    
                    listaTareas.eliminarTarea(nombredel);
                       //Metodo de menu      
                           
                    break;
                case 3: 
                    System.out.print("Ingresa el nombre de la tarea completada: ");
                    scan.nextLine();
                    String nombreTarea = scan.nextLine();
                    listaTareas.estadoTarea(nombreTarea);
                     
                break;
                case 4:
                    
                    listaTareas.mostrarTarea();
                       //Metodo de menu     
                       scan.nextLine(); 
                      break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                    default:
                        System.out.println();
                        System.out.println("****Opción invalida, selecciona una opción correcta****\n");
                        listaTareas.mostrarMenu();
                    break;

               }
   
        }while (opcion !=5);
            
            scan.close();
    }

}
