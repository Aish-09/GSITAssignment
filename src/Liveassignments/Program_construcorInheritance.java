package liveassignments;

class Parent
{
	String house;
	Parent(){
		System.out.println("Parent constructor called");
	}
}
class Child extends Parent
{
	String car;
	Child()
	{
		System.out.println("Child constructor called");
	}
}
public class Program_construcorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c1 = new Child();
		c1.house = "3BHK";
		c1.car = "Tata";
		System.out.println(c1.house + " : " + c1.car);
	}

}
