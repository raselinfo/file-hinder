public class Car{
    private String name;
    private String model;
    private String color;
    private int doors;
// Constructor
    public Car(String name, String model, String color, int doors){
        this.name=name;
        this.model=model;
        this.color=color;
        this.doors=doors;
    }
// Set default value
    public Car(){
        this("Demo Name","Demo Model","Demo Color",0);
    }
    public void move(){
        System.out.println("The car "+ this.name+" is moving.");
    }

    public void stop(){
        System.out.println("The car "+ this.name + " has stopped.");
    }

    public String getDetails(){
        return "Name: " + this.name + ", Model: " + this.model + ", Color: " + this.color + ", Doors: " + this.doors;
    }

    public boolean setDetails(String name, String model, String color, int doors){
        if(!(name.length() > 0) && !(model.length() > 0) && !(color.length() > 0) && !(doors > 0)){
            return false;
        }
        this.name=name;
        this.model=model;
        this.color=color;
        this.doors=doors;
      
        return true;
    }
    

}