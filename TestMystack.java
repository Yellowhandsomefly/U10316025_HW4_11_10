import java.util.Scanner;
import java.util.ArrayList;

public class TestMystack{

	public static void  main(String[] args){
		
		Scanner input = new Scanner(System.in);

		Mystack stack = new Mystack();

		System.out.println("Enter five strings");

		for(int i = 1; i <= 5; i++){		
	
			System.out.println("Enter strings");
			String word = input.next();		
			stack.push(word);
			
		}

		while(!stack.isEmpty()){

			System.out.print(stack.pop() + " ");
		
		}
	}

}
