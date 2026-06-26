package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriandoSegundaTela {

	private JFrame frmUnindoNomeSobrenome;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtNomeSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriandoSegundaTela window = new CriandoSegundaTela();
					window.frmUnindoNomeSobrenome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CriandoSegundaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmUnindoNomeSobrenome = new JFrame();
		frmUnindoNomeSobrenome.setTitle("Unindo Nome Sobrenome");
		frmUnindoNomeSobrenome.setBounds(100, 100, 549, 487);
		frmUnindoNomeSobrenome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnindoNomeSobrenome.getContentPane().setLayout(null);
		
		//Centralizar a tela
		frmUnindoNomeSobrenome.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(54, 37, 97, 35);
		frmUnindoNomeSobrenome.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNome.setBounds(54, 75, 409, 35);
		frmUnindoNomeSobrenome.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(54, 137, 216, 35);
		frmUnindoNomeSobrenome.getContentPane().add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(54, 175, 409, 35);
		frmUnindoNomeSobrenome.getContentPane().add(txtSobrenome);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeCompleto.setBounds(54, 250, 216, 35);
		frmUnindoNomeSobrenome.getContentPane().add(lblNomeCompleto);
		
		txtNomeSobrenome = new JTextField();
		txtNomeSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNomeSobrenome.setColumns(10);
		txtNomeSobrenome.setBounds(54, 288, 409, 35);
		frmUnindoNomeSobrenome.getContentPane().add(txtNomeSobrenome);
		
		JButton btnUnir = new JButton("Unir Nome e Sobrenome");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//txtNome.getText() - Pegando o texto que tem no campo
				txtNomeSobrenome.setText(txtNome.getText() + " " + txtSobrenome.getText() );
				
			}
		});
		btnUnir.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnUnir.setBounds(54, 361, 409, 45);
		frmUnindoNomeSobrenome.getContentPane().add(btnUnir);
	}
}
