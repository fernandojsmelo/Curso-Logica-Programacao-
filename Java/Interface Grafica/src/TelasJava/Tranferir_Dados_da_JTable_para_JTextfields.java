package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tranferir_Dados_da_JTable_para_JTextfields {

	private JFrame frmTrabalhandoComJtable;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTable tabelaNomes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tranferir_Dados_da_JTable_para_JTextfields window = new Tranferir_Dados_da_JTable_para_JTextfields();
					window.frmTrabalhandoComJtable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tranferir_Dados_da_JTable_para_JTextfields() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrabalhandoComJtable = new JFrame();
		frmTrabalhandoComJtable.getContentPane().setBackground(new Color(255, 255, 255));
		frmTrabalhandoComJtable.setTitle("Trabalhando com JTable");
		frmTrabalhandoComJtable.setBounds(100, 100, 716, 460);
		frmTrabalhandoComJtable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrabalhandoComJtable.getContentPane().setLayout(null);
		
		//Centralizar a tela
		frmTrabalhandoComJtable.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(36, 34, 142, 40);
		frmTrabalhandoComJtable.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNome.setBounds(36, 71, 201, 33);
		frmTrabalhandoComJtable.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(247, 34, 142, 40);
		frmTrabalhandoComJtable.getContentPane().add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(247, 71, 201, 33);
		frmTrabalhandoComJtable.getContentPane().add(txtSobrenome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdade.setBounds(458, 34, 142, 40);
		frmTrabalhandoComJtable.getContentPane().add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtIdade.setColumns(10);
		txtIdade.setBounds(458, 71, 201, 33);
		frmTrabalhandoComJtable.getContentPane().add(txtIdade);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 114, 625, 231);
		frmTrabalhandoComJtable.getContentPane().add(scrollPane);
		
		tabelaNomes = new JTable();
		tabelaNomes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//DefaultTableModel - Biblioteca para trabalharmos com a tabela
				DefaultTableModel configacoesTabela = (DefaultTableModel)tabelaNomes.getModel();
				
				//Pega o número da linha selecionada
				int selecionaNumeroLinha = tabelaNomes.getSelectedRow();
				
				//selecionaNumeroLinha - Número da linha
				//0 - Número da coluna
				//toString - Converte o objeto para texto
				//getValueAt - Pega o valor da linha
				txtNome.setText(configacoesTabela.getValueAt(selecionaNumeroLinha, 0).toString());
				txtSobrenome.setText(configacoesTabela.getValueAt(selecionaNumeroLinha, 1).toString());
				txtIdade.setText(configacoesTabela.getValueAt(selecionaNumeroLinha, 2).toString());
				
			}
		});
		tabelaNomes.setFont(new Font("Tahoma", Font.PLAIN, 26));
		scrollPane.setViewportView(tabelaNomes);
		tabelaNomes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "Idade"
			}
		));
		//Aumento a largura das linhas
		tabelaNomes.setRowHeight(30);
		
		JButton btnSalvar = new JButton("Inserir Linha");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel - Biblioteca para trabalharmos com a tabela
				DefaultTableModel linha = (DefaultTableModel)tabelaNomes.getModel();
				
				//Adiciona uma nova linha para a tabela
				linha.addRow(new Object[] {txtNome.getText(),
											txtSobrenome.getText(), 
											txtIdade.getText()});
				
				//Limpando o campo de texto depois que adiciona na tabela
				txtNome.setText("");
				txtSobrenome.setText("");
				txtIdade.setText("");
				
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnSalvar.setBounds(324, 355, 335, 40);
		frmTrabalhandoComJtable.getContentPane().add(btnSalvar);
		
	}
}
