public class Methods{

    public static void main(String[] args) {
    
        System.out.println("Hello and Welcome to the era of the Muscle Car!");
        
        Car mustang = new Car("Grey");
        
        Car camaro = new Car("White");
        
        Car firebird = new Car("Black");
        
        Car charger = new Car("Orange");
        
            mustang.setColor("only comes one way, rusty...");
            
            camaro.setColor("with Red racing stripes");
            
            firebird.setColor("has a screaming chicken on the hood!!");
            
            charger.setColor("has the Duke brothers in it!! ");
            
            charger.fillUp();
        
        System.out.println("The rustang " + mustang.getColor());
        
        System.out.println("The camaro is accented " + camaro.getColor());
        
        System.out.println("The firebird " + firebird.getColor());
        
        System.out.println("Finally, the charger " + charger.getColor());
        
        
    
    }

}

