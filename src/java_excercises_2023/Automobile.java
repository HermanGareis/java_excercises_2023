package java_excercises_2023;



/**
 * The Automobile class represents a vehicle with its brand, model, color, license plate number, year of registration, and power.
 * It implements the Comparable interface to compare automobiles based on their power.
 * 
 * @author Herman Gareis
 **/
public class Automobile implements Comparable<Automobile> {
    private String marca;
    private String targa;
    private String colore;
    private String modello;
    private int annoImmatricolazione;
    private int potenza;

    public Automobile(String marca, String targa, String colore, String modello, int annoImmatricolazione, int potenza) {
        this.marca = marca;
        this.targa = targa;
        this.colore = colore;
        this.modello = modello;
        this.annoImmatricolazione = annoImmatricolazione;
        this.potenza = potenza;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	
	/**
	 * Compares this Automobile object with the specified Automobile object for order based on their power.
	 * @param other the other Automobile object to compare
   	 * @return a negative integer, zero, or a positive integer as this Automobile object is less than, equal to, or greater than the specified object.
	 **/

	public int compareTo(Automobile other) {
        return this.potenza - other.getPotenza();
    }
}