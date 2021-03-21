package lt.lhu.unit02.main;

import java.lang.Math;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc;
		int a;
		int b;
		int c;
		double result;
		
		sc = new Scanner(System.in);
		System.out.println("a = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		System.out.println("c = ");
		c = sc.nextInt();
		sc.close();
		
		result = Math.pow(a, 2) - Math.pow((b-c), 2) + Math.log(Math.pow(b, 2) + 1);
		System.out.println("result = "+ result);
	}
}
