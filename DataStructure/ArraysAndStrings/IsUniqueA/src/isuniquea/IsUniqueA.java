/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isuniquea;

/**
 *
 * @author luisperez
 *  Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class IsUniqueA {

    public static boolean isUniqueChars(String str){
        if(str.length() > 128 ){ return false;}
        
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            } else {
               char_set[val] = true;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args){
        String[] words = {"Luis","Hello","Perez","apple"};
        for(String word : words){
            System.out.println(word+" : "+isUniqueChars(word));
        }
    }
    
}
