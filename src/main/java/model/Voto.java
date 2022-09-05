package model;

public class Voto {

	//Dichiarazione delle variabili che ci servono
	private String materia;
	private int contatore, id, voto;
	
	
	//Metodo Costruttore ( STESSO NOME DELLA CLASSE )
	public Voto(int contatore, int voto, String materia) {
		super();
		this.setMateria(materia);
		this.setContatore(contatore);
		this.setVoto(voto);
	}


	@Override
	public String toString() {
		return "Voto [materia=" + materia + ", contatore=" + contatore + ", id=" + id + ", voto=" + voto + "]";
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public int getContatore() {
		return contatore;
	}


	public void setContatore(int contatore) {
		this.contatore = contatore;
	}
	
}
