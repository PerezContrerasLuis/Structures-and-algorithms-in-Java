/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isurl;

import static isurl.IsUrl.findLastCharacter;
import static isurl.IsUrl.replaceSpaces;
import static isurl.IsUrlTwo.urltrim;

/**
 *
 * @author luisperez
 * @info : Write a method to replace all spaces in a string  with '%20'
 */
public class Main {

    public static void main(String[] args) {
        //solutionOne();
        solutionTwo();
    }

    public static void solutionOne() {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);
        StringBuilder sbf = new StringBuilder();
        System.out.println(sbf);
        sbf.append(arr);
        System.out.println(sbf);

    }

    public static void solutionTwo() {
        String str = "Mr    John   Smith    ";
        urltrim(str);

    }
}
