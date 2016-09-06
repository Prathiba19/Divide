# Divide
import java.util.Scanner;


public class Divide {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend : ");
		int d1=sc.nextInt();
		System.out.println("Enter the divisor : ");
		int d2=sc.nextInt();
		int count=0;
		while(d1!=0){
			d1=d1-d2;
			count++;
		}
		System.out.println("The quotient is : ");
		System.out.println(count);
		

	}

}
