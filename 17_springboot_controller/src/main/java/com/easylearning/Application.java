package com.easylearning;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.easylearning.dao.mapper.EmployeeMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);
		swapExp4();
		System.out.println("abc is pralindrom: "+ isPalindrom("abc"));
		System.out.println("nitin is pralindrom: "+ isPalindrom("nitin"));
		System.out.println("malayalam is pralindrom: "+ isPalindrom("malayalam"));
		System.out.println("jack is pralindrom: "+ isPalindrom("jack"));
		System.out.println("abccba is pralindrom: "+ isPalindrom("abccba"));
		drawDiamondPattern();
		System.out.println();
		drawPyramidPattern();
	}
	
	public static void drawDiamondPattern() {
		for(int i=1;i<=7;i++) {
			int s = Math.abs(i-4);
			for(int j=1;j<=Math.abs(i-4);j++) {
				System.out.print(" ");
			}
			for(int j=1; j<= 2*(4-Math.abs(i-4))-1;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
	
	public static void drawPyramidPattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<= 2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
	
	
	public static boolean isPalindrom(String str) {
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i] != arr[arr.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean isPalindrom1(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static void swapExp1() {
		int a = 10;
		int b = 20;

		System.out.println("a=" + a + "  b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping\na=" + a + "  b=" + b);
	}

	public static void swapExp2() {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + "  b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping\na=" + a + "  b=" + b);
	}

	public static void swapExp3() {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + "  b=" + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swapping\na=" + a + "  b=" + b);
	}

	public static void swapExp4() {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + "  b=" + b);

		b = (a + b) - (a = b);
		
		System.out.println("After swapping\na=" + a + "  b=" + b);
	}

}
