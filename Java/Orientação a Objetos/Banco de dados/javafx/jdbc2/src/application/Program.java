package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
//		---> RECUPERAÇÃO DE DADOS <---		//
		
		Connection conn = null;
		Statement st = null; // --> COMANDO SQL <--
		ResultSet rs = null;
		
		 try {
			 conn = DB.getConnection();
			 
			 
			 st = conn.createStatement();
			 
			 rs = st.executeQuery("Select *from department");
			 // percorrendo um resultset:
			 while (rs.next()) {
				 System.out.println(rs.getInt("id") + ", " + rs.getString("Name"));
			 }
		 }
		 catch (SQLException e) {
			 e.printStackTrace();
		 }
		 finally {
			 DB.closeResultSet(rs);
			 DB.closeStatement(st);
			 DB.closeConnection();
		 }
		
	}

}
