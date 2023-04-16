import java.sql.*;


public class conn_check {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root","Forti");
			System.out.println("Connected With the database successfully");
			Statement cur=conn.createStatement();
			
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
