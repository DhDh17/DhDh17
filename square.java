package basiljava;
import java.util.Scanner;
public class square extends ab {
	
		void sum4() {
			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter length and width of square: ");
							int length2 = sc.nextInt();
			int width2 = sc.nextInt();
			int areaSquare = length2 * width2;
			System.out.println("Area of square is: " + areaSquare);
				}
}
