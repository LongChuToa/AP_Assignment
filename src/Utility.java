public class Utility {

	/**
	 * Test whether a specific number is a prime number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a prime number.
	 */
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Test whether a specific number is a square number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a square number.
	 */
	public static boolean isSquare(int num) {
		int x = (int) Math.sqrt(num);
		return x*x == num;
	}
	
	public static int Fibonacci(int num) {
		if (num <= 1) return 0; //Only return when n > 2
		int a = 1, b = 1, c = 0, n = 2;
		while (c < num) {
			c = a + b;
			a = b;
			b = c;
			n++;
		}
		return c == num ? n : 0;
	}
}
