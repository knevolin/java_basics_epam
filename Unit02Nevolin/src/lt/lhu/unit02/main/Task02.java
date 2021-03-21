package lt.lhu.unit02.main;

import java.lang.Math;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner sc;
		int x;
		int y;
		double square;
		double hyp;
		
		sc = new Scanner(System.in);
		System.out.println("Катет 1 = ");
		x = sc.nextInt();
		System.out.println("Катет 2 = ");
		y = sc.nextInt();
		sc.close();
		
		hyp = Math.sqrt(x^2 + y^2);
		System.out.println("Гипотенуза = "+ hyp);
		square = 0.5*x*y;
		System.out.println("Площадь = "+ square);
	}
}
