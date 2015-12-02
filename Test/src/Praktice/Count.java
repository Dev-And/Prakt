
package Praktice;
import java.util.Scanner;
public class Count {
	String name, surname, city, country;
	int age;
	private Scanner in;
	
	public void Input(){
		in = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = in.next();
		System.out.println("Please enter your surname");
		surname = in.next();
		System.out.println("Please enter your age");
		age = in.nextInt();
		System.out.println("Please enter the country where you live");
		country = in.next();
		System.out.println("Please enter the city where you live");
		city = in.next();
	}
	public void Output(){
		System.out.println("Your name is " +name+ "  " +surname+ " Age = " +age+ " You live in " +country+ " " +city );
	}
}
