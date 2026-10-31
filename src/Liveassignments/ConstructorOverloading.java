package liveassignments;

class Test{
	int code;
	String testName;
	char level;
	Test (int code1, String testName1, char level1)
	{
		code = code1;
		testName = testName1;
		level = level1;
	}
	Test ()
	{
		code = 1;
		testName = "DummyName";
		level = '/';
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test (101, "Java_Test", 'B');
		System.out.println(t1.code+ " : "+ t1.testName + " : " + t1.level);
		
		Test t2 = new Test();
		System.out.println(t2.code+ " : "+ t2.testName + " : " + t2.level);
	}

}
