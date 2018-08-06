package transaccion;

import java.sql.*;

public class Inserta_Clientes_Pedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Connection miConexion = null;
		try{					
				
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");				
			//tratando como bloque
			miConexion.setAutoCommit(false);
			
			Statement miStatement =miConexion.createStatement();
		    String instruccionSql_1="INSERT INTO CLIENTES (C�DIGOCLIENTE, EMPRESA, DIRECCI�N) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
		    miStatement.executeUpdate(instruccionSql_1);
		    String instruccionSql_2="INSERT INTO PEDIDOS (N�MERODEPEDIDO, C�DIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";
		    miStatement.executeUpdate(instruccionSql_2);
		    miConexion.commit();
		    System.out.println("Datos INSERTADOS correctamente");
				
		}catch(Exception e){
			
			
			System.out.println("ERROR EN LA INSERCI�N DE DATOS!!");
			
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();		
				
			}

		}

	}
