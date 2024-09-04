/**
 * Zeke Strittmatter, modulus the number without using the operation
 */
public class ModulusCalc {
    public static void main(String args[]){
        int number = 1234;
        int mod = 103;
        int answer = (number-mod*(number/mod));  
        System.out.print(answer);
        
        
        /**
         * Implement your algorithm for calculating the modulus of any number 
         * without using the modulus operator.  For the above numbers, the result 
         * should be 101.  Test your algorithm against other values too! 
         */
    }
}
