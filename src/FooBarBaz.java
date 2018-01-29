

public class FooBarBaz {

	public static void main(String[] args) {
			int limit = 1;
			while(limit <= 50){	
				if(limit % 3 == 0 && limit % 5 == 0){
					System.out.println("foobar");
				}
				else if(limit % 3 == 0){
					System.out.println("foo");
				}
				else if(limit % 5 == 0){
					System.out.println("bar");
				}
				else{
					System.out.println(limit);
				}
				limit ++;
			}
	}

}
