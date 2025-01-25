
public class Alphabet1 {

	 java.util.Scanner;

	public static void main(String[] args) {
//write a program to input any character and
	//whether it is alphabet,
	//	digit or special charcater
	char ch;
	Scanner sc =new Scanner(System.in);
	ch= sc.next().charAt(0);
	if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
		System.out.println("alphabet");
	}
	else if (ch>='0' && ch<='9') {
		System.out.println("Digit");
		
}
	else {
		System.out.println("special charcater");
		
	}

	}
}
        