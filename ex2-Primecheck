package myPackage;
import java.util.Scanner;
public class Primecheck {

	public static void main(String[] args) {
	System.out.print("Enter a Nr:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean isprime=true;
	if(n<=1) {
		isprime=false;
	}
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			isprime=false;
		}
	}
	if(isprime) {
		System.out.println(n+" is a Prime");
			}
	else {
		System.out.print(n+" is not a Prime");
	}

	}

}
