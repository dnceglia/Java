import java.util.Scanner;

class Factorial {
    
    public int calc_factorial(int f) {
       	
        for (int i = f - 1; i >= 1; i--){
               
            f = f * i;
            
        }
        
        return f;
        
    }

    public int getInt() {
    
    int usersNumber;
    System.out.println("Please enter a number : ");
    Scanner inputNumber = new Scanner(System.in);
    usersNumber = inputNumber.nextInt();
    return usersNumber;
    
    }
    
}