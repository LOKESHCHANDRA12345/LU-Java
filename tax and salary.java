import java.util.*;
import java.time.*;
public class Main
{
	public static void main(String[] args) {
	   int tax=0;
		System.out.println("Hello World");
		  Scanner sc = new Scanner(System.in); 
     
	    String dob = sc.next(); 
	    
	    // Convert string input to date format
	   LocalDate dateOfBirth = LocalDate.parse(dob); 

	   // Get todays date: yyyy-mm-dd
	   LocalDate currDate = LocalDate.now(); 

	  // Get the difference between the two dates
	  Period period = Period.between(currDate, dateOfBirth); 

	  // Isolate the number of years to get proper age format
	  int age  = Math.abs(period.getYears()); 
	  sc.nextLine();
	  
	  System.out.println("enter ur name");
	  String name=sc.nextLine();
	  System.out.println("Enter your annual salary");
	  int salary=sc.nextInt();
	  if(salary >=500000 )
	  {
	       tax=(salary)*20/100;
	      System.out.println("Tax is "+tax);
	  }
	  else if(salary >=400000 && salary < 500000)
	  {
	       tax=(salary)*15/100;
	      System.out.println("Tax is "+tax);
	  }
	  else if(salary >=300000 && salary < 400000)
	  {
	       tax=(salary)*10/100;
	      System.out.println("Tax is "+tax);
	  }
	  else if(salary >=200000 && salary < 300000)
	  {
	       tax=(salary)*05/100;
	      System.out.println("Tax is "+ tax);
	      
	  }
	  else if(salary < 200000)
	  {
	      System.out.println("No tax required");
	  }
	  
	  
          System.out.println("Name is "+name);
          System.out.println("Date of Birth: " +dob); // Print original input
          System.out.println("Today's Date: " +currDate); // Print today's date
          System.out.println("You are " + age + " years old!");
          System.out.println("Salary is "+ salary);
        
	}
}
