package java_excersises_2023_v2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



/**
*
*This interface provides methods to apply different functions on a list of Veicolo objects using functional programming concepts.
*It includes methods to apply a Consumer, Predicate, and Function on the list of Veicolo and return an Veicolo object using a Supplier.
*
*@author Herman Gareis
**/
public interface StreamUtiles {
	
	/**
	 * Apply the specified Consumer on each {@link Veicolo} object in the given list.
	 * @param list the list of {@link Veicolo} objects to apply the Consumer on.
	 * @param consumer the Consumer to apply on each {@link Veicolo} object.
	 **/
	public void applyConsumer(List<Veicolo> list, Consumer<Veicolo> consumer);
	
	/**
	 * Apply the specified Predicate on each {@link Veicolo} object in the given list.
	 * @param list the list of {@link Veicolo} objects to apply the Predicate on.
	 * @param predicate the Predicate to apply on each {@link Veicolo} object.
	 **/
	public void applyPredicate(List<Veicolo> list, Predicate<Veicolo> predicate);
	
	/**
	 * Apply the specified Function on each {@link Veicolo} object in the given list.
	 * @param list the list of {@link Veicolo} objects to apply the Function on.
	 * @param function the Function to apply on each {@link Veicolo} object.
	 **/
	public void applyFunction(List<Veicolo> list, Function<Veicolo, String> function);
	
	
	/**
	 * Return an {@link Veicolo} object using the specified Supplier.
	 * @param supplier the Supplier used to create an {@link Veicolo} object.
	 * @return the created {@link Veicolo} object.
	 **/
	public Veicolo applySupplier(Supplier<Veicolo> supplier);

}
