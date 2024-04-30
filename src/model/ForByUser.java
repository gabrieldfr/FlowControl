package model;

import java.util.Scanner;
import customExceptions.FirstParameterBiggerThanSecondException;

public class ForByUser {
	// Variables
	private int firstParameter;
	private int secondParameter;
	
	
	// Functions
	private int checkingParameter(String msg) {
		Scanner userInput = new Scanner(System.in);
		int number;
		System.out.println(msg);
		while(true) {
			try {
				number = Integer.parseInt(userInput.nextLine());
				break;
			} catch(NumberFormatException e) {
				System.out.println("Please, type a valid number");
			}
		}
		if(number < 0) {
			number *= -1;
		}
		//userInput.close();
		return number;
	}
	
	private void checkParameters() throws FirstParameterBiggerThanSecondException {
		if(secondParameter < firstParameter) {
			throw new FirstParameterBiggerThanSecondException();
		}
	}
	
	
	private void count(int parameter1, int parameter2) {
		int forCount = parameter2 - parameter1;
		for(int e = 0; e < forCount; e++) {
			System.out.println("Printing number " + (e + 1));
		}
	}
	// Default constructor
	public ForByUser() {
		while(true) {
			firstParameter = checkingParameter("Type the fisrt parameter:");
			secondParameter = checkingParameter("Type the second parameter:");
			try {
				checkParameters();
				break;
			}
			catch(FirstParameterBiggerThanSecondException e) {
				System.out.println(e);
			}
		}
		count(firstParameter, secondParameter);

	}
}
