
public class Dog extends Mammal implements Nameable{
    
    Head head;
    String name;
    
    public void makeNoise(){
    
        System.out.println("Bark");
    
    }
    
    public void setName(String n) {
    
        name = n;
    
    }
    
    public String getName() {
        
        return name;
        
    }
    
}
