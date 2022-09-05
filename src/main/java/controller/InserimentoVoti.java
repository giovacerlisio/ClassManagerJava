package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Persona;
import model.Voto;
import model.PersonaDAO;

/**
 * Servlet implementation class InserimentoVoti
 */
@WebServlet("/InserimentoVoti")
public class InserimentoVoti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserimentoVoti() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));

		request.setAttribute("id", id);
		
		request.getRequestDispatcher("inserimentovoti.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonaDAO pd = new PersonaDAO();
		Voto v = new Voto (Integer.parseInt(request.getParameter("contatore")), Integer.parseInt(request.getParameter("voto")), request.getParameter("materia"));
		
		boolean inserimento;
		try {
			inserimento = pd.inserisciVoto(v);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.print("Operazione completata!");
		doGet(request, response);
		response.sendRedirect("Home.jsp");
	}

}
