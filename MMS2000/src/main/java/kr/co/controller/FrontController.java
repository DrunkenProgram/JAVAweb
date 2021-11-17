package kr.co.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.command.Command;
import kr.co.command.DeleteUICommand;
import kr.co.command.InsertCommand;
import kr.co.command.InsertUICommand;
import kr.co.command.ListCommand;
import kr.co.command.ReadCommand;
import kr.co.command.UpdateCommand;
import kr.co.command.UpdateUICommand;
import kr.co.command.DeleteCommand;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String ctxp = request.getContextPath();
		String sp = uri.substring(ctxp.length());
		
		Map<String, Command> menus = new HashMap<String, Command>();
		
		menus.put("/insertui.do", new InsertUICommand());
		menus.put("/insert.do", new InsertCommand());
		menus.put("/list.do", new ListCommand());
		menus.put("/read.do", new ReadCommand());
		menus.put("/updateui.do", new UpdateUICommand());
		menus.put("/update.do", new UpdateCommand());
		menus.put("/deleteui.do", new DeleteUICommand());
		menus.put("/delete.do", new DeleteCommand());
		
		
		
		Command menu = menus.get(sp);
		if(menu != null) {
			menu.execute(request, response);
		}else {
			response.getWriter().append("제공하지 않는 서비스입니다.");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
