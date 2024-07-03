package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		
		HttpSession hs=req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg","Session Expired..<br>");
			RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
		}
		else
		{
			hs.removeAttribute("ubean");
			hs.invalidate();
			req.setAttribute("msg","<html><head><style>h1{color:red;}</style><h1><center>logged out Successfully</center></h1></head><html> <br>");
			
		RequestDispatcher rd=req.getRequestDispatcher("logout.jsp");
		rd.forward(req, res);
	}

}
}