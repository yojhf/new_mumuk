package dto;

public class TbUser
{
	private int id;
	private String userid;
	private String userpw;
	private String name;
	private String redate;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUserid() 
	{
		return userid;
	}
	public void setUserid(String userid)
	{
		this.userid = userid;
	}
	public String getUserpw()
	{
		return userpw;
	}
	public void setUserpw(String userpw) 
	{
		this.userpw = userpw;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getRedate() 
	{
		return redate;
	}
	public void setRedate(String redate) 
	{
		this.redate = redate;
	}
}
