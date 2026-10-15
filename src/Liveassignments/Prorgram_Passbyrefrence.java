package liveassignments;

public class Prorgram_Passbyrefrence {

	static void decrease(int [] data)
	{
		data[0] = data[0]-10;
		System.out.println(data[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {100,200,300};
		decrease(data);
		System.out.println("Number : " + data[0]);

	}

}
