package week1.homework;

public class FibonacciSeries {
	 public static void main(String[] args) {
			int a = 0,b = 1,c =0;

			System.out.println(a);
			System.out.println(b);
		
			for (int i = 2; i <8; i++) {
				c=b+a;
				System.out.println(c);
				a=b;
				b=c;
				
			}
				
			}

		}