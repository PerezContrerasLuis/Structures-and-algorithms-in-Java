package palindrome;

public class Common {
        
        // create the index for the has table and check the character
	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
        //Create a HAS TABLE and count how many times  each character appears
	public static int[] buildCharFrequencyTable(String phrase) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
			}
		}
		return table;
	}

}
