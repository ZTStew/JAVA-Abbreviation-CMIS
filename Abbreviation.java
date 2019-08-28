/*
 * Program that takes a string/sentence and then abreviates any words greater than
 * 5 letters by only listing the first letter of the word followed by the number
 * of letters being removed and then followed by the last letter of the word.
 *
 * @author Stewart
 * @version JAVA 8, 7/17/2019
 */

import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /* Prompts user for a string to abreviate */
        System.out.print("Enter A Word Or Sentece You Would Like To Have Abreviated: ");
        System.out.println(abreviate(scan.nextLine()));

        System.out.println(abreviate("The island of Java was formed, mostly as the result of volcanic eruptions"));
    }
    public static String abreviate(String str){

        String outStr = "";

        /* 
         * Splits 'str' at every space value and every non-word value to remove
         * punctuation and spacing 
         */
        String[] parts = str.split("\\s+|\\W");
        /* Loops through 'parts' */
        for(int i = 0; i < parts.length; i++){
            /* Checks if the string is long enough to be abreviated */
            if(parts[i].length() >= 5){
                outStr = outStr + parts[i].charAt(0) + (parts[i].length() - 2) + parts[i].charAt(parts[i].length() - 1);  
            } else {
                outStr += parts[i];
            }
            /* Adds spacing to 'outStr' */
            if(i != parts.length - 1){
                outStr += " ";
            }
        }
        return outStr;
    }
}

