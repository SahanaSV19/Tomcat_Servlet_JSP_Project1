package student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.studentDao;
import student.dto.Student;

@WebServlet("/StdLogin")
public class studentMarksCard extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("primarykey");
		studentDao dao = new studentDao();
		Student dto = dao.fetchbyid(Integer.parseInt(id));
		if (dto != null) {
			resp.getWriter().print(dto);
			req.setAttribute("markscard", dto);
			RequestDispatcher dispatcher = req.getRequestDispatcher("download3.jsp");
			dispatcher.forward(req, resp);
		} else {
			resp.getWriter().print("No data found");
		}
	}
}
