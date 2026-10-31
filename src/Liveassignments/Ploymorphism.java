package liveassignments;

public class Ploymorphism {
	
	//Method overloading - reuse the method with same name with different param
	
	static int sum (int num1 ,int num2)
	{
		return num1+num2;
	}
	
	static int sum (int num1 ,int num2, int num3)
	{
		return num1+num2+ num3;
	}
	
	static float sum (float num1 ,float num2, float num3)
	{
		return num1+num2+num3;
	}
	
	static long sum (long num1, long num2)
	{
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = sum();
		System.out.println(result);
		System.out.println(sum(10,20));
		System.out.println(sum(100,200,300));
		System.out.println(sum(1.1F,1.2F,1.4F));
		System.out.println(sum(90904880980968760L,345897345893987903L));

	}

	private static int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
