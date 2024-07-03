package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/ulog")
public class UserLoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		UserBean ub=new LoginDAO().login(req);
		
		if(ub==null)
		{
			req.setAttribute("msg","invalid Login process <br>");
			RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
		}
		else
		{
			HttpSession hs=req.getSession();//new Session creation
			hs.setAttribute("ubean", ub);
			
			RequestDispatcher rd=req.getRequestDispatcher("userlogin.jsp");
			rd.forward(req, res);
		}	
	}
}
