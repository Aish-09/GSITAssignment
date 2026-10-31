package weeklyassignments;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "banana";
        char oldChar = 'a';
        char newChar = 'o';
        
        char[] charArray = str.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }

        String result = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);

	}

}
