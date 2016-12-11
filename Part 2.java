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
	
	static String tempnum;
	static String num1;
	static String num2;
	static String num3;
	static String num4;
	static String num5;
	static int X = -2;
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
	
	if(first == -2) {
		tempnum = "5";
	}
	
	else if(first == -1) {
		if(second == -1) {
			tempnum = "2";
		}
		
		else if(second == 0) {
			tempnum = "6";
		}
		
		else {
			tempnum = "A";
		}
	}
	
	else if(first == 0) {
		
		if(second == -2) {
			tempnum = "1";
		}
		
		else if(second == -1) {
			tempnum = "3";
		}
		
		else if(second == 0) {
			tempnum = "7";
		}
		
		else if(second == 1) {
			tempnum = "B";
		}
		
		else {
			tempnum = "D";
		}
	}
	
	else if(first == 1) {
		if(second == -1) {
			tempnum = "4";
		}
		
		else if(second == 0) {
			tempnum = "8";
		}
		
		else {
			tempnum = "C";
		}
		
	}
	else {
		tempnum = "9";
		
	}
	
	
	if(num1 == null) {
		num1 = tempnum;
		System.out.println("Number 1 is: " + num1);
	}
	
	else if(num2 == null) {
		num2 = tempnum;
		System.out.println("Number 2 is: " + num2);
	}
	
	else if(num3 == null) {
		num3 = tempnum;
		System.out.println("Number 3 is: " + num3);
	}
	
	else if(num4 == null) {
		num4 = tempnum;
		System.out.println("Number 4 is: " + num4);
	}
	
	else {
		num5 = tempnum;
		System.out.println("Number 5 is: " + num5);
		System.out.println("The code is: " + num1 + num2 + num3 + num4 + num5 + ".");
		return;
	}
	

	
}
	
public static void Move(char dir) {
	
	if(dir == 'U') {
		//System.out.println("Moved UP");
		if(X == -1 && Y == -1 || X == 1 && Y == -1 || X < -1 || X > 1 || Y < -1) {
			//return;
			//System.out.println("Do Nothing");
		}
		else {
		Y-= 1;
		//System.out.println("moved up");
		}
	}
	
	else if(dir == 'D') {
		
		if(X == -1 && Y == 1 || X == 1 && Y == 1 || X < -1 || X > 1 || Y > 1) {
			//return;
			//System.out.println("Do Nothing");
		}
		
		else {
		Y += 1;
		//System.out.println("Move down");
		}
	}
	
	else if(dir == 'L') {
		
		if(X == -1 && Y == -1 || X == -1 && Y == 1 || X < -1 || Y < -1 || Y > 1) {
			//System.out.println("Do Nothing");
			//return;
			
		}
		else {
		X -= 1;
		//System.out.println("Move left");
		}
	}
	
	else {
		if(X == 1 && Y == -1 || X == 1 && Y == 1 || X > 1 || Y < -1 || Y > 1) {
			//System.out.println("Do Nothing");
			//return;
		}
		else {
		X += 1;
		//System.out.println("Move right");
		}
	}
	
	return;
}

}
