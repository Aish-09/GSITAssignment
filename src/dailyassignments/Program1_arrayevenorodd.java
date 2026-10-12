package dailyassignments;

public class Program1_arrayevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		int arr []= {11 , 24 ,25, 48, 125, 4567, 478};
		int evencount = 0 ;
		int oddcount = 0;
		for (int i =0 ; i<=arr.length-1;i++)
		{
			if (arr[i]%2==0)
				evencount ++;
			else
				oddcount++;
		}
		System.out.println("Even :" + evencount);
		System.out.println("Odd :" + oddcount);
		
	}

}
