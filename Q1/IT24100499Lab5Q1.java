import java.util.Scanner;

public class IT24100499Lab5Q1{
	public static void main(String[] args){

	//getting the keyboard output
		Scanner scanner = new Scanner(System.in);

	//getting the 3 number from the user 
		System.out.println("Enter the firs number :");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number :");
		int num2 = scanner.nextInt();

		System.out.println("Enter the third number :");	
		int num3 = scanner.nextInt();
		
		int largest, smallest;

	//finding the largest number
		if(num1 > num2 && num1 > num3){
			largest = num1;
		}else if(num2 > num1 && num2 > num3){
			largest = num2;
		}else{
			largest = num3;
		}
	//finding the smallest number
		if(num1 < num2 && num1 < num3){
			smallest = num1;
		}else if(num2 < num1 && num2 < num3){
			smallest = num2;
		}else{
			smallest = num3;
		}
		

	//print the smallest and the largest numbers
		System.out.println("The largest Number is - " + largest );
		System.out.println("The smallest Number is - " + smallest);



	}
}