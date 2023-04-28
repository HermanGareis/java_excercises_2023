package com.mkyong.hashing;

/**
 * Represents a motorcycle, which is a type of vehicle that extends the abstract class Veicolo.
 * @author Herman Gareis
 *
 **/

public class Moto extends Veicolo{

	/**
	 * Constructs a new Moto object with the specified brand, license plate, color,
	 * model, year of registration, and power.
	 * @param marca the brand of the motorcycle
	 * @param targa the license plate of the motorcycle
	 * @param colore the color of the motorcycle
	 * @param modello the model of the motorcycle
	 * @param annoImmatricolazione the year the motorcycle was registered
	 * @param potenza the power of the motorcycle
	 **/
	public Moto(String marca, String targa, String colore, String modello, int annoImmatricolazione, int potenza) {
		super(marca, targa, colore, modello, annoImmatricolazione, potenza);		
	}

	/**
	* Returns the type of vehicle, which is "Moto".
	* @return string the type of vehicle
	**/
	@Override
	public String getVehicleType() {		
		return "Moto";
	}
}
