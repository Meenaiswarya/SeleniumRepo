package week1.homework;

public class IsPrime1 {
	public static void main(String[] args) {
		int input=31;
		boolean prime=true;
		for (int i = 2; i<input;i++) {
			if (input%i ==0) {
				prime = false;
				break;
			}
			
		}
		System.out.println(prime);

	}

}

