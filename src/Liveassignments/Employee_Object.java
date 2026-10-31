package liveassignments;

public class Employee_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		
		e1.empID = 101;
		e1.age = 45;
		e1.salary = 455600.90F;
		System.out.println("\n Employee Details");
		System.out.println(e1.empID + ","+e1.age + " ," +e1.salary);
		
		Employee e2 = new Employee();
		
		e2.empID = 89;
		e2.age = 54;
		e2.salary = 8908.90F;
		System.out.println("\n Employee 2");
		System.out.println(e2.empID + "; "+ e2.age +" "+e2.salary);
		
		e2.increaseAge();
		System.out.println(e2.age);
	}

}
