package school;

public class D_13022021_Th_TinhTongCacSo {

	// Tinh P = 1 + x + x^2 + ... + x^n
	// Cach 1: dung vong lap while/for
	public static double sumOfSquares(double x, int n) {
		double sum = 0;
		for(int i=0; i<=n; i++) {
			sum += Math.pow(x, i);
		}
		return sum;
	}
	// Cach 2: dung de quy
	// diem dung khi n=0
	public static double sumOfSquares2(double x, int n) throws IllegalArgumentException{
		if(n<0) {
			throw new IllegalArgumentException();
		} else if(n==0) {
			return 1.0;
		} else 
			return (double) Math.pow(x,n) + sumOfSquares(x, n-1);
	}
	
	// Tinh P = 1 - x + x^2 - x^3 + ... + x^n
	// Cach 1: dung vong lap for/while
	public static double sumOfSquaresSub(double x, int n) {
		double sum=0;
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
				sum += Math.pow(x,i);
			} else sum -= Math.pow(x, i);
		}
		return sum;
	}
	// Cach 2: dung de quy
	public static double sumOfSquaresSub2(double x, int n) throws IllegalArgumentException {
		if(n<0) {
			throw new IllegalArgumentException();
		} else if(n==0) {
			return 1.0;
		} else {
			if(n%2==0) {
				return (double) Math.pow(x, n) + sumOfSquaresSub2(x, n-1);
			} else
				return - (double) Math.pow(x,n) + sumOfSquaresSub2(x, n-1);
		}
	}
	// Tinh S = 1 + x/1! + x^2/2! + ... + x^n/n!
	// Tinh giai thua
	public static int factoria(int n) throws IllegalArgumentException{
		if(n<0)
			throw new IllegalArgumentException();
		else if(n==0) {
			return 1;
		} else return n * factoria(n-1);
	}
	// Cach 1: dung vong lap while/for
	public static double sumOfSquaresDevideFactoria(double x, int n) {
		double sum = 0;
		for(int i=0; i<=n; i++) {
			sum += Math.pow(x, i)/factoria(i);
		}
		sum = (double) Math.round(sum*10000) / 10000;
		return sum;
	}
	// Cach 2: dung de quy
	public static double sumOfSquaresDevideFactoria2(double x, int n) {
		double result=0;
		if(n<0) {
			throw new IllegalArgumentException();
		} else if(n==0) {
			return 1.0;
		} else {
			result = (double) Math.pow(x,n)/factoria(n);
			result = (double) Math.round(result*10000) / 10000;
			return result + sumOfSquaresDevideFactoria2(x, n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfSquares(2, 5));
		System.out.println(sumOfSquares2(2, 5));
		System.out.println(sumOfSquaresSub(2, 5));
		System.out.println(sumOfSquaresSub2(2, 5));
		System.out.println(sumOfSquaresDevideFactoria(3, 5));
		System.out.println(sumOfSquaresDevideFactoria2(3, 5));
	}

}
