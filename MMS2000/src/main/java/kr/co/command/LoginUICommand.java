package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.MemberDTO;

public class LoginUICommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String id = request.getParameter("id");
		  MemberDTO dto = new MemberDAO().updateui(id);
		  request.setAttribute("dto", dto);
		  request.getRequestDispatcher("update.jsp").forward(request, response);
	}

}
