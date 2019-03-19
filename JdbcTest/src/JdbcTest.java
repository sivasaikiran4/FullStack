import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class JdbcTest {

	public static void main(String[] args) {
		
	Connection cnct=null;
	Statement stmnt =null;
	ResultSet result=null;
	PreparedStatement prep = null;
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		cnct=DriverManager.
				getConnection("jdbc:mysql://127.0.0.1:3306/studyeasy_db",
						"devuser","");
		System.out.println("Sucesfully Connected");
		
		
		stmnt=cnct.createStatement();
			/*
			 * int row=stmnt.executeUpdate ("INSERT INTO users" + "(user_id,username,email)"
			 * + "VALUES"+ "('5','insert','from java')");
			 */
		prep =
				cnct.prepareStatement("select * from users"+"where user_id >?");
		
		prep.setInt(1,3);
		
		
		result=prep.executeQuery();
		
		while(result.next())
		{
			System.out.println
			("user :"+result.getString("username")+" & user email :"+result.getString("email"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
