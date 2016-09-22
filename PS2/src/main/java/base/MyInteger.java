package base;

public class MyInteger {

	private int iValue;
	private int z;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (this.iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.iValue % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isPrime() {
		for (int x = 2; x < this.iValue; x++) {
			if (this.iValue % x == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int y) {
		return isEven(y);
	}

	public static boolean isOdd(int y) {
		return isOdd(y);
	}

	public static boolean isPrime(int y) {
		return isPrime(y);
	}

	public static boolean isEven(MyInteger y) {
		return isEven(y);
	}

	public static boolean isOdd(MyInteger y) {
		return isOdd(y);
	}

	public static boolean isPrime(MyInteger y) {
		return isPrime(y);
	}

	boolean equals(int y) {
		if (y == z) {
			return true;
		} else {
			return false;
		}
	}
/**
	boolean equals(MyInteger y) {
		if (MyInteger.class == z) {
			return true;
		} else {
			return false;
		}
	}
	*/
}
