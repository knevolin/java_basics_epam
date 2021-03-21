package lt.lhu.unit02.main;

public class Task09 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		double result = x <=-3 ? 9 : 1/(x*x + 1);
		System.out.println("F(x) = " + result);
	}
}
