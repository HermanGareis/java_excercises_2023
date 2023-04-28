package com.mkyong.hashing;

import java.lang.reflect.Method;
import lombok.*;

/**
 * The Veicolo class is an abstract class that represents a vehicle. It
 * implements the Comparable interface for comparing Veicolo objects based on
 * their power.
 * 
 * @author Herman Gareis
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Veicolo implements Comparable<Veicolo> {

	private String marca;
	private String targa;
	private String colore;
	private String modello;
	private int annoImmatricolazione;
	private int potenza;

	/**
	 * Returns the type of vehicle.
	 * 
	 * @return the type of vehicle as a {@code String}.
	 * 
	 */
	public abstract String getVehicleType();


	/**
	 * Compares this Veicolo object with the specified Veicolo object for order
	 * based on their power.
	 * 
	 * @param other the other Veicolo object to compare
	 * @return a negative integer, zero, or a positive integer as this Veicolo
	 *         object is less than, equal to, or greater than the specified object.
	 **/
	public int compareTo(Veicolo other) {
		return this.potenza - other.getPotenza();
	}


	public static Method getSetterMarca() {
		Method method = null;
		try {
			method = Veicolo.class.getMethod("setMarca", String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}

	public static Method getSetterTarga() {
		Method method = null;
		try {
			method = Veicolo.class.getMethod("setTarga", String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}

	public static Method getSetterColore(){
		Method method = null;
		try {
			method = Veicolo.class.getMethod("setColore", String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}

	public static Method getSetterModello() {
		Method method = null;
		try {
			method = Veicolo.class.getMethod("setModello", String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}

	public static Method getSetterAnnoImmatricolazione(){
		Method method = null;
		try {
			method = Veicolo.class.getMethod("setAnnoImmatricolazione", int.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}
	

	public static Method getSetterPotenza(){
		Method method = null;
		try {
			method = Veicolo.class.getMethod("setPotenza", int.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return method;
	}

}
