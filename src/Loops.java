
public class Loops {
	public static void main(String[] args) {
	
		System.out.println("Question 5a");
		
		int a = 0;
				
		while (a < 100) {
			System.out.println(a);
			a+=2;
		}
			
		System.out.println("Question 5b");
		
	int b = 100;
	
	while (b > 0) {
			System.out.println(b);
			b-=3;
		}		
		
	System.out.println("Question 5c");
	
	for (int c = 0; c < 100; c++) {
		if (c % 2 == 0) {
			System.out.println(c);
		}
	}
	
	System.out.println("Question 5d");
	
	for (int d = 0; d < 100; d++) {
		if (d % 3 == 0 && d % 5 == 0) {
			System.out.println("Hello world");
		} else if (d % 3 == 0) {
			System.out.println("Hello");
		} else if (d % 5 == 0) {
			System.out.println("world");
		} else
			System.out.println(d);
	}
	
	
	}
}
