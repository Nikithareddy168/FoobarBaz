import java.util.Scanner;

public class FooBarBaz {
	FooBarBaz(String entry){
		int countUpTo = Integer.parseInt(entry);
		System.out.println("upper Limit ========"+countUpTo);
		for(int i = 1; i <= 110 ;i++){
			// Upper limit set as 110
		}
	}
	
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			while(true){
				System.out.println("enter a number : ");
				String entry = scanner.nextLine();
				new FooBarBaz(entry);
			}
	}

}
