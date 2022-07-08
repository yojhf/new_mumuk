package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TbUserDao;
import dao.TbUserDaoImpl;
import dto.TbUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// 로그인 페이지를 보여주고
		RequestDispatcher dis = request.getRequestDispatcher("/login.jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// 원래는 doGet으로 보내는데
		// post 데이터를 가지고 여기로 들어오면 Login처리
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");		
		System.out.println(userid);
		System.out.println(userpw);
		
		TbUserDao dao = new TbUserDaoImpl();
		TbUser dto = dao.selectLogin(userid, userpw);
		
		// 만약에 TbUser가 null이 아니면
		if(dto == null)
		{
			// 로그인 실패 메세지를 보내고 login.menu
			response.sendRedirect("/loginerr.jsp");
		}
		else
		{
			HttpSession session = request.getSession();
			// 로그인(유저) 정보를 저장
			session.setAttribute("user", dto);
			// 로그인 성공 메인으로 가서 메뉴 입력이 보여야 되고
			response.sendRedirect("/");
			// 로그인 메뉴가 로그아웃으로 변경이 되어야 하는데...
			
			
		}
		
	}
}
