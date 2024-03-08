package week1.homework;

public class Palindrome {
	
public static void main(String[] args) {
	int input =121;
	int rev =0;
	int original ;
	original=input;
	for ( ;input!=0; input=input/10) {
		rev =rev *10+input%10;
	}
	if (rev == original) {
		System.out.println("The given number is palindrome");
		
	}
	else {
		System.out.println("The given number is not palindrome");
	}
	}
}
     


