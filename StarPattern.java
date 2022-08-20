import java.util.Scanner;
public class StarPattern {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a count for star pattern");
		Scanner Sc= new Scanner(System.in);
		num=Sc.nextInt();
		
		for(int i = num;i>=0;i--) {
			for(int j=0;j<i;j++) {
				
			System.out.print("*");	
			}
			System.out.println("");
	}
		
		}
	}
	

	
