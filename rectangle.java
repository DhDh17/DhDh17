package basiljava;
import java.util.Scanner;
public class rectangle extends ab{
	void sum3() {
	Scanner sc = new Scanner(System.in);

	System.out.println("Please enter length and breadth of rectangle: ");
							int length = sc.nextInt();
	int width = sc.nextInt();
	int areaRectangle = length * width;
	System.out.println("Area of ractangle is: " + areaRectangle);

		}

	

}
