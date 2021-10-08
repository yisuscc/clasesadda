package iterativo;
import java.util.*;
import java.util.stream.*;
import us.lsi.common.*;
//import us.lsi.iterables.*;
import us.lsi.streams.*;

public class Iterativo {

	public static void main(String[] args) {
		Integer arrayEnteros2[] = {1, 3, 5, 3, 10};
		List<Integer> listaEnteros2 = Arrays.asList(arrayEnteros2);
		System.out.println("\nSecuencia original:" + listaEnteros2);
		System.out.println("Takewhile <= 3:" + hastaMayorN(listaEnteros2, 3));
		System.out.println("Dropwhile <= 3:" + desdeMayorN(listaEnteros2, 3));
		Double reales[] = {1., 2., 3., 4., 5., 6., 7. };
		List<Double> listaReales = Arrays.asList(reales);

		System.out.println("\nSecuencia original:" + listaReales);

		System.out.println("Concatenar:" + 
		Stream.concat(listaReales.stream(), listaReales.stream()).
				collect(Collectors.toList()));
		
		Stream<Enumerate<Double>> enumerado = 
				Stream2.enumerate(listaReales.stream());
		System.out.println("Enumerados: " + 
				enumerado.collect(Collectors.toList()));	
		
		Stream<Pair<Double, Double>> pairs = 
				Stream2.consecutivePairs(listaReales.stream());
		System.out.println("ConsecutivePairs: " + 
				pairs.collect(Collectors.toList()));	
		
		Stream<Pair<Double, Double>> cartesian = 
				Stream2.cartesianProduct(listaReales.stream());
		System.out.println("CartesianProduct: " + 
				cartesian.collect(Collectors.toList()));	
		
		Stream<Pair<Double, Double>> zip = 
				Stream2.zip(listaReales.stream(), listaReales.stream(),
						(x,y) -> Pair.of(x, y));
		System.out.println("Zip: " + zip.collect(Collectors.toList()));	

	}

	static List<Integer> hastaMayorN(List<Integer> lista, Integer n) {
		return lista.stream().takeWhile(e -> e <= n)
				.collect(Collectors.toList());
	}

	static List<Integer> desdeMayorN(List<Integer> lista, Integer n) {
		return lista.stream().dropWhile(e -> e <= n)
				.collect(Collectors.toList());
	}

}
