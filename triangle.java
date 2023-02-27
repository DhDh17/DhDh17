package basiljava;
import java.util.Scanner;
public class triangle extends ab {
	   
	void sum2() {
	Scanner sc = new Scanner(System.in);

		System.out.println("Please enter base and height and of triangle: ");


double base = sc.nextFloat();
double height = sc.nextFloat();
double areaTriangle = (base * height) / 2;
System.out.println("Area of triangle is: " + areaTriangle);
			
}

}
