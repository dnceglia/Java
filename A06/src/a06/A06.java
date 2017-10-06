public class A06 {
    
    public static void main(String args[]){
        
        // create a Factorial object
        Factorial factorial = new Factorial();

        // obtain an integer from the console
        int myint = factorial.getInt();

        // calculate the factorial of the number
        System.out.println("Factorial of " + myint + " is: " + factorial.calc_factorial(myint));

    }
    
}
