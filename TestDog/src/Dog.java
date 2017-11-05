
public class Dog implements Nameable {
    
    @Override
    public abstract String getName();
    
    @Override
    public abstract void setName(String n);
    
    Head head;
    String name;
    
    public void makeNoise(){
    
        System.out.println("Bark");
    
    }
    
}
