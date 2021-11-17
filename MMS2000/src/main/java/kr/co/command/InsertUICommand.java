package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertUICommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. client가 보내준 데이터 획득 및 가공
		//2. DAO객체 생성 및 해당 메서드 호출
		//3. 바인딩 작업
		//4. 포워딩 작업
		request.getRequestDispatcher("insert.jsp").forward(request, response);
	}
}
