package week1.homework;

public class IsPrime {
	public static void main(String[] args) {
		int num =32;
		int count =0;
		for (int i = 1; i <=num; i++) {
			if (num%i==0)
			count++;	
		}

		if (count==2) {
			System.out.println( num +  "is a prime number" );
			
		} 
		else {
			System.out.println( num + "is a not Prime number" );
		}
	}

}


