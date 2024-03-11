package admin.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import admin.dao.adminDao;
import student.dto.Student;

@WebServlet("/create")
public class createStudent implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
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
		String bday = req.getParameter("dob");
		String SUPW = req.getParameter("supw");
		String iday = req.getParameter("doi");

		Student std = new Student();
		std.setUniqueId(Integer.parseInt(uid));
		std.setName(stdname);
		std.setMotherName(Mother);
		std.setFatherName(Father);
		int engmarks=Integer.parseInt(English);
		std.setEngMarks(engmarks);
		int kanmarks=Integer.parseInt(Kannada);
		std.setKanMarks(kanmarks);
		int socmarks=Integer.parseInt(Social);
		std.setSocMarks(socmarks);
		int scimarks=Integer.parseInt(Science);
		std.setSciMarks(scimarks);
		int mathmarks=Integer.parseInt(Maths);
		std.setMathMarks(mathmarks);
		int compmarks=Integer.parseInt(Computer);
		std.setCompMarks(compmarks);
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date(bday);
		std.setDOB(d1);
		int percentage= (int)((engmarks+kanmarks+socmarks+scimarks+mathmarks+compmarks)/600)*100;
		if(percentage>=33)
		{
			std.setResult("Pass");
		}
		else
		{
			std.setResult("Fail");
		}
		std.setSUPW(SUPW.charAt(0));
		
		@SuppressWarnings("deprecation")
		Date d2 = new Date(iday);
		std.setDOI(d2);
		adminDao aDao = new adminDao();
		aDao.insert(std);
		res.getWriter().print("Successfully Added");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
