package 喵喵喵;
import java.util.Scanner; 
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		 int fact = 1;
		 int i = 1;
		 while (i <= num) { 
	            fact *= i;
	            i++;
	}
		 System.out.println("Factorial of " + num + " is: " + fact); 
	        input.close();
	        }
         } 
  