package Test;
import java.sql.*;

public class UpdateProfileDAO {
public int k=0;
public int update(UserBean ub) 
{try {
	Connection con=DBConnection.getCon();
	PreparedStatement ps=con.prepareStatement("update UserReg42 set addr=?,mid=?,phno=? where uname=? and pword=?");
	ps.setString(1, ub.getAddr());
	ps.setString(2, ub.getMid());
	ps.setLong(3, ub.getPhono());
	ps.setString(4, ub.getName());
	ps.setString(5, ub.getPword());
	k=ps.executeUpdate();
}
catch(Exception e)
{
	e.printStackTrace();
}
	return k;
}
}
