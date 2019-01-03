
package deliverableTwo;

import java.util.Scanner; 
import static java.lang.Math.abs;


public class deliverableTwo {

    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        String word1;
        String word2;
        int i;
        int j;
        int unicodeValue1;
        int unicodeValue2;
        int sum1 = 0;
        int sum2 = 0;

        
        System.out.println("Please enter first word: ");
        word1 = scnr.nextLine();
        System.out.println("Please enter second word: ");
        word2 = scnr.nextLine();
        
        for (i=0; i < word1.length(); i++) {
        unicodeValue1 = word1.charAt(i); 
        System.out.println(unicodeValue1);
        sum1 += unicodeValue1;
        }
        
        for (j=0; j < word2.length(); j++) {
        unicodeValue2 = word2.charAt(j); 
        System.out.println(unicodeValue2);
        sum2 += unicodeValue2;
        }
        
        System.out.println("The sum of the Unicode values for the characters contained in the first string is: " + sum1);
        System.out.println("The sum of the Unicode values for the characters contained in the second string is: " + sum2);
        int absoluteValue = Math.abs(sum1 - sum2);
        System.out.println("The absolute value of the difference between the Unicode values of the two strings is: " + absoluteValue);
        
        
        
        
    }
}   
