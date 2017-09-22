import java.awt.*;
 
public class Triangle extends Shape {
    
    	public Triangle (double b, double h) {
    		
    		area = b * h / 2;
    		
    	}
    
        public void getArea () {
    	
    		System.out.println("Triangle's area = " + area);
    		    	
    	}
}