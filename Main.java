public class Main{
    public static void main(String[] args){
        // System.out.println("Hello world");
        Car car1= new Car("Ferrari", "F50", "Red", 2);
        car1.setDetails("Rasel", "346sg", "green", 4);
        // System.out.println(car1.getDetails());

        Car car2=new Car();
        System.out.println(car2.getDetails());

    }
}