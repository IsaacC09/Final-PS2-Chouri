package base;

// Isaac Chouri 

public class MyInteger {

	private int iValue;

	// Constructor and Getter
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	} 

	// Methods that use Int
	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int x) {
		if (x % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int x) {
		for (int y = 2; y < x; y++) {
			if (x % y == 0)
				return false;
		}
		return true;
	}

	public boolean equals(int x) {
		return (iValue == x);
	}

	// Methods that use iValue
	public boolean isEven() {
		return isEven(iValue);
	}

	public boolean isOdd() {
		return isOdd(iValue);
	}

	public boolean isPrime() {
		return isPrime(iValue);
	} 

	// Methods that use Constructor MyInteger

	public static boolean isEven(MyInteger x) {
		return x.isEven();
	}

	public static boolean isOdd(MyInteger x) {
		return x.isOdd();
	}

	public static boolean isPrime(MyInteger x) {
		return x.isPrime();
	}

	public boolean equals(MyInteger x) {
		return equals(x.getiValue());
	}

}
