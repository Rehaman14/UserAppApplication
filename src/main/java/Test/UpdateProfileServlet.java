package Test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Session expird");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else {
			String fn=c[0].getValue();
			ServletContext sct=this.getServletContext();
			UserBean ub=(UserBean)sct.getAttribute("ubean");
			ub.setAddr(req.getParameter("add"));
			ub.setMid(req.getParameter("mid")); 
			ub.setPhono(Long.parseLong(req.getParameter("phno")));
			int k= new UpdateProfileDAO().update(ub);
			System.out.println(k);
			if(k>0) {
				req.setAttribute("fName", fn);
				req.setAttribute("msg", "Profile Upadate");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			}
			
		}
	}
	

}
