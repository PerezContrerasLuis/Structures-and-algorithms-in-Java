/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isurl;

/**
 *
 * @author luisperez
 */
public class IsUrlTwo {

    public static void urltrim(String url) {
        String finalurl = "";
        String urlT = url.trim();
        char[] arr = urlT.toCharArray();

        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] == ' ') {
                if (i > 0 && (arr[i - 1] != ' ')) {
                    finalurl += "%20";
                }
            } else {
                finalurl += String.valueOf(arr[i]);
            }
        }
        System.out.println(finalurl);
    }
}
