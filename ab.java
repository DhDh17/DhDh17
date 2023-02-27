package basiljava;

import java.util.Scanner;

public class ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("MENU:");
			System.out.println("1.Area of circle");
			System.out.println("2.Area of triangle");
			System.out.println("3.Area of rectangle");
			System.out.println("4.Area of square");
			System.out.println("Please enter any of the above option: ");
			int num = sc.nextInt();
			 
			Circle circle = new Circle();
			triangle triangle = new triangle();
			rectangle rectangle = new rectangle();
			square square = new square();
			switch(num) 
			{
		case 1:
			circle.sum1();
			break;
		case 2:
			triangle.sum2();
			break;
		case 3:
			rectangle.sum3();
			break;
		case 4: 
			square.sum4();
			default:
			System.exit(0);
			}

		

	}

	}


