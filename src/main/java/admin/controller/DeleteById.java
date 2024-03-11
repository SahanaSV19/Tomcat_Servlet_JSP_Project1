package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.adminDao;

@WebServlet("/did")
public class DeleteById extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("primarykey");
		adminDao dao = new adminDao();
		String msg = dao.deletebyid(Integer.parseInt(uid));
		resp.getWriter().print(msg);

	}
}
