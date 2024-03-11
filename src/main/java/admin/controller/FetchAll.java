package admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.adminDao;
import student.dto.Student;

@WebServlet("/FA")
public class FetchAll extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		adminDao dao = new adminDao();
		List<Student> list = dao.fetchAll();
		if(list.isEmpty())
		{
			resp.getWriter().print("No data found");
		}
		else
		{
		req.setAttribute("fetchall", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("download.jsp");
		dispatcher.forward(req, resp);
		}
	}
}
