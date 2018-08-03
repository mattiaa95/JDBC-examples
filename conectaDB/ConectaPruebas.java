package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectaPruebas {
	
	public static void main(String[] args) {
		try {
			//Crear conexion
			Connection miConect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");
			//Crear Objeto statment
			Statement miStatement=miConect.createStatement();
			//Ejecuta SQL
			ResultSet miResultado = miStatement.executeQuery("SELECT * FROM productos");
			//Recorrer los resultados de la consulta
			while (miResultado.next()) {
				System.out.println(miResultado.getInt("clave")+" Nombre :"+miResultado.getString(1)+" Coste: "+miResultado.getString("precio")+" Descripcion: "+miResultado.getString("descr"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
