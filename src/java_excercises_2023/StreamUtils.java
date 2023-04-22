package java_excercises_2023;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
*
*This interface provides methods to apply different functions on a list of Automobile objects using functional programming concepts.
*It includes methods to apply a Consumer, Predicate, and Function on the list of Automobiles and return an Automobile object using a Supplier.
*
*@author Herman Gareis
**/
public interface StreamUtils {

	/**
	 * Apply the specified Consumer on each {@link Automobile} object in the given list.
	 * @param list the list of {@link Automobile} objects to apply the Consumer on.
	 * @param consumer the Consumer to apply on each {@link Automobile} object.
	 **/
	public void applyConsumer(List<Automobile> list, Consumer<Automobile> consumer);
	
	/**
	 * Apply the specified Predicate on each {@link Automobile} object in the given list.
	 * @param list the list of {@link Automobile} objects to apply the Predicate on.
	 * @param predicate the Predicate to apply on each {@link Automobile} object.
	 **/
	public void applyPredicate(List<Automobile> list, Predicate<Automobile> predicate);
	
	/**
	 * Apply the specified Function on each {@link Automobile} object in the given list.
	 * @param list the list of {@link Automobile} objects to apply the Function on.
	 * @param function the Function to apply on each {@link Automobile} object.
	 **/
	public void applyFunction(List<Automobile> list, Function<Automobile, String> function);
	
	
	/**
	 * Return an {@link Automobile} object using the specified Supplier.
	 * @param supplier the Supplier used to create an {@link Automobile} object.
	 * @return the created {@link Automobile} object.
	 **/
	public Automobile applySupplier(Supplier<Automobile> supplier);
}
