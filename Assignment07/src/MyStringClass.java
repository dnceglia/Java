import java.util.Scanner;
import java.lang.Object;
import java.io.*;
import java.util.*;

public class MyStringClass {

    public String reverseString(String myStr) {
	
        myStr = getString();
        char[] reverseStringArray = myStr.toCharArray();
        for (int i = reverseStringArray.length - 1; i >= 0; i--)
        return myStr;
        
    }
    
    public String getString() {

        System.out.print("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return (str);
        
    }
    
}
