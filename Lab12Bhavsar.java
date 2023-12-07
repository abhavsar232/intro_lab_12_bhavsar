package stuff;
import java.util.Scanner; 

public class Lab12Bhavsar {
	
	public static void Calculate_circle(Scanner scan) {
		System.out.println("Enter radius");
		
		double radius = scan.nextDouble();
		
		System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
		System.out.println("Circumference: " + (Math.PI * radius * 2));
	}
	
	public static void Calculate_pryamid(Scanner scan) {
		System.out.println("Enter Length, Width, Height");
		
		double baseLen = scan.nextDouble();
		double baseWid = scan.nextDouble();
		double height = scan.nextDouble();
		
		System.out.println("Volume: " + (baseLen * baseWid * height / 3.0));	
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Circle (c) or Pryamid (p)");
		char choice = scan.next().charAt(0);
		
		if (choice == 'c') Calculate_circle(scan);
		else if (choice == 'p') Calculate_pryamid(scan);
		else System.out.println("ERROR");
	}

}
