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

public class JTable_Soma_Itens_e_Conta_Linhas {

	private JFrame frmTrabalhandoComJtable;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTable tabelaNomes;
	private JTextField txtSalarios;
	private JTextField txtQtdLinhas;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable_Soma_Itens_e_Conta_Linhas window = new JTable_Soma_Itens_e_Conta_Linhas();
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
	public JTable_Soma_Itens_e_Conta_Linhas() {
		initialize();
		
		//Popular as informações
		populaInformacoesNaJTable();
		
		//Chama a função que soma os salário e conta as linhas
		somar_contar();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrabalhandoComJtable = new JFrame();
		frmTrabalhandoComJtable.getContentPane().setBackground(new Color(255, 255, 255));
		frmTrabalhandoComJtable.setTitle("Trabalhando com JTable");
		frmTrabalhandoComJtable.setBounds(100, 100, 903, 460);
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
				txtSalario.setText(configacoesTabela.getValueAt(selecionaNumeroLinha, 3).toString());
				
			}
		});
		tabelaNomes.setFont(new Font("Tahoma", Font.PLAIN, 26));
		scrollPane.setViewportView(tabelaNomes);
		tabelaNomes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "Idade", "Sal\u00E1rio"
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
											txtIdade.getText(),
											txtSalario.getText()});
				
				//Limpando o campo de texto depois que adiciona na tabela
				txtNome.setText("");
				txtSobrenome.setText("");
				txtIdade.setText("");
				txtSalario.setText("");
				
				
				//Recalcular tudo de novo
				somar_contar();
				
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
				
				//Pega o número da linha que está selecionada
				int linha = tabelaNomes.getSelectedRow();
				
				//if - se
				if(linha >= 0) {
					
					//modelo - DefaultTableModel
					//setValueAt - colocar/alterar uma informação
					//txtNome.getText() - Pegando o texto que está no campo do txt
					//linha - O número da linha que eu selecionei
					//0 - O número da coluna que vou altera a informação
					modelo.setValueAt(txtNome.getText(), linha, 0);
					modelo.setValueAt(txtSobrenome.getText(), linha, 1);
					modelo.setValueAt(txtIdade.getText(), linha, 2);
					modelo.setValueAt(txtSalario.getText(), linha, 3);
				
					//Recalcular tudo de novo
					somar_contar();
					
				//else - senão
				}else {
					
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para alterar a informação");
					
				}
				
				
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnAlterar.setBounds(241, 355, 192, 40);
		frmTrabalhandoComJtable.getContentPane().add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel implementa a iterface
				DefaultTableModel linha = (DefaultTableModel) tabelaNomes.getModel();
				
				//Tratamento de erro
				//try - tente
				try {
					
					int numeroLinhaItemSelecionado = tabelaNomes.getSelectedRow();
					
					//removeRow - Remover a linha selecionada
					linha.removeRow(numeroLinhaItemSelecionado);
					
					//Recalcular tudo de novo
					somar_contar();

				//catch
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Nã há nenhum registro selecionado");
					
				}
								
			}
		});
		btnDeletar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnDeletar.setBounds(443, 355, 192, 40);
		frmTrabalhandoComJtable.getContentPane().add(btnDeletar);
		
		JLabel lblSalrios = new JLabel("Sal\u00E1rios");
		lblSalrios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSalrios.setBounds(678, 115, 142, 40);
		frmTrabalhandoComJtable.getContentPane().add(lblSalrios);
		
		txtSalarios = new JTextField();
		txtSalarios.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtSalarios.setColumns(10);
		txtSalarios.setBounds(678, 152, 201, 33);
		frmTrabalhandoComJtable.getContentPane().add(txtSalarios);
		
		JLabel lblLinhas = new JLabel("Linhas");
		lblLinhas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLinhas.setBounds(678, 208, 142, 40);
		frmTrabalhandoComJtable.getContentPane().add(lblLinhas);
		
		txtQtdLinhas = new JTextField();
		txtQtdLinhas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtQtdLinhas.setColumns(10);
		txtQtdLinhas.setBounds(678, 245, 201, 33);
		frmTrabalhandoComJtable.getContentPane().add(txtQtdLinhas);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		lblSalrio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSalrio.setBounds(669, 34, 142, 40);
		frmTrabalhandoComJtable.getContentPane().add(lblSalrio);
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtSalario.setColumns(10);
		txtSalario.setBounds(669, 71, 201, 33);
		frmTrabalhandoComJtable.getContentPane().add(txtSalario);
		
	}
	
	//Classe de clientes
	public class Cliente{
		
		//Atributos
		public String nome;
		public String sobrenome;
		public String idade;
		public double salario;
		
		public Cliente(String n, String sn, String i, double s) {
			
			this.nome = n;
			this.sobrenome = sn;
			this.idade = i;
			this.salario = s;
			
		}
		
	}
	
	//ArrayList
	public <E> ArrayList<E> listaClientes(){
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Ana", "Paula", "29", 50);
		Cliente cliente2 = new Cliente("Carlos", "Pires", "35", 100);
		Cliente cliente3 = new Cliente("Viviane", "Gomes", "51", 150);
		Cliente cliente4 = new Cliente("Pedro", "Silva", "32", 200);
		Cliente cliente5 = new Cliente("Alice", "Almeida", "19", 250);
		Cliente cliente6 = new Cliente("Cintia", "Bernardes", "52", 300);
		Cliente cliente7 = new Cliente("Carla", "Nunes", "28", 350);
		Cliente cliente8 = new Cliente("Mia", "Leal", "19", 400);
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
		Object linha[] = new Object[4];
		
		//for - para
		for(int coluna = 0; coluna < lista.size(); coluna++) {
			
			linha[0] = lista.get(coluna).nome;
			linha[1] = lista.get(coluna).sobrenome;
			linha[2] = lista.get(coluna).idade;
			linha[3] = lista.get(coluna).salario;
			
			//Adiciono as informacoes de cada coluna na linha corrente
			informacao.addRow(linha);
			
			
		}
		
	}
	
	public void somar_contar(){
		
		double soma = 0;
		int qtdLinhas = 0;
		
		//tabelaNomes.getRowCount() - Contar a quantidade de linhas que tem na nossa tabela
		//for - para
		for(int linha = 0; linha < tabelaNomes.getRowCount(); linha++) {
			
			soma = soma + Double.parseDouble(tabelaNomes.getValueAt(linha, 3).toString());
			
		}
		
		//Imprimir como texto
		txtSalarios.setText( Double.toString(soma));
		
		//Conto quantas linhas tem na nossa tabela
		qtdLinhas = tabelaNomes.getRowCount();
		
		//Imprimir como texto
		txtQtdLinhas.setText( Integer.toString(qtdLinhas));
		
	}
	
}
