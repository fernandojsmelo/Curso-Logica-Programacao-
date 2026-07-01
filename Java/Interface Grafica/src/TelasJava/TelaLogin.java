package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class TelaLogin {

	private JFrame frmTelaDeLogin;
	private JTextField txtNome;
	private JPasswordField passwordField_Senha;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmTelaDeLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeLogin = new JFrame();
		frmTelaDeLogin.setTitle("Tela de Login");
		frmTelaDeLogin.setBounds(100, 100, 596, 450);
		frmTelaDeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeLogin.getContentPane().setLayout(null);
		
		//Centralizar a tela
		frmTelaDeLogin.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(55, 109, 468, 31);
		frmTelaDeLogin.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNome.setBounds(55, 150, 468, 31);
		frmTelaDeLogin.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSenha.setBounds(55, 202, 468, 31);
		frmTelaDeLogin.getContentPane().add(lblSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if - se
				//&& - E
				//getText - Pega o texto que está no campo
				//equals - Igual
				if(txtNome.getText().equals("Amanda") && passwordField_Senha.getText().equals("123") ) {
					
					//Mensagem
					JOptionPane.showMessageDialog(null, "Usuário logado com sucesso!");
				
				//else - senão
				}else {
					
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
					
				}
				
			}
		});
		btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLogar.setBounds(55, 300, 468, 49);
		frmTelaDeLogin.getContentPane().add(btnLogar);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		passwordField_Senha.setBounds(55, 237, 468, 31);
		frmTelaDeLogin.getContentPane().add(passwordField_Senha);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/Usuario.png")));
		lblNewLabel_1.setBounds(216, 27, 113, 55);
		frmTelaDeLogin.getContentPane().add(lblNewLabel_1);
	}
}
