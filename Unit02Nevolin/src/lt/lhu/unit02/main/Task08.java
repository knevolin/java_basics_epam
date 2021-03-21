package lt.lhu.unit02.main;

import java.lang.Math;

public class Task08 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int h = Integer.parseInt(args[2]);
		double result;
		
		for (int i = a; i <= b; a = a + h) {
			result = 2*Math.tan(i/2) + 1;
			System.out.println("x = " + i + " F(x) = " + result);
		}
	}
}
