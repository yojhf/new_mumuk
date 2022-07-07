package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MenuDao;
import dao.MenuDaoImpl;
import dto.Menu;

/**
 * Servlet implementation class SeeServlet
 */
@WebServlet("/SeeServlet")
public class SeeServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeeServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// 데이터를 가져오기
		MenuDao dao = new MenuDaoImpl();
		List<Menu> list = dao.selectAll(); // menu 테이블 전체 데이터 가져오기
		request.setAttribute("menuList", list); // menuLsit(위치를 찾을 수 있는 key)를 list로 전달
		
		
		RequestDispatcher dis = request.getRequestDispatcher("/see.jsp");
		dis.forward(request, response);
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
