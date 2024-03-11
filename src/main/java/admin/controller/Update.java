package admin.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.adminDao;
import student.dto.Student;
@WebServlet("/updt")
public class Update extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String uid = req.getParameter("primarykey");
	String stdname = req.getParameter("sname");
	String Mother = req.getParameter("momname");
	String Father = req.getParameter("paname");
	String English = req.getParameter("eng");
	String Kannada = req.getParameter("kan");
	String Social = req.getParameter("soc");
	String Maths = req.getParameter("math");
	String Science = req.getParameter("sci");
	String Computer = req.getParameter("comp");
	String SUPW = req.getParameter("supw");
	String BIRTH_DATE = req.getParameter("dob");
	String ISSUE_Date = req.getParameter("doi");

	Student std = new Student();
	std.setUniqueId(Integer.parseInt(uid));
	std.setName(stdname);
	std.setMotherName(Mother);
	std.setFatherName(Father);
	std.setEngMarks(Integer.parseInt(English));
	std.setKanMarks(Integer.parseInt(Kannada));
	std.setSocMarks(Integer.parseInt(Social));
	std.setSciMarks(Integer.parseInt(Science));
	std.setMathMarks(Integer.parseInt(Maths));
	std.setCompMarks(Integer.parseInt(Computer));
	std.setSUPW(SUPW.charAt(0));
	Date d1 = new Date(BIRTH_DATE);
	std.setDOB(d1);
	Date d2 = new Date(ISSUE_Date);
	std.setDOI(d2);
	adminDao aDao = new adminDao();
	String msg=aDao.update(std);
	resp.getWriter().print(msg);
}
}
