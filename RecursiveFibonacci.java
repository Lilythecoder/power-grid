package lecture1;

class RecursiveFibonacci {

	public static int binaryFib(int n) {
		if (n <= 1) return n;
		else return binaryFib(n-1) + binaryFib(n-2);
	}

	public static int[] linearFib(int n) {
		if (n <= 1) {
			return new int[] {n,0};
		}
		else { 
			int[] F = linearFib(n-1);
			int Fn = F[0] + F[1];
			F[1] = F[0];
			F[0] = Fn;
			return F;
		}
	}
	public static void main(String args[])
	{
		System.out.println("fib(8) = " + binaryFib(8));
		System.out.println("fib(8) = " + linearFib(8)[0]);
		
		System.out.println("fib(" + args[0] + ") = " + binaryFib(Integer.parseInt(args[0])));
		System.out.println("fib(" + args[0] + ") = " + linearFib(Integer.parseInt(args[0]))[0]);
	}
}
