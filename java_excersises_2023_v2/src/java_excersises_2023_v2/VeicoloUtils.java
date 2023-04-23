package java_excersises_2023_v2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;





/**
*
*A utility class containing methods for working with the {@link Veicolo} class.
*Implements the {@link StreamUtiles} interface for functional programming operations on collections.
*
*@author Herman Gareis
**/
public class VeicoloUtils implements StreamUtiles{

	private static VeicoloUtils instance;
	
	private VeicoloUtils(){}
	
	
	/**
	 * Returns the Singleton instance of {@link VeicoloUtils}.
	 * @return the Singleton instance of {@link VeicoloUtils}.
	 **/	
	static VeicoloUtils getInstance() {		
		//Method to return the instance of VeicoloUtiles
		//Check if the instance already exists to expose the Singleton Pattern
		if(instance == null) {
			instance = new VeicoloUtils();
		}
		return instance;
	}
	
	/**
	 *Applies the specified {@link Consumer} to each {@link Veicolo} object in the given List.
	 *
	 *@param list the list of {@link Veicolo} objects to apply the consumer to
	 *@param consumer the consumer to apply to each {@link Veicolo} object in the list
	 **/
	public void applyConsumer(List<Veicolo> list, Consumer<Veicolo> consumer) {
		//Iterate over every vehicle in the list and apply the consumer
		for (Veicolo veicolo : list) {
			consumer.accept(veicolo);
			
		}			
	}

	/**
	 * Filters the given List of {@link Veicolo} objects using the
	 * specified {@link Predicate},
	 * and prints out the brand and power of each resulting {@link Veicolo}
	 * object.
	 * 
	 * @param list the list of {@link Veicolo} objects to filter
	 * @param predicate the predicate used to filter the list
	 **/
	public void applyPredicate(List<Veicolo> list, Predicate<Veicolo> predicate) {
		//Apply the Predicate on a stream of Veicolo, 
		//filters the stream based on the given Predicate and then prints out the results for each object using a lambda expression.
		list.stream()
	    .filter(predicate)
	    .forEach(veicolo -> System.out.println(
	        veicolo.getMarca() + " is powerful: " + veicolo.getPotenza()
	    ));
		
	}

	
	/**
	 * Maps the specified {@link Function} to each {@link Veicolo} object in the
	 * given List,
	 * and prints out the resulting {@code String} objects.
	 * 
	 * @param list the list of {@link Veicolo} objects to map
	 * @param function the function to apply to each {@link Veicolo} object in
	 * the list
	 **/
	public void applyFunction(List<Veicolo> list, Function<Veicolo, String> function) {
		//apply the given Function on each element of the input list of Veicolo
		//objects and print the result to the console using the forEach() method.
		list
		.stream()
		.map(function)
		.forEach(System.out::println);
		
	}

	/**
	 * Generates an {@link Veicolo} object using the specified {@link Supplier}.
	 * 
	 * @param supplier the supplier used to generate the {@link Veicolo} object
	 * @return the generated {@link Veicolo} object
	 **/
	public Veicolo applySupplier(Supplier<Veicolo> supplier) {
		//Return the retrieved Automobile from the Supplier
		return supplier.get();
		
	}
		
	}
	

