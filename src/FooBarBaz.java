

public class FooBarBaz {

	public static void main(String[] args) {
			for(int limit = 1; limit <=50; limit++){
				if(limit % 3 == 0){
					System.out.println("foo");
				}
				else if(limit % 5 == 0){
					System.out.println("bar");
				}
				else{
					System.out.println(limit);
				}
			}
	}

}
