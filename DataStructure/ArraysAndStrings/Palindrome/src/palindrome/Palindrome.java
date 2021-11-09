/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author luisperez
 * Given a sring, write a fucntion to check if it is a permutation of a palindrome 
 * here we have three diferent solution , in their static classes 
 * For example In the firts class QuestionA we use the hash table for check if we have no more an odd count
 * AND we have a common class composed by two methods used in the 3 different classes
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strings = {"Rats live on no evil star",
            "A man, a plan, a canal, panama",
            "Lleve",
            "Tacotac",
            "asda",
            "paeap"
        };
        for (String s : strings) {
            boolean a = QuestionA.isPermutationOfPalindrome(s);
            boolean b = QuestionB.isPermutationOfPalindrome(s);
            boolean c = QuestionC.isPermutationOfPalindrome(s);
            System.out.println(s);
            if (a == b && b == c) {
                System.out.println("Agree: " + a);
            } else {
                System.out.println("Disagree: " + a + ", " + b + ", " + c);
            }
            System.out.println();
        }

    }

}
