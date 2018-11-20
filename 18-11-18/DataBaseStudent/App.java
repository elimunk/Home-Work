import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	private static String connectionString= "jdbc:derby://localhost:5533/JBDB;create=true";
	
	public static void buildDB(String table) {
		try {
			
			Connection connection = DriverManager.getConnection(connectionString);
			
			String sql = "create table "+table +"(id integer not null primary key generated always as identity(start with 1, increment by 1), "
					+ "name varchar(50) not null,"
					+ "age integer not null)";
			
			Statement statement= connection.createStatement();
			
			statement.executeUpdate(sql);
			
			System.out.println("'"+table+"' table has been created.\n");	
		}
		catch (Exception ex) {
			 System.out.println(ex.getMessage());
		}
		
	}
	
public static void insert(String table ,String name, int age) throws SQLException {
		
		Connection connection = DriverManager.getConnection(connectionString);
		
		String sql = String.format("insert into "+ table+" (name, age) values('%s', %d)", name, age);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		preparedStatement.executeUpdate();
		
		ResultSet resultSet = preparedStatement.getGeneratedKeys();
		
		resultSet.next();
		
		
//		int id = resultSet.getInt(1);
//		System.out.println("Insert succeeded.");
	}
	
	
	public static void readAll(String table) throws SQLException {
		
		Connection connection = DriverManager.getConnection(connectionString);
		
		Statement statement = connection.createStatement();
		
		String sql = "select * from "+table;
		
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.println("----Table "+table+" info----");
		while(resultSet.next()) {
			
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			
			System.out.println("id: " + id + ", name: " + name + ", age: " + age);	
		}
	}
	
public static void update(String table, int id, String name, int age) throws SQLException {
		
		Connection connection = DriverManager.getConnection(connectionString);
		
		String sql = String.format("update "+ table+" set name='%s', age=%d where id=%d", name, age, id);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeUpdate();
		
		System.out.println("Update succeeded.");
	}
	
	
	public static void delete(String table, int id) throws SQLException {
		
		Connection connection = DriverManager.getConnection(connectionString);
		
		String sql = String.format("delete from "+ table+" where id=%d", id);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeUpdate();
		
		System.out.println("Delete succeeded.");
	}
	
public static void deleteTable(String table) throws SQLException {
		
		Connection connection = DriverManager.getConnection(connectionString);
		
		String sql = String.format("drop table "+table);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeUpdate();
		
		System.out.println("Table '"+ table+"' Deleteded succeeded.");
	}
	
	public static void main(String[] args) {
		
try {
			
			Class.forName("org.apache.derby.jdbc.ClientDriver");
	
			buildDB("Student");
			
			insert("Student","Eli", 35);
			insert("Student","Anna",29);
			insert("Student","Bob", 32);
			insert("Student","Alice", 22);
			insert("Student","Or", 16);
			readAll("Student");
			System.out.println();

			
			buildDB("StudentNo2");
			insert("StudentNo2","Ali", 20);
			insert("StudentNo2","Lee", 25);
			insert("StudentNo2","Jack", 46);
			readAll("StudentNo2");
			System.out.println();

			update("Student",2, "Bannana", 0);
			update("StudentNo2",1, "Maor", 23);
			System.out.println();

			delete("Student",3);
			delete("StudentNo2",1);
			System.out.println();

			readAll("Student");
			System.out.println();

			readAll("StudentNo2");
			System.out.println();

			deleteTable("Student");
			deleteTable("StudentNo2");

}
catch(Exception ex) {
	System.out.println("Error: " + ex.getMessage());
}
	
}
}
