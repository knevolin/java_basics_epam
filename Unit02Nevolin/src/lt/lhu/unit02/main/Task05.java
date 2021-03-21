package lt.lhu.unit02.main;

import java.lang.Math;

public class Task05 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double res = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/2*a - Math.pow(a, 3)*c + b;
		System.out.println("result = " + res);
	}
}
