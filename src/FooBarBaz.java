import java.util.Scanner;

public class FooBarBaz {
	FooBarBaz(int countUpTo){
		//int countUpTo = Integer.parseInt(entry);
		//System.out.println("upper Limit ========"+countUpTo);
		for(int i = 1; i <= countUpTo ;i++){
			// code for "FooBarBaz"
			if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
				System.out.println("FooBarBaz");
			}
			else if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FooBar");
			}
			else if(i % 5 == 0 && i % 7 == 0){
				System.out.println("BarBaz");
			}
			else if(i % 3==0 && i % 7 == 0){
				System.out.println("FooBaz");
			}
			else if(i % 3 == 0){
				System.out.println("Foo");
			}
			else if(i % 5 == 0){
				System.out.println("Bar");
			}
			else if(i % 7 == 0){
				System.out.println("Baz");
			}
			else{
				System.out.println(i);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			while(true){ // running the loop until the user enters stop
				
					System.out.println("enter a number : ");
					String entry = scanner.next();
					if(entry.equalsIgnoreCase("stop")){
						System.exit(0);
					}
					else{
						try {
							int num  = Integer.parseInt(entry);
							new FooBarBaz(num);
						} catch (NumberFormatException e) {
						    System.out.println("Invalid Input");
						}
					
						
					}
			}
	}

}
