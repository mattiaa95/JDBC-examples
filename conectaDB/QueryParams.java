package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;

public class QueryParams {

	public static void main(String[] args) {
		try {
			//Crear conexion
			Connection miConect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");
			//Crear Objeto statment
			PreparedStatement miStatement=(PreparedStatement) miConect.prepareStatement("SELECT * FROM productos WHERE clave=? OR precio=?");
			
			//Establecer parametros
			
			miStatement.setString(1, "5");
			miStatement.setInt(2, 5);
			
			//Ejecuta la cponsulta
			ResultSet miResultado = miStatement.executeQuery();
			
			//Recorrer los resultados de la consulta
			while (miResultado.next()) {
				System.out.println(miResultado.getInt("clave")+" Nombre :"+miResultado.getString(1)+" Coste: "+miResultado.getString("precio")+" Descripcion: "+miResultado.getString("descr"));
				
			}
			
			
			//-----
			System.out.println("-------------------------------------------------------");
			//----------------
			
			miStatement.setString(1, "3");
			miStatement.setInt(2, 5);
			
			//Ejecuta la cponsulta
			 miResultado = miStatement.executeQuery();
			
			//Recorrer los resultados de la consulta
			while (miResultado.next()) {
				System.out.println(miResultado.getInt("clave")+" Nombre :"+miResultado.getString(1)+" Coste: "+miResultado.getString("precio")+" Descripcion: "+miResultado.getString("descr"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
