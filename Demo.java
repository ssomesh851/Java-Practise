import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/tables";
		String uname = "root";
		String passwd = "Somesh#72";
		
		String name = "mahesh123";
		int age = 21;
		String address = "skr";
		int sal = 2155;
		
		String query = "insert into info values(?,?,?,?)";
		
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //classname
	    */
		try {
			Connection con = DriverManager.getConnection(url, uname, passwd);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, name);
			st.setInt(2, age);
			st.setString(3, address);
			st.setInt(4, sal);
			int rs = st.executeUpdate();
			
			System.out.println("count of rows:"+ rs);
			
			/*while(rs.next()) {
			String usrdata = rs.getString(1) + ":" + rs.getInt(2);
			System.out.println(usrdata);
			
			}
			*/
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
