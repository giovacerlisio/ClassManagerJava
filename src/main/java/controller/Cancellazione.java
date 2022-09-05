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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cancellazione
 */
@WebServlet("/Cancellazione")
public class Cancellazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Cancellazione() {
        super();
       }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * Creiamo il solito oggetto pd di tipo PersonaDAO con la quuale il solito TRY CATCH FACCIAMO usare a pd
	 * il metodo cancellaPersona scritto in PersonaDAO --> sotto il try catch serve a fare di nuovo la visualizzazione
	 * visto che l'obbiettivo e di far rimanere comunque l'utente nella pagina visualizza anche dopo aver eliminato
	 * simulando cosi un effetto live 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonaDAO pd = new PersonaDAO();
		
		try {
			pd.cancellaPersona(Integer.parseInt(request.getParameter("id")));
		} catch (NumberFormatException | SQLException e) {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
