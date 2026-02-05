package pst;
import java.util.Scanner;
public class Interestcalculation {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		System.out.print("enter p value:");
		double r=sc.nextDouble();
		System.out.print("enter r value:");
		double t=sc.nextDouble();
		System.out.print("enter t value:");
		double SI = (p*r*t)/100;
		System.out.println("enter the value:"+SI);
		sc.close();
	}
 }
