package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.MemberDTO;

public class InsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. client가 보내준 데이터 획득 및 가공
		String id = request.getParameter("id");

		String pw1 = request.getParameter("pw1");
		String pw2 = request.getParameter("pw2");
		if(!pw1.equals(pw2)) {
			response.sendRedirect("insertui.do");
			return;
		}
		String sAge = request.getParameter("age");
		int age = Integer.parseInt(sAge);
		
		String name = request.getParameter("name");
		
		String address = request.getParameter("address");
		
		MemberDTO dto = new MemberDTO(id, pw2, name, age, address);
		
		//2. DAO객체 생성 및 해당 메서드 호출
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
		//3. 바인딩 작업
		//4. 포워딩 작업
		response.sendRedirect("list.do");
	}

}
