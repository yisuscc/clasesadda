package clases;

public class Ejemplosdiapositivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static Integer fact(Integer n) {
		Integer r;
		if (n == 0) {
			r = 1;
		}else {
			r = n*fact(n-1);
		}
		return r;
	}
	private static Integer factFN1(Integer n, Integer ac) {
		Integer r;
		if(n == 0){
			r = ac;
		}else {
			r = factFN1(n-1, n*ac);
		}
		return r ;
	}
}
