package clases;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AcumuladoresWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer >lista1 = new ArrayList<>();
System.out.println(lista1.stream().map(string-> string.toString()).collect(Collectors.joining(",", "[", " ]")));
	}
	static Boolean todosMultiplosWhile(List<Integer> ls, Integer m) {
		// si la lista está vaciá devuelve verdadero
		Integer e = 0 ;
		Boolean  b = true;
		while (e<ls.size() && b) {
			b = ls.get(e) % m == 0;
			e = e+1;
		}
		return b;
	}
	static Boolean ningunMultiploWhile(List<Integer> ls, Integer m) {
		Integer e = 0;
		Boolean b = false;
		while (e<ls.size() && !b ){
			b = ls.get(e) % m == 0;
			e = e+1;
		}
		return b;
	}
	static Boolean algunMultiploWhile(List<Integer> ls, Integer m) {
		Integer e = 0;
		Boolean b = true;
		while (e<ls.size() && b) {
			b = !(ls.get(e) % m == 0);
			e= e+1;
		}
		return !b;
	}
	static Integer sumMultiplosWhile(List<Integer> ls, Integer m) {
		Integer e = 0;
		Integer s = 0;
		while(e<ls.size()) {
			 Boolean b = (ls.get(e) % m == 0);
			 if(b) {
				  s = ls.get(e) + s;
			 }
			 e++;
		}
		return s;
	}
	static Integer cuentaMultiplosWhile(List<Integer> ls, Integer m) {
		Integer e = 0;
		Integer c = 0;
		while(e<ls.size()) {
			Boolean b = (ls.get(e) % m == 0);
			if (b) {
				c++;
			}
			e++;
		}
		return c;
	}
	
	public String joiningStream(List<Integer> lista1) {
		return lista1.stream().map(string-> string.toString()).collect(Collectors.joining(",", "[", " ]"));
	}
	public String joiningWhile(List<Integer> lista1) {
		Integer e = 0 ;
		String s = "";
		while(e<lista1.size()) {
			if(e == 0) {
				s.concat("[");
				s.concat(String.valueOf(lista1.get(e)));
				s.concat(",");
			}
			if (e == lista1.size()-1) {
				s.concat(s);
				s.concat("]");
			}
			else {
				s.concat(String.valueOf(lista1.get(e)));
				s.concat(",");
			}
			e++;
		}
		return s;
	}
	

}
