package pst;

public class Polymorphism {
public static void main(String[] args) {
	int a=10,b=20;
	System.out.println(add(a,b));
	System.out.println(diff(a,b));
	System.out.println(multiple(a,b));
	System.out.println(divide(a,b));
	System.out.println(module(a,b));
}

public  static int add(int c,int d) {
		return c+d;
}
public  static int diff(int c,int d) {
	return c-d;
}
public  static int multiple(int c,int d) {
	return c*d;
}
public  static int divide(int c,int d) {
	return c/d;
}
public  static int module(int c,int d) {
	return c%d;
}

}
