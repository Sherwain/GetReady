package recursion;

public class Fibonacci {
	public static void main(String[] args){
		System.out.println(fibonicci(7));
	}
	
	public static int fibonicci(int n){
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		
		return fibonicci(n - 1) + fibonicci(n - 2);
	}
}
