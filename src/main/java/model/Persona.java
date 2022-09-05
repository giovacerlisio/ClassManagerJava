/*
Classe persona nella quale facciamo getter e setter di tutti i parametri di una persona
 */

package model;

public class Persona {
	
	
	//Dichiarazione delle variabili che ci servono
	private String nome, cognome;
	private int eta, id;
	
	
	//Metodo Costruttore ( STESSO NOME DELLA CLASSE )
	public Persona(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	// GETTER & SETTER
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Persona [nome = " + nome + "\n cognome = " + cognome + ", eta = " + eta + "]\n\n";
	}
	
	
}

