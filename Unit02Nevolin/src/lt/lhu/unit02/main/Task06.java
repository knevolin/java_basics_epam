package lt.lhu.unit02.main;

public class Task06 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		double res = (a/c)*(b/d) - (a*b - c)/(c*d); 
		System.out.println("result = " + res);
	}
}
