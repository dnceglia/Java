
public class Assignment11 {


    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4); 
        
        Square square1 = new Square(2);
        Square square2 = new Square(5);
        
        Circle[] circleArray = new Circle[2];
        Square[] squareArray = new Square[2];
        
        circleArray[0] = circle1;
        circleArray[1] = circle2;
        
        squareArray[0] = square1;
        squareArray[1] = square2;
        
        System.out.println("Iterate through circle & square arrays\n");
        for (int i = 0; i < circleArray.length; i++) {
        
            circleArray[i].getArea();
            squareArray[i].getArea();
        
        }
        
        Shape[] shapeArray = new Shape[4];
        shapeArray[0] = circle1;
        shapeArray[1] = circle2;
        shapeArray[2] = square1;
        shapeArray[3] = square2;
        
        for(int x = 0; x < shapeArray.length; ++ x)
            shapeArray[x].getArea();
            
    }
    
}
