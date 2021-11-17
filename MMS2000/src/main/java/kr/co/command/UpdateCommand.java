package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.MemberDTO;

public class UpdateCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		String pw = request.getParameter("pw");
		
		String name = request.getParameter("name");
		
		int age = Integer.parseInt(request.getParameter("age"));
		
		String address = request.getParameter("address");
		
		
		new MemberDAO().update(new MemberDTO(id, pw, name, age, address));
		
		response.sendRedirect("read.do?id="+id);
	}

}
