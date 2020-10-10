/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 class Employee
 {
     String name = "Ram";
     int age=15;
     String city="Goa";
     
     
      void Display()
     {
         System.out.println("The name is " + name);
         System.out.println("The age is " + age);
         System.out.println("The city is " + city);
         
     }
     
 }
public class Main
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.Display();
		e2.Display();
	}
}
