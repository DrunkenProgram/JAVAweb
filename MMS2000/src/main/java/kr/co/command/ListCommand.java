package kr.co.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.MemberDTO;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.client가 보내준 데이터 획득 및 가공
		//2.DAO객체생성 및 해당 메서드 호출
		List<MemberDTO> list = new MemberDAO().list();
		//3. 데이터 바인딩
		request.setAttribute("list", list);
		//4. 포워딩
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
