public class Car extends Vehicle{

    private String color;
    
    public Car() {
    
        System.out.println("Inside Car Constructor");
    
    }
    
    public Car(String c) {
    
        System.out.println("slowly approaching the line..");
    
    }
            
    public void setColor (String c) {
    
        color = c;
    
    }
    public String getColor() {
    
        return color;
    
    }
    public void fillUp(){
    
        System.out.println("Filling with leaded fuel...");
    
    }
}
