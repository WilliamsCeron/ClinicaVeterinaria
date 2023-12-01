import java.sql.Connection;

public class ConexionBD {
	private static final String URL = "jdbc:mysql://localhost:3306/BancoPlatinum";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static Connection conectar() {
		try {
			// Cargar el controlador de MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establecer la conexión 
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
		
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null; //Maneja el error adecuadamente en tu aplicación
		}
	}
}
