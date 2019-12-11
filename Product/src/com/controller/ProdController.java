package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProdDao;
import com.model.ProdModel;

/**
 * Servlet implementation class ProdController
 */
public class ProdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<ProdModel> lst=null;
	public void init()
	{
		lst=new LinkedList<ProdModel>();
	}
    public ProdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String ProdNo=request.getParameter("pno");
		String ProdName=request.getParameter("pn");
		String Price=request.getParameter("pr");
		String Quantity=request.getParameter("qt");
		int prdno=Integer.parseInt(ProdNo);
		int qua=Integer.parseInt(Quantity);
	
		
		ProdModel pm=new ProdModel();
		pm.setPrdno(prdno);
		pm.setProdName(ProdName);
		pm.setPrice(Price);
		pm.setQua(qua);
		List<ProdModel> lst=new ArrayList<ProdModel>();
		
		lst.add(pm);
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession(true);
		session.setAttribute("shop",lst);
		pw.println("....your product id added...");
		pw.println("DO you want to add more product?");
		pw.println("<a href='Product.jsp'>YES</a>");
		pw.println("<a href='Cart.jsp'>NO</a>");
		ProdDao pd=new ProdDao();
		//int i=pd.saveData(lst);
		//if(i>0)
		//{
		//	response.sendRedirect("Product.jsp");
		//}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doGet(request, response);
	}
	

}
