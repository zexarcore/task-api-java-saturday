package tasks.useCases; // Ruta de la clase

import java.util.List;

import tasks.models.Task; // Importa la clase Task desde el paquete tasks.models

public class TaskUseCase {

    // Final es una palabra clave en Java que indica que la variable no puede ser reasignada después de su inicialización.

    private final List<Task> tasks; // Declara una variable de tipo List Task como final.
    
    // Constructor de la clase TaskUseCase
    public TaskUseCase(){
        this.tasks = new ArrayList<>(); // Inicializa la lista de tareas como una nueva instancia de ArrayList.
    }

    // Consultar todas las tareas
    public List<Task> all() {
        return this.tasks; // Devuelve la lista de tareas.
    }

    // Consultar una tarea por indice
    public Task getByIndex(int index) {
        return this.tasks.get(index); // Devuelve la tarea en el índice especificado.
    }

    // Crear la tarea
    public Task create(Task newTask){
        this.tasks.add(newTask);
        return newTask;
    }

    // Actualizar tarea

    public Task update (int index,Task update ){
        
        Task task = new Task(); // tarea por defecto vacia
        
        for (int i = 0; i < this.tasks.size(); i++){ 
            if  (index == i){
                this.tasks.set(i, update);
                task = update; // tarea actualizada
            }     
        }

        return task; // retorna la tarea actualizada o vacia si no se encontro
    }

    // Eliminar tarea
    public void deleteById (int index){
        this.tasks.remove(index);
    }
}
