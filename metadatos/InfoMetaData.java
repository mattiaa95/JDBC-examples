package metadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.DatabaseMetaData;

public class InfoMetaData {
	 
	private static Connection miConexion;

	public static void main(String[] args) {
		mostarInfo_BBDD();
	}
	
	static void mostarInfo_BBDD() {
		miConexion = null;
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");	
			
			DatabaseMetaData datosBBDD=(DatabaseMetaData) miConexion.getMetaData();
			
			System.out.println("Nombre BBDD "+datosBBDD.getDatabaseProductName()+" Version "+datosBBDD.getDatabaseProductVersion());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
