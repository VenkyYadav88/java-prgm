import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
//to converting uppercase to lowercase or lowercasee to uppercase
		char ch;
		Scanner sc = new Scanner(System.in);
		char cod;
		do {
		
			System.out.println("please enter a char");
			ch = sc.next().charAt(0);
			if ((ch>='A') && (ch<='Z')) {
				System.out.println("ch is upper case");
			
			}
			else if((ch>='a') && (ch<='z')){
			System.out.println("ch is lower case");
			}
			System.out.println("do u want to repeat? if yes pls press y or n");
			cod =sc.next().charAt(0);
		}while(cod=='y');
	System.out.println("ends");
	}
}

