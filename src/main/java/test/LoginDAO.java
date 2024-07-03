package test;
import java.sql.*;
import javax.servlet.http.*;
public class LoginDAO 
{
	public UserBean ub=null;
	public UserBean login(HttpServletRequest req)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from liblogin where uname=? and pword=?");
			
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				ub=new UserBean();//bean object
				ub.setuName(rs.getString(1));
				ub.setpWord(rs.getString(2));
				ub.setfName(rs.getString(3));
				ub.setlName(rs.getString(4));
				}
		  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ub;
	}
}
