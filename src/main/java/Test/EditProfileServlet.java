package Test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/edit")

public class EditProfileServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Session expird");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else {
			String fn=c[0].getValue();
			req.setAttribute("fname", fn);
			req.getRequestDispatcher("EditProfile.jsp").forward(req, res);
		}
	}

}
