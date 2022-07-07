package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MenuDao;
import dao.MenuDaoImpl;
import dto.Menu;

/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		// response.getWriter().append("Hello insertServlet").append(request.getContextPath());
		
		// 한글을 받기 위해 인코딩 설정
		request.setCharacterEncoding("utf-8");
		
		// insert.jsp에서 전달된 데이터를 받기
		String menu = request.getParameter("menu");
		String price = request.getParameter("price");
		String img = request.getParameter("img");
		
		// 확인용
		System.out.println(menu);
		System.out.println(price);
		System.out.println(img);
		
		// 디비에 데이터
		Menu dto = new Menu();
		dto.setMenu(menu);
		dto.setPrice(Integer.parseInt(price));
		dto.setImg(img);
		
		// 디비에 데이터 넣기
		MenuDao dao = new MenuDaoImpl();
		dao.insert(dto);
		
		
		
		// 페이지 이동
		// response.sendRedirect("/insert.menu");
		
		// 자바스크립트를 이용해서 알림 띄우고 페이지 이동
		// 브라우저로 보내기 전에 한글 설정
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; chatset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('등록되었습니다.'); location.href='/insert.menu'; </script>");
		
		// 또 jsp파일을 만들어서 만든쪽으에서 코드 작성
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
