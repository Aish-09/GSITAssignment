package liveassignments;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int orginialnum = num;
		int amstrong = 0;
		
		for (;num>0;)
		{
			int lastdigit = num %10;
			amstrong = amstrong + (lastdigit*lastdigit*lastdigit*lastdigit);
			num = num/10;
		}
		if (amstrong==orginialnum)
		{
			System.out.println("This is Amstrong Number");
		}
		else {
			System.out.println("This is not an amstrong number");
		}

	}

}
