package Test;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Seccsion expried..<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
		}
		else {
			String fn=c[0].getValue();
			req.setAttribute("fName", fn);
			RequestDispatcher rd = req.getRequestDispatcher("ViewProfile.jsp");
			rd.forward(req, res);
		}
	}

}
