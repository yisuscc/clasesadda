package recursivo;

import java.util.ArrayList;
import java.util.List;

public class Recursivo {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Fact " + n + "= " + fact(n));
		System.out.println("Fib 8 = " + fib(8L));
		System.out.println("Mcd(125, 5) = " + mcd(125, 5));
		System.out.println(esPrimoWhile(13L));
		System.out.println(esPrimoFn1(13L));

	}

	private static Integer fact(Integer n) {
		Integer r;
		if (n == 0) {
			r = 1;
		}else {
			r = n * fact (n - 1);
		}
		return r;
	}

	private static Integer mcd(Integer a, Integer b) {
		Integer r;
		if(b == 0) {
			r = a;
		}else {
			r = mcd (b, a%b);
		}
		return r;
	}

	private static Long fib(Long n) {
		Long r;
		if(n == 0 || n == 1) {
			r = n;
		}else {
			r = fib(n - 1) + fib(n-2);
		}
		return r;
	}

	static boolean esPrimoWhile(Long n) {
		Long sqrt = (long) Math.sqrt((double) n);
		Long e = 2L;
		Boolean b = false;
		while (e <= sqrt && !b) {
			b = (n % e == 0);
			e = e + 1;
		}
		return !b;
	}

	static boolean esPrimoFn1(Long n) {
		Long e = 2L;
		Boolean b = false;
		b = esPrimoFn1(e, b, n);
		return !b;
	}

	static boolean esPrimoFn1(Long e, Boolean b, Long n) {
		Long sqrt = (long) Math.sqrt((double) n);
		if (e <= sqrt && !b) {
			b = esPrimoFn1(e + 1, (n % e == 0), n);
		}
		return b;
	}
	//devueleve la lista invertida
	static <E> List<E> inversaNoFinal(List<E>ls){
		List<E> r;
		if(ls.size()== 0 ) {
			r = new  ArrayList<E>() ; 

		}else {
			r = inversaNoFinal(ls.subList(1, ls.size()));
			r.add(ls.get(0));
		}
		return r; 
	}

	//devuelve la lista con  los  elementos invertidos que están en el intervalo [i,n) donde n = |ls| 
	static <E> List<E> inversaNoFinal(List<E> ls, Integer i ){
		//Lamada inicial: inversaNo Final(ls,0)
		List <E> r;
		if (i <ls.size()) {
			r = inversaNoFinal(ls,i++);
			r.add(ls.get(0)); 
		}else {
			r = new ArrayList<E>();

		}
		return r;
	}
	static  <E> List<E> inversaFinal(List<E> ls, Integer i,List<E> b){
		List<E> r;
		if ( i< ls.size()) {
			r = inversaFinal(ls,i+1,b);
			
		}else {
			r=b;
		}return r;
	}
}
