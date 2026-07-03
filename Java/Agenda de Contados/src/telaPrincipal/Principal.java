package telaPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Classes.ConectarAoBancoDeDados;
import TelasJFrame.Pesquisa;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Principal {

	private JFrame frmAgendaDeContatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmAgendaDeContatos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgendaDeContatos = new JFrame();
		frmAgendaDeContatos.setTitle("Agenda de Contatos");
		
		//Maximiza a tela
		frmAgendaDeContatos.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frmAgendaDeContatos.getContentPane().setLayout(null);
		
		JButton btnTestarConexaoBD = new JButton("Testar Conexão com BD");
		btnTestarConexaoBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ConectarAoBancoDeDados().getConnection();
				JOptionPane.showMessageDialog(null, "Bando de Dados conectado com sucesso!");
				
			}
		});
		btnTestarConexaoBD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTestarConexaoBD.setBounds(247, 126, 266, 49);
		frmAgendaDeContatos.getContentPane().add(btnTestarConexaoBD);
		
		JMenuBar menuBar = new JMenuBar();
		frmAgendaDeContatos.setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/arquivo.png")));
		menuBar.add(menuArquivo);
		
		JMenuItem subMenuContatos = new JMenuItem("Contatos");
		subMenuContatos.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/pesquisa.png")));
		subMenuContatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instanciando para ter acesso a tela
				Pesquisa telaPesquisa = new Pesquisa();
				
				//Deixando a tela de pesquisa visivel
				telaPesquisa.setVisible(true);
				
			}
		});
		menuArquivo.add(subMenuContatos);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menuAjuda.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/ajuda.png")));
		menuBar.add(menuAjuda);
		
		JMenuItem subMenuSair = new JMenuItem("Sair");
		subMenuSair.setIcon(new ImageIcon(Principal.class.getResource("/Imagens/sair.png")));
		subMenuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fecho o formulário
				//Fecho o sistema
				frmAgendaDeContatos.dispose();
				
			}
		});
		menuAjuda.add(subMenuSair);
	}
}
