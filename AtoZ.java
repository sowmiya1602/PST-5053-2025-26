package pst;

public class AtoZ {
public static void main(String[] args) {
	 printLetters();
}
public static void printLetters() {
   for(char ch = 'A'; ch <= 'Z'; ch++) {
       showAscii(ch);
   }
}
static void showAscii(char ch) {
   int ascii = ch;
   System.out.println(ch + " = " + ascii);
}

}