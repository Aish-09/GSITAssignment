package weeklyassignments;

public class CountVowelConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Programming";
		
		int vowels = 0;
		int consonants = 0;
		
		String str = input.toLowerCase();
		
		for (int i = 0 ; i <str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("Vowels :" + vowels);
		System.out.println("Consonants : "+consonants);

	}

}
