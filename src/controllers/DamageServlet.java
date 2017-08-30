package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DamageDAO;
import models.Bee;

/**
 * Servlet implementation class DamageServlet
 */
@WebServlet("/DamageServlet")
public class DamageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DamageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DamageDAO damageDAO =  new DamageDAO();
		HttpSession httpSession = request.getSession();
		ArrayList<Bee> listBee = (ArrayList<Bee>) httpSession.getAttribute("listBee");
		listBee = damageDAO.damage(listBee);
		request.setAttribute("listBee", listBee);
		RequestDispatcher rd = request.getRequestDispatcher("views/data.jsp");
		rd.forward(request, response);
		
	}

}
