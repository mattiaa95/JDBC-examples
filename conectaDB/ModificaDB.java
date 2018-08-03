package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaDB {

	public static void main(String[] args) {
		try {
			//Crear conexion
			Connection miConect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");
			//Crear Objeto statment
			Statement miStatement=miConect.createStatement();
			
			String insertSql="INSERT INTO PRODUCTOS(nombre,precio,descr) VALUES('Ropa', 3 , 'Un articulo raro')";
			
			miStatement.executeUpdate(insertSql);
			
			System.out.println("Datos nuevos");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
