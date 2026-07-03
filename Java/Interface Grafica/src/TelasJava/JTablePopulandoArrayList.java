package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.util.ArrayList;

public class JTablePopulandoArrayList {

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
					JTablePopulandoArrayList window = new JTablePopulandoArrayList();
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
	public JTablePopulandoArrayList() {
		initialize();
		
		//Popular as informa��es
		populaInformacoesNaJTable();
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
				
				//Pega o n�mero da linha selecionada
				int selecionaNumeroLinha = tabelaNomes.getSelectedRow();
				
				//selecionaNumeroLinha - N�mero da linha
				//0 - N�mero da coluna
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
		
		JButton btnSalvar = new JButton("Salvar");
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
		btnSalvar.setBounds(36, 355, 192, 40);
		frmTrabalhandoComJtable.getContentPane().add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel - Biblioteca para trabalharmos com a tabela
				DefaultTableModel modelo = (DefaultTableModel)tabelaNomes.getModel();
				
				//Pega o n�mero da linha que est� selecionada
				int linha = tabelaNomes.getSelectedRow();
				
				//if - se
				if(linha >= 0) {
					
					//modelo - DefaultTableModel
					//setValueAt - colocar/alterar uma informa��o
					//txtNome.getText() - Pegando o texto que est� no campo do txt
					//linha - O n�mero da linha que eu selecionei
					//0 - O n�mero da coluna que vou altera a informa��o
					modelo.setValueAt(txtNome.getText(), linha, 0);
					modelo.setValueAt(txtSobrenome.getText(), linha, 1);
					modelo.setValueAt(txtIdade.getText(), linha, 2);
				
				//else - sen�o
				}else {
					
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar a informa��o");
					
				}
				
				
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnAlterar.setBounds(241, 355, 192, 40);
		frmTrabalhandoComJtable.getContentPane().add(btnAlterar);
		
	}
	
	//Classe de clientes
	public class Cliente{
		
		//Atributos
		public String nome;
		public String sobrenome;
		public String idade;
		
		public Cliente(String n, String sn, String i) {
			
			this.nome = n;
			this.sobrenome = sn;
			this.idade = i;
			
		}
		
	}
	
	//ArrayList
	public <E> ArrayList<E> listaClientes(){
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Ana", "Paula", "29");
		Cliente cliente2 = new Cliente("Carlos", "Pires", "35");
		Cliente cliente3 = new Cliente("Viviane", "Gomes", "51");
		Cliente cliente4 = new Cliente("Pedro", "Silva", "32");
		Cliente cliente5 = new Cliente("Alice", "Almeida", "19");
		Cliente cliente6 = new Cliente("Cintia", "Bernardes", "52");
		Cliente cliente7 = new Cliente("Carla", "Nunes", "28");
		Cliente cliente8 = new Cliente("Mia", "Leal", "19");
		lista.add(cliente1);
		lista.add(cliente2);
		lista.add(cliente3);
		lista.add(cliente4);
		lista.add(cliente5);
		lista.add(cliente6);
		lista.add(cliente7);
		lista.add(cliente8);
		
		return (ArrayList<E>) lista;
		
	}


	public void populaInformacoesNaJTable(){
		
		
		//DefaultTableModel implementa a iterface
		DefaultTableModel informacao = (DefaultTableModel) tabelaNomes.getModel();
		ArrayList<Cliente> lista = listaClientes();
		Object linha[] = new Object[3];
		
		//for - para
		for(int coluna = 0; coluna < lista.size(); coluna++) {
			
			linha[0] = lista.get(coluna).nome;
			linha[1] = lista.get(coluna).sobrenome;
			linha[2] = lista.get(coluna).idade;
			
			//Adiciono as informacoes de cada coluna na linha corrente
			informacao.addRow(linha);
			
			
		}
		
	}
	
}
