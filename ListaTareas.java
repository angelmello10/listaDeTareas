import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaTareas {
    
    Scanner scan = new Scanner(System.in);
    private List<Tarea> listaDeTareas;

    public  ListaTareas(){
        listaDeTareas = new ArrayList<>();
    }

    public  void agregarTarea(Tarea nuevaTarea){
        listaDeTareas.add(nuevaTarea);
        System.out.println("\nTarea agregada correctamente!\n");
    }

                    //eliminar tarea

    public void eliminarTarea(String nombreTarea){
        for(int i = 0; i < listaDeTareas.size(); i++){
            Tarea tarea = listaDeTareas.get(i);

            if(tarea.getNombre().equals(nombreTarea)){
                listaDeTareas.remove(i);
                System.out.println("Tarea " + nombreTarea + " eliminada.");
                
            }else{
                System.out.println("No se encontró la tarea '" + nombreTarea + "' en la lista.");
            }
        } 
                       
          }

                                //Marcar tarea como completada**
          public void estadoTarea(String nombreTarea){
              for(Tarea tarea : listaDeTareas){
                    if(tarea.getNombre().equals(nombreTarea)){
                        tarea.setCompletada(true);
                        System.out.println("***Tarea " + nombreTarea + " marcada como completada***");
                        System.out.println();
                    }else{
                        System.out.println("No se encontró la tarea '" + nombreTarea + "' en la lista.");
                    }
                    
            }   
           
            
        }               //Mostrar lista de Tareas
            public void mostrarTarea(){
                if(listaDeTareas.size() >= 1){
                for(Tarea tarea : listaDeTareas){
                    System.out.println("\nEstas son las tareas registradas: ");
                    System.out.println("Nombre: " + tarea.getNombre());
                    System.out.println("Fecha de vencimiento: " + tarea.getFechaVencimiento());
                    System.out.println("Prioridad: " + tarea.getPrioridad());
                    System.out.println("Completada: " + (tarea.isCompletada()? "Si" : "No"));
                    System.out.println();
                    }
                    }else{
                        System.out.println("***Aún no has registrado una tarea***");
                }
    }

                public void mostrarMenu(){
                        StringBuilder menu = new StringBuilder();
                        menu.append("------ Menú de opciones ------\n");
                        menu.append("1. Agregar nueva tarea \n2. Eliminar tarea\n3. Marcar tarea como completada\n");
                        menu.append("4. Ver tareas\n5. Salir del programa\n");
                        menu.append("-------------------------------\n");
                        menu.append("Selecciona una opción: ");
                        System.out.print(menu);
                        

                }
                public void menu(){
                    
                    System.out.print("\nPresiona 'Y' para mostrar nuevamente el menú o cualquier tecla para salir: ");
                    String panelOption = scan.nextLine();
                    if (panelOption.equalsIgnoreCase("Y")) {
                        mostrarMenu();
                    }

                }
    }

