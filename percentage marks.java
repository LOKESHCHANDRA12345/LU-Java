import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    int english, chemistry, computers, physics, maths; 
	    float total, Percentage;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 subjects marks");
	    english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();	
		total = english + chemistry + computers + physics + maths;
		Percentage = (total / 500) * 100;
		switch ((int) Percentage / 10) 
		{
          case 9:
            System.out.println("Grade : A+");
            break;
          case 8:
          case 7:
            System.out.println("Grade : A");
            break;
          case 6:
            System.out.println("Grade : B");
            break;
          case 5:
            System.out.println("Grade : C");
            break;
          default:
            System.out.println("Grade : D");
            break;
        }
	}
}
	
