package pst;

public class Smallatoz {
public static void main(String[] args) {
	 printLetters();
}
public static void printLetters() {
   for(char ch = 'a'; ch <= 'z'; ch++) {
       showAscii(ch);
   }
}
static void showAscii(char ch) {
   int ascii = ch;
   System.out.println(ch + " = " + ascii);
}

}