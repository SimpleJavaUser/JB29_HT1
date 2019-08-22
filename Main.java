package by.ld.les03.main;



public class Main {

	public static void main(String[] args) {
		int x = 1234;
				
		int z;
		int sum = 0;
		
		int pch = 1;
		
		while(x != 0) {// 
			z = x % 10;
			
			if(z % 2 == 0) {
				pch = pch * z;
			}
			
			//sum = sum + z;
			
			System.out.println("x=" + x);
			System.out.println("z=" + z);
			//System.out.println("sum=" + sum);
			System.out.println();
			
			x = x / 10;	
		}
		
		
		System.out.println("SUM = " + sum);
		
		/*
		 * z = x % 10; sum = sum + z; System.out.println("x=" + x);
		 * System.out.println("z=" + z); System.out.println("sum=" + sum); x = x / 10;
		 * 
		 * 
		 * z = x % 10; sum = sum + z; System.out.println("x=" + x);
		 * System.out.println("z=" + z); System.out.println("sum=" + sum); x = x / 10;
		 * 
		 * z = x % 10; sum = sum + z; System.out.println("x=" + x);
		 * System.out.println("z=" + z); System.out.println("sum=" + sum); x = x/ 10;
		 * 
		 * System.out.println("x=" + x);
		 */
		
		//while
		//do while
		//for   
		

	}

}
