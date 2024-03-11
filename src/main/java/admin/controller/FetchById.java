package admin.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import admin.dao.adminDao;
import student.dto.Student;

@WebServlet("/fetchid")
public class FetchById extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("PrimaryKey");

		adminDao dao = new adminDao();
		Student student = dao.fetchbyid(Integer.parseInt(id));
		if (student != null) {
			req.setAttribute("markscard", student);
			RequestDispatcher dispatcher = req.getRequestDispatcher("download3.jsp");
			dispatcher.forward(req, res);
		} else {
			res.getWriter().print("No data found");
		}
	}

}
