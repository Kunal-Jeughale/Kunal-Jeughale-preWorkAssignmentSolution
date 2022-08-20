import java.util.Scanner;
public class Primedemo {
	public static void main(String[] args) {
		int i=2,s=0,n;
		System.out.println("Enter a number");
		Scanner Sc= new Scanner(System.in);
		n=Sc.nextInt();
	
		while (i<=n/2) 
		{
			if (n%i==0)
			{
				s++;
				break;
			}
			i++;
		}
		
		if(s==0 && n!=1) {
			System.out.println(n +" is a Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
