import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input number:" );
		int num = scan.nextInt();
		multiplication(num);
	}
	public static void multiplication(int num){
	    for (int i =1; i<=10;i++){
	        System.out.println( i + " * " + num + " = "+ num*i);
	    }
	}
}
