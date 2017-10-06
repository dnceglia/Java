import java.util.Scanner;

public class Factorial {
    
    public int calc_factorial(int f) {
        
    
        for (int i = 1; i <= f; i++){
               
            f = f * i;
        }
        
        return f;
    }

    public int getInt() {
    
    System.out.println("Please enter an integer : ");
    Scanner myint = new Scanner(System.in);
    
    // return ;
    
}
