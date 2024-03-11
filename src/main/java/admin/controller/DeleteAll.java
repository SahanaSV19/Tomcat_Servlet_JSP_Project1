package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.adminDao;

@WebServlet("/DA")
public class DeleteAll extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	adminDao adminDao = new adminDao();
	String msg=adminDao.deleteAll();
	resp.getWriter().print(msg);
}
}
