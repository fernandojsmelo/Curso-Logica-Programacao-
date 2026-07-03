package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarAoBancoDeDados {
	
	public Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection(
					"JDBC:mysql://localhost:3306/bdAgenda",
					"root", "$Aluno123BD");
			
			
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null,
					"O driver do banco de dados não foi encontrado: " + e);
			
		}
		
		return null;
		
		
	}
	
	

}
