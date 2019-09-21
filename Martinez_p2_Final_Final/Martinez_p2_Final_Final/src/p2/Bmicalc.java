package p2;

import java.util.Scanner;

public class Bmicalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		double userWeight;
		double userHeight;
		int userSel;
		double bmi;
		
		System.out.println("Welcome to the BMI Calculator. Please enter 0 for empirical[lbs and inches], and 1 for metric[kg and cm].");
		userSel = get.nextInt();
		
		if (userSel == 0) {
			System.out.println("Please enter weight in pounds:");
			userWeight = get.nextDouble();
			System.out.println("Please enter your height in inches:");
			userHeight = get.nextDouble();
			
			bmi = (703 * userWeight) / (userHeight * userHeight);
			
			if (bmi <= 18.5) {
				System.out.printf("Your BMI is %.2f and you are underweight.\n", bmi);
			} else if ((bmi >= 18.6) && (bmi <= 24.9)) {
				System.out.printf("Your BMI is %.2f and you are at a normal weight.\n", bmi);
			} else if ((bmi >= 25) && (bmi <= 29.9)) {
				System.out.printf("Your BMI is %.2f and you are overweight.\n", bmi);
			} else {
				System.out.printf("Your BMI is %.2f and you are obese.\n", bmi);
			}
		} else if (userSel ==1) {
			System.out.println("Please enter weight in kilograms:");
			userWeight = get.nextDouble();
			System.out.println("Please enter your height in meters:");
			userHeight = get.nextDouble();
			
			bmi = (userWeight) / (userHeight * userHeight);
			if (bmi <= 18.5) {
				System.out.printf("Your BMI is %.2f and you are underweight.\n", bmi);
			} else if ((bmi >= 18.6) && (bmi <= 24.9)) {
				System.out.printf("Your BMI is %.2f and you are at a normal weight.\n", bmi);
			} else if ((bmi >= 25) && (bmi <= 29.9)) {
				System.out.printf("Your BMI is %.2f and you are overweight.\n", bmi);
			} else {
				System.out.printf("Your BMI is %.2f and you are obese.\n", bmi);
			}
		}
	}

}
