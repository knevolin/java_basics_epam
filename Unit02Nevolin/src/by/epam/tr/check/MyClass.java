// Zadania 2 i 3

package by.epam.tr.check;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		int x;
		int y;
		int min;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите x: ");
		x = sc.nextInt();
		System.out.print("Введите y: ");
		y = sc.nextInt();
		sc.close();
		min = x <= y ? x : y;
		System.out.println("min = " + min);
	}
}
