package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.TbUser;

public class TbUserDaoImpl implements TbUserDao
{
	private static String dburl = "jdbc:mysql://localhost:3307/mydb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "root";
	private static String dbpasswd = "1234";
	@Override
	public TbUser selectLogin(String userid, String userpw) 
	{
		Connection conn =null; 			//연결을 맺어낼 객체
		PreparedStatement ps = null;	//명령을 선언할 객체
		ResultSet rs = null; 			//결과값을 담아낼 객체
		
		TbUser dto = null;
		
		try 
		{
			//드라이버 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			//커넥션 객체
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			
			String sql = "SELECT * FROM tb_user WHERE userid = ? AND userpw = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, userpw);
			rs = ps.executeQuery(); //명렁어 실행

			if(rs.next()) 
			{
				dto = new TbUser();
				System.out.println("로그인 성공");
				// 데이터를 셋팅
				dto.setId(rs.getInt("id"));
				dto.setUserid(rs.getString("userid"));
				dto.setUserpw(rs.getString("userpw"));
				dto.setName(rs.getString("name"));
				dto.setRedate(rs.getString("regdate"));
			} 
			else
			{
				System.out.println("로그인 실패");
			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs != null) 
			{				
				try 
				{
					rs.close();
				} 
				catch (SQLException e) 
				{				
					e.printStackTrace();
				}
			}
			if(ps != null) 
			{				
				try 
				{
					ps.close();
				} 
				catch (SQLException e) 
				{				
					e.printStackTrace();
				}
			}
			if(conn != null) 
			{				
				try
				{
					conn.close();
				} 
				catch (SQLException e) 
				{				
					e.printStackTrace();
				}
			}
		}
		return dto;
		
	}
}
