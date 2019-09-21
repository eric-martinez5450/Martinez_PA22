package p1;
import java.util.Scanner;


public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	ask user for number to encrypt
		 *  
		 *  pull every digit out using /100 and %100 and assign into unique int
		 *  add 7 to each int
		 *  %10 to get remainder after dividing by 10
		 *  printf(int3, int4, int1, int 2)
		 *  8675
		 *  8675 / 100 = ans
		 *  ans % 10
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
		
		//System.out.println("" + firstDigit + "!" + secondDigit + "!" + thirdDigit + "!" + fourthDigit);
		
		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		//System.out.println("" + firstDigit + "!" + secondDigit + "!" + thirdDigit + "!" + fourthDigit);
		
		System.out.println("" + thirdDigit + fourthDigit + firstDigit + secondDigit);
		
		
	}

}
