package Test;
import java.sql.*;

public class LoginDAO 
{
	public static UserBean ub =null;
	public UserBean login(String Un,String Up) 
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps =con.prepareStatement("select*from userreg42 where uname=? and pword=?");
			ps.setString(1, Un);
			ps.setString(2, Up);
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				System.out.println("hi");
				ub=new UserBean();
				ub.setName(rs.getString(1));
				ub.setPword(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setAddr(rs.getString(5));
				ub.setMid(rs.getString(6));
				ub.setPhono(rs.getLong(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println(ub);
		return ub;
	}
}
