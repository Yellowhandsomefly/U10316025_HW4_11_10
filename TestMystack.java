/**
 * Name: 黃俊翔
 * ID: U10316025 
 * Ex: 11.10
 * Information: 
 *		This is a class which shows the result of the string in reserve order.
 */
import java.util.Scanner;


/**Main method*/
public class TestMystack{

	public static void  main(String[] args){
		
		/**Create Scanner object*/
		Scanner input = new Scanner(System.in);
	
		/**Create stack object*/
		Mystack stack = new Mystack();

		System.out.println("Enter five strings");

		/**Input five string*/
		for(int i = 1; i <= 5; i++){		
	
			System.out.println("Enter strings");
			String word = input.next();		
			stack.push(word);
			
		}

		/**Print the string in reverse order*/
		while(!stack.isEmpty()){

			System.out.print(stack.pop() + " ");
		
		}
	}

}
