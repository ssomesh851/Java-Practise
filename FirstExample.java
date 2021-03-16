import java.sql.*;

public class FirstExample {
	
	//jdbc driver name and database url
	
	//static final String JDBC_driver = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/tables";
	
	//db credentials
	static final String username = "root";
	static final String password = "Somesh#72";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//Steo-2: Register jdbc driver
			
			Class.forName("com.mysql.jdbc.driver");
			
			//open a connection
			
			System.out.println("Connecting to db");
			
			conn = DriverManager.getConnection(DB_URL, username, password);
			
			
			//Step-4: Execute a query
			
			System.out.println("creating a statement");
			
			stmt = conn.createStatement();
			String sql;
			
			sql = "Select Name, Age, Address, Sal from info";
			ResultSet rs = stmt.executeQuery(sql);
			
			//Extract data frm resultset
			
			while(rs.next()) {
				
				String name = rs.getString("Name");
				int age = rs.getInt("Age");
				String Address = rs.getString("Address");
				int sal = rs.getInt("sal");
				
				
				//Display values
				
				System.out.println("name:"+ name);
				System.out.println("Age:"+ age);
				System.out.println("Address:"+ Address);
				System.out.println("sal:"+ sal);
				
			}
			//step-6 clean up environment
			
			rs.close();
			stmt.close();
			conn.close();
		} catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
