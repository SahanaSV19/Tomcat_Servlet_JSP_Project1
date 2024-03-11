package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.adminDao;
import admin.dto.Admin;

@WebServlet("/adminLgn")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mailID = req.getParameter("email");
		String password = req.getParameter("pwd");
		adminDao adminDao = new adminDao();
		Object msg = adminDao.adminlogin(mailID, password);
		
		if (msg.equals(false)) {
		
			resp.getWriter().print("OOPs!! \n Kindly check the login credentials");
			
		} else {
			req.setAttribute("emailidbro", msg);
			RequestDispatcher dispatcher = req.getRequestDispatcher("download2.jsp");
			dispatcher.forward(req, resp);
		}

	}
}
