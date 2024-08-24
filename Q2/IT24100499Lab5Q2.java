import java.util.Scanner;

public class IT24100499Lab5Q2{

	public static void main(String[] args){
	 //getting the output form the keyboard
		Scanner scanner = new Scanner(System.in);

	//getting the output of the number of members
		System.out.println("Enter the Number of members :");
		int numberofmembers = scanner.nextInt();

	//validation of the entered number of members
		if (numberofmembers < 0) {
			System.out.println("Invalid number of members, the number of 			members should be more than the 0");
			return;
		}		
	
	//calculate the given prize
		String prize;
		switch (numberofmembers){
			case 0: prize = "No prize";
		break;
			case 1: prize = "Pen";
		break;
			case 2: prize = "Umbrella";
		break;
			case 3: prize = "Bag";	
		break;
			case 4: prize = "Tarvalling chair";
		break;
			default: prize = "Headphone";
		break;
		
		}

	//print the recieving prize
		System.out.println("You eligible to get the " + prize);


	}
}