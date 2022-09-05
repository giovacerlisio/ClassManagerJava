/*
 In questa classe all'interno del package controller permette di poter visualizzare gli utenti 
 dal database.
 Il metodo contenente l'SQL vero e proprio è presente nel package model in PersonaDAO 
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;
import model.PersonaDAO;
	
	@WebServlet("/Visualizzazione")

	public class Visualizzazione extends HttpServlet {
		private static final long serialVersionUID = 1L;

	    /**
	     * Default constructor. 
	     */
	    public Visualizzazione() {
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
	    
	    //Il metodo è scritto sia nel doGet che nel doPost cosi in modo che in ogni caso vada bene anche perché è uguale per
	    //entrambi, anche se in ogni caso dovrebbe andare di norma con il doGet
	    //Il metodo in questione crea sempre un oggetto pd di tipo PersonaDAO ovvero della classe in cui abbiamo scritto
	    //i veri e propri metodi che eseguono l'SQL 
	    //Poi nel try più in basso creiamo un oggetto di tipo List di noma persona e con questo oggetto usiamo visualizzapersona
	    //ovvero il metodo scritto in personaDao.
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PersonaDAO pd = new PersonaDAO();
			
			try {
				pd.visualizzaPersona();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				List<Persona> pl = new ArrayList<Persona>();
				pl = pd.visualizzaPersona();
				request.setAttribute("lista", pl);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			request.getRequestDispatcher("lista.jsp").forward(request, response);
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.print("\n\nRichiesta passata da dopost\n\n");
			PersonaDAO pd = new PersonaDAO();
			
			try {
				pd.visualizzaPersona();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				List<Persona> pl = new ArrayList<Persona>();
				pl = pd.visualizzaPersona();
				request.setAttribute("lista", pl);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			request.getRequestDispatcher("lista.jsp").forward(request, response);
			

		}
	}
	

