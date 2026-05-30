import java.sql.*;
public class JDBCDemo {


	    
	    private static final String URL = "jdbc:mysql://localhost:3306/employeee_db";
	    private static final String USER = "root"; 
	    private static final String PASS = "ronaldo@02"; 
	    public static void main(String[] args) {
	        
	        try {
	           
	            Connection conn = DriverManager.getConnection(URL, USER, PASS);
	            System.out.println("Connected to Database Successfully!");

	            //  Insert 5 Records
	            insertFiveEmployees(conn);

	            //  Count Total Employees
	            countEmployees(conn);

	            conn.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    // A simple method to handle the insertion logic
	    public static void insertFiveEmployees(Connection conn) throws SQLException {
	        String sql = "INSERT INTO employees (emp_id, name, department, joining_date ) VALUES (?, ?, ?, ?)";
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        
	        // data to insert
	        Object[][] employees = {
	            {1, "Alice", "IT",  "2024-01-15"},
	            {2, "Bob", "HR", "2024-05-20"},
	            {3, "Charlie", "Finance", "2023-11-12"},
	            {4, "David", "IT", "2024-07-18"},
	            {5, "Eve", "Sales", "2024-03-10"}
	        };

	        for (Object[] emp : employees) {
	            pstmt.setInt(1, (int) emp[0]);
	            pstmt.setString(2, (String) emp[1]);
	            pstmt.setString(3, (String) emp[2]);
	            pstmt.setString(4, (String) emp[3]);
	            pstmt.executeUpdate();
	        }
	        System.out.println(" 5 Employees inserted.");
	    }

	    public static void countEmployees(Connection conn) throws SQLException {
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM employees");
	        if(rs.next()) {
	            System.out.println("Total Employees: " + rs.getInt(1));
	        }
	    }
	}

