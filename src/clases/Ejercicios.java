package clases;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public Boolean esPrimo( Long p) {
		//TODO
		return null;
	}

	static Long siguienteprimo(Long n) {
		//TODO
		Long e0= n%2 == 0 ?n+1 :n+2;
		
		return null;
	}
	static  List<Long> primosMenores(Long n){
		// Que havce el 2L
		Stream.iterate(2L,x->x<n,x->siguienteprimo(x)).collect(Collectors.toList());
	}
	static  List<Long> primosMenores(Long n){
		
	}
	static Long primosIntervalos(Long m, Long n) {
	//TODO while 
		return Stream.iterate(siguienteprimo(m-1),x->x<n,x->siguienteprimo(x)).mapToLong(x->x.longValue()).sum();
	}
	static  boolean esPrimonFn1(Long e ,Boolean b ,Long n) {
		if (e<= sqrt && !b) {
			b= esPrimonFn1(e+1, n%3 == 0, n);
		}
		return b ; 
	}
	static Boolean esPrimoWhile(Long n) {
		Long sqrt = (long)Math.sqrt((double)n);
		// TODO completar 
		return null;
	}
	static  boolean esPrimonFn1(Long n) {
		Long e = 2L;
		Boolean b = false;
		b = esPrimonFn1(e, b, n);
		return !b;
	}
	// TODO HAcer SumLista 
	// TODO record 
	
}
