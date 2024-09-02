package Test;

import java.sql.*;
import java.sql.Connection;

public class RegisterDAO {
	public int k = 0;

	public int insert(UserBean ub) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into UserReg42 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getName());
			ps.setString(2, ub.getPword());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getAddr());
			ps.setString(6, ub.getMid());
			ps.setLong(7, ub.getPhono());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return k;

	}
}
