
package stringcompression;

/**
 *
 * @author luisperez
 * Implement a method to perform basic string compression using the counts or repeat characters
 * If the compressed string would not become smaller than the original string, your method should return the original string 
 */
public class StringCompression {

    public static String compress(String str) {
        int finalLength = countCompression(str);
        System.out.println("compresss :"+finalLength);
        if (finalLength >= str.length()) {
            return str;
        }

        StringBuffer compressed = new StringBuffer(finalLength); // initialize capacity
        System.out.println("StringBuffer :"+compressed);
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* If next character is different than current, append this char to result.*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.toString();
    }
    //Here we calculate the lenght of the compressed string 
    public static int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            
            /* If next character is different than current, append this char to result.
            Remember : the double logical "||" if the first one is fullfilled, the rest is no longer valided
            */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length(); //we allways add 2 digits because is it the number and the letter -> "3a"
                countConsecutive = 0;
            }
        }
        return compressedLength;
    }

    public static void main(String[] args) {
        String str = "aabbbccefff";
        System.out.println(str);
        System.out.println(compress(str));
    }

}
