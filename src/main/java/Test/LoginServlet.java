package Test;

import java.io.IOException;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/dis1")
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LoginDAO ob = new LoginDAO();
		UserBean ub = ob.login(req.getParameter("name"), req.getParameter("pass"));
		if (ub == null) {
			req.setAttribute("msg", "invalid login process");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		} else {
			ServletContext sct = req.getServletContext();
			sct.setAttribute("ubean", ub);
			
			Cookie cok = new Cookie("fName", ub.getFname());
			res.addCookie(cok);
			RequestDispatcher rd = req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
		}
	}

}
