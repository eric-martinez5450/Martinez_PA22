package p1;
import java.util.Scanner;

public class decrypt {
	public static void main(String[] args) {
		/*	ask for encrypted number
		 * 	pull out each digit and assign to unique int
		 * 	
		 * 	switch (unique int)
		 * 		case 0
		 * 			digit was 3
		 * 		case 1
		 * 			digit was 4
		 * 		case 2
		 * 			digit was 5
		 * 		.
		 * 		.
		 * 		.
		 * 		
		 * 		case 6
		 * 			digit was 9
		 * 		case 7
		 * 			digit was 0
		 * 		case 8
		 * 			digit was 1
		 * 		case 9
		 * 			digit was 2
		 * 
		 * 	do a switch for each unique int
		 * 	subtract 7 from all ints
		 * 	swap the first digit with the third and swap the second digit with the fourth
		 * 	
		 * 
		 * 
		 * 
		 */
		
		Scanner get = new Scanner(System.in);
		
		int userNum;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		System.out.println("Enter number to encrypt");
		
		userNum = get.nextInt();
		firstDigit = userNum / 1000;
		secondDigit = (userNum / 100) % 10;
		thirdDigit = ((userNum / 10) % 100) % 10;
		fourthDigit = (userNum % 10);
		
		switch (firstDigit) {
		case 0 :
			firstDigit = 3;
			break;
		case 1 :
			firstDigit = 4;
			break;
		case 2 :
			firstDigit = 5;
			break;
		case 3 :
			firstDigit = 6;
			break;
		case 4 :
			firstDigit = 7;
			break;
		case 5 :
			firstDigit = 8;
			break;
		case 6 :
			firstDigit = 9;
			break;
		case 7 :
			firstDigit = 0;
			break;
		case 8 :
			firstDigit = 1;
			break;
		case 9 :
			firstDigit = 2;
			break;
		}
		switch (secondDigit) {
		case 0 :
			secondDigit = 3;
			break;
		case 1 :
			secondDigit = 4;
			break;
		case 2 :
			secondDigit = 5;
			break;
		case 3 :
			secondDigit = 6;
			break;
		case 4 :
			secondDigit = 7;
			break;
		case 5 :
			secondDigit = 8;
			break;
		case 6 :
			secondDigit = 9;
			break;
		case 7 :
			secondDigit = 0;
			break;
		case 8 :
			secondDigit = 1;
			break;
		case 9 :
			secondDigit = 2;
			break;
		}
		switch (thirdDigit) {
		case 0 :
			thirdDigit = 3;
			break;
		case 1 :
			thirdDigit = 4;
			break;
		case 2 :
			thirdDigit = 5;
			break;
		case 3 :
			thirdDigit = 6;
			break;
		case 4 :
			thirdDigit = 7;
			break;
		case 5 :
			thirdDigit = 8;
			break;
		case 6 :
			thirdDigit = 9;
			break;
		case 7 :
			thirdDigit = 0;
			break;
		case 8 :
			thirdDigit = 1;
			break;
		case 9 :
			thirdDigit = 2;
			break;
		}
		switch (fourthDigit) {
		case 0 :
			fourthDigit = 3;
			break;
		case 1 :
			fourthDigit = 4;
			break;
		case 2 :
			fourthDigit = 5;
			break;
		case 3 :
			fourthDigit = 6;
			break;
		case 4 :
			fourthDigit = 7;
			break;
		case 5 :
			fourthDigit = 8;
			break;
		case 6 :
			fourthDigit = 9;
			break;
		case 7 :
			fourthDigit = 0;
			break;
		case 8 :
			fourthDigit = 1;
			break;
		case 9 :
			fourthDigit = 2;
			break;
	}
		
		/* firstDigit = firstDigit - 7;
		secondDigit = secondDigit - 7;
		thirdDigit = thirdDigit - 7;
		fourthDigit = fourthDigit - 7;
		*/
		System.out.println("" + thirdDigit + fourthDigit + firstDigit + secondDigit);
}
}
