/*
 In questa classe all'interno del package controller permette di poter inserire un utente 
 da un form con il metodo POST, e poi usa il metodo contenente SQL
 Il metodo contenente l'SQL vero e proprio è presente nel package model in PersonaDAO 
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import config.Connessione;
import model.Persona;
import model.PersonaDAO;


@WebServlet("/Inserimento")
public class Inserimento extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * COSTRUTTORE DI DEFAULT  
     */
    public Inserimento() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * doGet che ovviamente è vuota perché comunque l'inserimento viene fatto richiamando il metodo POST
	 * in modo da assicurare la sicurezza e la privacy dei dati
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * Metodo post che iniziamente crewa un oggetto di tipo PersonaDAO di nome pd
	 * e poi crea un oggetto di tipo Persona di nome p
	 * poi creeiamo la variabile inserimento di tipo boolean perchè ci servira in modo da far
	 * andare lo sweet alert e nella variabile utilizziamo l'oggeto pd con il metodo inserisciPersona passando come parametro
	 * l'oggetto p
	 * 
	 * Poi le sessioni servono ovviamente sempre per lo sweetalert
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PersonaDAO pd = new PersonaDAO();
		Persona p = new Persona(request.getParameter("nome"), request.getParameter("cognome"), Integer.parseInt(request.getParameter("eta")));
		
		boolean inserimento = pd.inserisciPersona(p);
		
		HttpSession session = request.getSession();		
		session.setAttribute("inserimento", inserimento);
		
		System.out.print("Operazione completata!");
		doGet(request, response);
		response.sendRedirect("Home.jsp");
	}

}
