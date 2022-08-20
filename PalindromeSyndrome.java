import java.util.Scanner;

public class PalindromeSyndrome {
public static void main(String[] args) {
	long n,s=0,c,r;
	System.out.println("Enter a number");
	Scanner num= new Scanner(System.in);
	n=num.nextLong();
	c=n;
	while(n>0) {
		r=n%10;
		s=s*10+r;
		n=n/10;
	}
if(c==s){
	System.out.println("Given number is Palindrome number");
}
	else {
	System.out.println("Given number is not a Palindrome number");	
		
	}
	
	
}
}
