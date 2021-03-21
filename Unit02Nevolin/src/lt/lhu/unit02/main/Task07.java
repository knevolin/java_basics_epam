package lt.lhu.unit02.main;

import java.lang.Math;

public class Task07 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println("from a = " + GetPower(a));
		System.out.println("from b = " + GetPower(b));
		System.out.println("from c = " + GetPower(c));
		
	}
	private static double GetPower(int x) {
		int power = x >= 0 ? 2 : 4;
		return Math.pow(x, power);
	}
}
