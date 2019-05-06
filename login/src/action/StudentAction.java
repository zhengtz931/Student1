package action;
import java.sql.Connection;
import java.sql.ResultSet;
import entity.*;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import Dao.StudentDao;
public class StudentAction {
	public static int select(String username,String password) throws Exception {
		Connection conn=StudentDao.getConnection();
		if (conn == null) {
			System.out.println(conn);
		}
		java.sql.Statement stmt = conn.createStatement();
//		Statement stmt =  conn.createStatement();
//		ResultSet rs = stmt.executeQuery("select username,password from admin where username = ? and password = ?");
     	String sql = "select username,password from admin where username = ? and password = ?";
		//where username = ? and password = ?"
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		ptmt.setString(1, username);
     	ptmt.setString(2, password);
		ResultSet rs=ptmt.executeQuery();
		if(rs.next())
			return 1;
		else
			return 0;
//		while(rs.next())
//		{
//			System.out.println(rs.getString("username") + "," + rs.getString("password"));
//		}
	}

	
}
