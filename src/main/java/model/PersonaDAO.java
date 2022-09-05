package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Connessione;

public class PersonaDAO {
	
//Metodo inserisci persona in cui creiamo un oggetto connessione usiamo il ps creiamo una string SQL per l'inserimento
//e poi con un try catch e il ps.set e l'aiuto delle posizioni tramite l'ordine scritto nella query, inseriamo i dati.
	
public boolean inserisciPersona(Persona p) {
		
		String sql = "INSERT INTO persone (nome, cognome, eta) VALUES (?, ?, ?)";
		
		//Oggetto connessione 
		Connection conn = Connessione.getConnessione();

		//PreparedStatement prepara l'esecuzione della query sql per inserire i dati nel database
		PreparedStatement ps;
		
		//TRY CATCH PER GESTIRE LE ECCEZIONI
		try {
			//Eseguiamo la connessione ed eseguiamo l'sql.
			ps = conn.prepareStatement(sql);
			//Settiamo le stringhe prese in input nelle posizioni che abbiamo inserito nella query SQL
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCognome());
			ps.setInt(3, p.getEta());
			
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	}

//Metodo public di tipo lista di persona chiamato visualizza persona in cui eseguiamo la query sql e poi grazie alla varibiali rs con 
//ResultSet e tramite un ciclo while settiamo tutti i parametri nei posti giusti della tabella tramite il dichiaramento di varibiale
// + rs.set tipo e il nome che abbiamo messo anche nella tabella creando poi alla fine un oggetto p di tipo persona con
//parametri come nome cognome eta e poi id.

public List<Persona> visualizzaPersona() throws SQLException {
	
		String sql = "SELECT * FROM persone";
	
		List<Persona> persone = new ArrayList<Persona>();
	
		Connection conn = Connessione.getConnessione();

		PreparedStatement ps = conn.prepareStatement(sql);
	
		ResultSet rs = ps.executeQuery();
	
		while (rs.next()) 
		{
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			int eta = rs.getInt("eta");
			int id = rs.getInt("id");
	  
	  
			Persona p = new Persona(nome, cognome, eta);
			p.setId(id);
			persone.add(p);
	}
	
	return persone;
	
}

//Metodo cancella persona in cui semplicemente scriviamo la query e con la solita connessione e il solito ps 
//eseguiamo la query e con il ps.setint settiamo al primo posto essendo solo l'id da settare è il primo
// settiamo la variabile id mandata in input quando si clicca su elimina tramite get e quindi tramite la servlet

public void cancellaPersona(int id) throws SQLException {
	
	String sql = "DELETE FROM persone WHERE id = ?";
	
	Connection conn = Connessione.getConnessione();

	PreparedStatement ps = conn.prepareStatement(sql);
	
	ps.setInt(1, id);
	ps.executeUpdate();
	
}

public void modificaPersona(int id, String nome, String cognome, int eta) throws SQLException{
	String sql="UPDATE persone SET nome= ?, cognome= ?, eta = ? WHERE ID = ?";
	
	Connection conn = Connessione.getConnessione();

	PreparedStatement ps = conn.prepareStatement(sql);
	
	ps.setString(1, nome);
	ps.setString(2, cognome);
	ps.setInt(3, eta);
	ps.setInt(4, id);
	
	ps.executeUpdate();
}

public boolean inserisciVoto(Voto v) throws SQLException{
	
	String sql = "INSERT INTO voti (contatore, voto, materia) VALUES (?, ?, ?)";
	
	//Oggetto connessione 
	Connection conn = Connessione.getConnessione();

	//PreparedStatement prepara l'esecuzione della query sql per inserire i dati nel database
	PreparedStatement ps;
	
	//TRY CATCH PER GESTIRE LE ECCEZIONI
	try {
		//Eseguiamo la connessione ed eseguiamo l'sql.
		ps = conn.prepareStatement(sql);
		//Settiamo le stringhe prese in input nelle posizioni che abbiamo inserito nella query SQL
		ps.setInt(1, v.getContatore());
		ps.setInt(2, v.getVoto());
		ps.setString(3, v.getMateria());
		
		ps.executeUpdate();
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}

public List<Voto> visualizzaVoti(int id) throws SQLException {
	
	String sql = "SELECT voti.voto, voti.materia, voti.contatore FROM persone INNER JOIN voti ON persone.id = contatore AND voti.contatore = ?";

	List<Voto> voti = new ArrayList<Voto>();

	Connection conn = Connessione.getConnessione();

	PreparedStatement ps = conn.prepareStatement(sql);
	
	ps.setInt(1, id);

	ResultSet rs = ps.executeQuery();

	while (rs.next()) 
	{
		String materia = rs.getString("voti.materia");
		int contatore = rs.getInt("voti.contatore");
		int voto = rs.getInt("voti.voto");
		Voto v = new Voto(contatore, voto, materia);
		voti.add(v);
}
	
return voti;

}


}
