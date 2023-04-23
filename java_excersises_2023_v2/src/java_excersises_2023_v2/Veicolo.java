package java_excersises_2023_v2;


/**
 * The Veicolo class is an abstract class that represents a vehicle. It
 * implements the Comparable interface for comparing Veicolo objects based on
 * their power.
 * @author Herman Gareis
 */
public abstract class Veicolo implements Comparable<Veicolo>{
	
	private String marca;
    private String targa;
    private String colore;
    private String modello;
    private int annoImmatricolazione;
    private int potenza;

    
	/**
	 * Constructs a Veicolo object with the specified parameters.
	 * 
	 * @param marca the vehicle's brand
	 * @param targa the vehicle's license plate
	 * @param colore the vehicle's color
	 * @param modello the vehicle's model
	 * @param annoImmatricolazione the vehicle's registration year
	 * @param potenza the vehicle's power
	 */    
    public Veicolo(String marca, String targa, String colore, String modello, int annoImmatricolazione, int potenza) {
		super();
		this.marca = marca;
		this.targa = targa;
		this.colore = colore;
		this.modello = modello;
		this.annoImmatricolazione = annoImmatricolazione;
		this.potenza = potenza;
	}


    /**
     * Returns the type of vehicle.
	 * @return the type of vehicle as a {@code String}.
     * 
     */
	public abstract String getVehicleType();
    
    
	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getTarga() {
		return targa;
	}




	public void setTarga(String targa) {
		this.targa = targa;
	}




	public String getColore() {
		return colore;
	}




	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getModello() {
		return modello;
	}




	public void setModello(String modello) {
		this.modello = modello;
	}




	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}




	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}




	public int getPotenza() {
		return potenza;
	}




	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}




	/**
	 * Compares this Veicolo object with the specified Veicolo object for order based on their power.
	 * @param other the other Veicolo object to compare
   	 * @return a negative integer, zero, or a positive integer as this Veicolo object is less than, 
   	 * equal to, or greater than the specified object.
	 **/
	public int compareTo(Veicolo other) {
        return this.potenza - other.getPotenza();
    }
    
}
