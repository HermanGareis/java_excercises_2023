package java_excersises_2023_v2;


/**
 * Represents a car, which is a type of vehicle that extends the abstract class Veicolo.
 * @author Herman Gareis
 *
 **/
public class Automobile extends Veicolo {

	/**
	 * Constructs a new Automobile object with the specified brand, license plate, color,
	 * model, year of registration, and power.
	 * @param marca the brand of the car
	 * @param targa the license plate of the car
	 * @param colore the color of the car
	 * @param modello the model of the car
	 * @param annoImmatricolazione the year the car was registered
	 * @param potenza the power of the car
	 **/
	public Automobile(String marca, String targa, String colore, String modello, int annoImmatricolazione, int potenza) {
		super(marca, targa, colore, modello, annoImmatricolazione, potenza);	
	}
	
	
	/**
	*
	* Returns the type of vehicle, which is "Automobile".
	* @return string the type of vehicle
	**/
	@Override
	public String getVehicleType() {	
		return "Automobile";
	}
	

}
