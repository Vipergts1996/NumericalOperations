/**
 * Zeke Strittmatter prints numbers backwards
 */

public class NumReverse {
    public static void main(String args[]){
        
        int n1 = 1234; 
        int n2 = 6789; 
        int n3 = 1080; 

        System.out.print(n1 % 10);
        n1/=10;
        System.out.print(n1 % 10);
        n1/=10;
        System.out.print(n1 % 10);
        n1/=10;
        System.out.println(n1 % 10);
        n1/=10;
        
        System.out.print(n2 % 10);
        n2/=10;
        System.out.print(n2 % 10);
        n2/=10;
        System.out.print(n2 % 10);
        n2/=10;
        System.out.println(n2 % 10);
        n2/=10;

        System.out.print(n3 % 10);
        n3/=10; 
        System.out.print(n3 % 10);
        n3/=10; 
        System.out.print(n3 % 10);
        n3/=10; 
        System.out.print(n3 % 10);
        n3/=10; 
        
        
        
        
        
        /*
         * Implement your number reversal algorithm below
         * Your code should work for any 4 digit integer.  
         * When your code is ran the original and the 
         * reversed number should print to the console.  
         */
    }
}
