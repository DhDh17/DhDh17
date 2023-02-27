package basiljava;

import java.util.Scanner;

public class Circle extends ab{
	 void sum1() {
			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter radius of circle: ");
	double radius = sc.nextFloat();
	double areaCircle = (22 * radius * radius) / 7;
	System.out.println("Area of circle is: " + areaCircle);

						}

  
}
