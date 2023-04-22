package java_excercises_2023;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/**
*
*A utility class containing methods for working with the {@link Automobile} class.
*Implements the {@link StreamUtils} interface for functional programming operations on collections.
*
@author Herman Gareis
**/
public class AutomobileUtils implements StreamUtils{
	
	private static AutomobileUtils instance;

	private AutomobileUtils(){}

	/**
	 * Returns the Singleton instance of {@link AutomobileUtils}.
	 * 
	 * @return the Singleton instance of {@link AutomobileUtils}.
	 **/
	static AutomobileUtils getInstance() {
		//Method to return the instance of AutomobileUtiles
		//Check if the instance already exists to expose the Singleton Pattern
		if(instance == null) {
			instance = new AutomobileUtils();
		}
		return instance;
	}
	
	
	/**
	 *Applies the specified {@link Consumer} to each {@link Automobile} object in the given List.
	 *
	 *@param list the list of {@link Automobile} objects to apply the consumer to
	 *@param consumer the consumer to apply to each {@link Automobile} object in the list
	 **/
	public void applyConsumer(List<Automobile> list, Consumer<Automobile> consumer) {
		//Iterate over every automobile in the list and apply the consumer
		for (Automobile automobile : list) {
			consumer.accept(automobile);
			
		}			
	}
	
	
	/**
	 * Filters the given List of {@link Automobile} objects using the
	 * specified {@link Predicate},
	 * and prints out the brand and power of each resulting {@link Automobile}
	 * object.
	 * 
	 * @param list the list of {@link Automobile} objects to filter
	 * @param predicate the predicate used to filter the list
	 **/
	public void applyPredicate(List<Automobile> list, Predicate<Automobile> predicate) {
		
		//Apply the Predicate on a stream of Automobile, 
		//filters the stream based on the given Predicate and then prints out the results for each object using a lambda expression.
		list.stream()
	    .filter(predicate)
	    .forEach(automobile -> System.out.println(
	        automobile.getMarca() + " is powerful: " + automobile.getPotenza()
	    ));
	}
	
	
	/**
	 * Maps the specified {@link Function} to each {@link Automobile} object in the
	 * given List,
	 * and prints out the resulting {@code String} objects.
	 * 
	 * @param list the list of {@link Automobile} objects to map
	 * @param function the function to apply to each {@link Automobile} object in
	 * the list
	 **/
	public void applyFunction(List<Automobile> list, Function<Automobile, String> function) {
		
		//apply the given Function on each element of the input list of Automobile
		//objects and print the result to the console using the forEach() method.
		list
		.stream()
		.map(function)
		.forEach(System.out::println);
		
	}
	
	/**
	 * Generates an {@link Automobile} object using the specified {@link Supplier}.
	 * 
	 * @param supplier the supplier used to generate the {@link Automobile} object
	 * @return the generated {@link Automobile} object
	 **/
	public Automobile applySupplier(Supplier<Automobile> supplier) {
		
		//Return the retrieved Automobile from the Supplier
		return supplier.get();
		
	}
	
}
