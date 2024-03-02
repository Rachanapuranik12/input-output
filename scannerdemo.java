import java.util.Scanner;

class ScannerDemo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your dream company: ");
		String name = sc.next();

		System.out.println("Enter expected package: ");
		float sal = sc.nextFloat();

		System.out.println(name);

		System.out.println(sal);
	}
}


