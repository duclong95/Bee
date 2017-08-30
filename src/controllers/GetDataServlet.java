package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GetDataDAO;
import models.Bee;

/**
 * Servlet implementation class GetDataServlet
 */
@WebServlet("/GetDataServlet")
public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GetDataDAO getDataDAO = new GetDataDAO();
		ArrayList<Bee> listBee = getDataDAO.getBee();
		req.setAttribute("listBee", listBee);
		RequestDispatcher rd = req.getRequestDispatcher("views/data.jsp");
		rd.forward(req, resp);
	}

}
