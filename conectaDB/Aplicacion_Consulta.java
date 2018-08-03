package conectaDB;

import javax.swing.*;
import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Aplicacion_Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		JFrame mimarco=new Marco_Aplicacion();		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	private JComboBox<String> secciones;
	private JTextArea resultado;
	private Connection miConect;
	private String consulta;

	private static final long serialVersionUID = 7173310730843300602L;

	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");		
		setBounds(500,300,400,400);		
		setLayout(new BorderLayout());		
		JPanel menus=new JPanel();		
		menus.setLayout(new FlowLayout());		
		secciones=new JComboBox<String>();		
		secciones.setEditable(false);
		secciones.addItem("Todos");
		//--------------Consulta Articulos
		try {
			//Crear conexion
			miConect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");
			//Crear Objeto statment
			Statement miStatement=miConect.createStatement();
			//Ejecuta SQL
			ResultSet miResultado = miStatement.executeQuery("SELECT nombre FROM productos");
			//Recorrer los resultados de la consulta
			while (miResultado.next()) {
				String nombre = miResultado.getString(1).toString();
				secciones.addItem(nombre);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				miConect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//------------------------
		resultado= new JTextArea(4,50);
		resultado.setEditable(false);
		add(resultado);
		menus.add(secciones);
		add(menus, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		JButton botonConsulta=new JButton("Consulta");	
		add(botonConsulta, BorderLayout.SOUTH);
		BotonConsulta ctrlEvent= new BotonConsulta();
		botonConsulta.addActionListener(ctrlEvent);
		
	}
	
 private class BotonConsulta implements ActionListener{

	 private PreparedStatement miStatement;
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String parametro = secciones.getSelectedItem().toString();
		ResultSet miResultado;
		try {
			miConect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "1234");
			if (parametro.equals("Todos")) {
				consulta="SELECT * FROM productos";
				miResultado=miConect.createStatement().executeQuery(consulta);
			}else {
				consulta="SELECT * FROM productos WHERE nombre=?";
				miStatement = (PreparedStatement) miConect.prepareStatement(consulta);				
				//Establecer parametros
				miStatement.setString(1, parametro);
				//Ejecuta la cponsulta
				miResultado = miStatement.executeQuery();
			}
			//Recorrer los resultados de la consulta
			resultado.setText("");//limpiar
			while (miResultado.next()) {
				resultado.append("\n"+miResultado.getInt("clave")+" Nombre :"+miResultado.getString("nombre")+" Coste: "+miResultado.getString("precio")+" Descripcion: "+miResultado.getString("descr"));
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				miConect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
		
	
}

