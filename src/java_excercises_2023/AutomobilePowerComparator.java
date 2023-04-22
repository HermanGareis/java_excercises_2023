package java_excercises_2023;

import java.util.Comparator;


/**
* A Comparator for the Automobile class that compares two Automobile objects based on their power.
* The comparison is performed by comparing the power values of the two Automobile objects.
*
* @author Herman Gareis
**/
public class AutomobilePowerComparator implements Comparator<Automobile> {

	
	/**
	 * Compares two {@link Automobile} objects based on their power values.
	 * 
	 * @param a1 The first {@link Automobile} object to be compared.
	 * @param a2 The second {@link Automobile} object to be compared.
	 * @return A negative integer, zero, or a positive integer as the first argument
	 * is less than, equal to, or greater than the second.
	 **/
    public int compare(Automobile a1, Automobile a2) {
        return a1.getPotenza() - a2.getPotenza();
    }
}
