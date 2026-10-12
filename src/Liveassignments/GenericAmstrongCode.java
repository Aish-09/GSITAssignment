package liveassignments;

public class GenericAmstrongCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1634;
		int orginialnum = num;
		int count = 0; //to find the count of digit
		int armstrong = 0;
		
		for (;num>0;)
		{
			num = num / 10;
			count ++;
		}
		System.out.println(count);
		
		num = orginialnum ;
		
		for (;num>0;)
		{
	       int lastdigit = num;
	       int multiply = 1;
	       for (int i=1;i<=count;i++)
	       {
	    	   multiply =  multiply * lastdigit;
	    	   armstrong = armstrong + multiply;
	    	   num = num / 10;
	       }
		}
		System.out.println(armstrong);
		
		if (armstrong == orginialnum) {
			System.out.println("This is Armstrong");
		}
		else
		{
			System.out.println("Not an armstrong");
		}
		
	}

}
