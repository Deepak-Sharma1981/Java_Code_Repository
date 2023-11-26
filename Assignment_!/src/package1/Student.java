package package1;

public class Student //Class Name---Student

{ // {} Indicate the boundary(body) of the class

	int rollNo; // rollNo is a variable that will store integer value
	int age;
	
	public void display1() //method name---display1 () indicate method
	
	{ // {} indicate the boundary of the method
		
		System.out.println("Welcome to all of you");
	}
	
	public void display2 ()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		Student deep=new Student(); // classname referencevar=new classname
		deep.display1(); // calling the method--display1
		//System.out.println("value of rollNo" +deep.rollNo);
		deep.rollNo=1981; // calling the variable---rollNo
		System.out.println("value of rollNo "+deep.rollNo);
		
		deep.display2(); // calling the method--display2
		deep.age=38; // calling the variable---age
		System.out.println("value of age "+deep.age);
		
	}
}
