package Test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Logout")

public class LogOutProfile extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Seccion expried");
			
		}
		else {
			ServletContext sct=req.getServletContext();
			sct.removeAttribute("ubean");
			c[0].getMaxAge();
			res.addCookie(c[0]);
			req.setAttribute("msg","Logout succesfully...");
		}
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}

}
