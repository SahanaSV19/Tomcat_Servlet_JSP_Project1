package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.adminDao;
import admin.dto.Admin;

@WebServlet("/adminsign")
public class AdminSignup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("pwd");
	Admin admin = new Admin();
	admin.setEmail(email);
	admin.setPwd(password);
	adminDao dao= new adminDao();
	String msg=dao.admincreation(admin);
	resp.getWriter().print(msg);
	}
}
