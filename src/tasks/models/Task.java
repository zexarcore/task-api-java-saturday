package tasks.models;

public class Task {

    // Propiedades - Atributos
    private String name;
    private String description;
    private boolean status;

    // Constructores - Sobrecarga, porque son varios

    public Task(){} // forma #1 vacio

    public Task(String name, String description, boolean status){ // forma #2 con parametros
        this.name = name;
        this.description = description;
        this.status = status;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean getStatus(){
        return this.status;
    }
}
