package day2pkg;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.List;
import java.util.*;



public class Day2 {
	
	static int tempnum;
	static int num1;
	static int num2;
	static int num3;
	static int num4;
	static int num5;
	static int X = 0;
	static int Y = 0;
	static String input;
	static char direction;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (
				Scanner sc = new Scanner(
					new FileReader("C:\\Users\\darkl\\Documents\\Programming\\input.txt"));	
						
				) {
					sc.useDelimiter(Pattern.compile("(\r\n)"));
					sc.useLocale(Locale.ENGLISH);
					
					while (sc.hasNext()) {
						
							input = sc.next();
							
							for(int i=0; i<input.length();i++) {
								direction = input.charAt(i);						
								Move(direction);
							}
							CalcPos(X, Y);
							}
					
						}
		
		
		
		
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
public static void CalcPos(int first, int second) {
	
	if(first == -1) {
		if(second == -1) {
			tempnum = 1;
		}
		
		else if(second == 0) {
			tempnum = 4;
		}
		
		else {
			tempnum = 7;
		}
	}
	
	else if(first == 0) {
		if(second == -1) {
			tempnum = 2;
		}
		
		else if(second == 0) {
			tempnum = 5;
		}
		
		else {
			tempnum = 8;
		}
	}
	
	else {
		if(second == -1) {
			tempnum = 3;
		}
		
		else if(second == 0) {
			tempnum = 6;
		}
		
		else {
			tempnum = 9;
		}
	}
	
	
	if(num1 == 0) {
		num1 = tempnum;
		System.out.println("Number 1 is: " + num1);
	}
	
	else if(num2 == 0) {
		num2 = tempnum;
		System.out.println("Number 2 is: " + num2);
	}
	
	else if(num3 == 0) {
		num3 = tempnum;
		System.out.println("Number 3 is: " + num3);
	}
	
	else if(num4 == 0) {
		num4 = tempnum;
		System.out.println("Number 4 is: " + num4);
	}
	
	else {
		num5 = tempnum;
		System.out.println("Number 5 is: " + num4);
		System.out.println("The code is: " + num1 + num2 + num3 + num4 + num5 + ".");
		return;
	}
	

	
}
	
public static void Move(char dir) {
	
	if(dir == 'U') {
		
		if(Y > -1) {
		Y-= 1;
		}
	}
	
	else if(dir == 'D') {
		if(Y < 1) {
		Y += 1;
		}
	}
	
	else if(dir == 'L') {
		if(X>-1)
		X -= 1;
	}
	
	else {
		if(X<1)
		X += 1;
	}
	
	return;
}

}
