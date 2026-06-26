package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Instalacao_e_Teste {

	private JFrame frmPrimeirosPassos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instalacao_e_Teste window = new Instalacao_e_Teste();
					window.frmPrimeirosPassos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Instalacao_e_Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeirosPassos = new JFrame();
		frmPrimeirosPassos.setTitle("Primeiros Passos");
		frmPrimeirosPassos.setBounds(100, 100, 849, 476);
		frmPrimeirosPassos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimeirosPassos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instala\u00E7\u00E3o e Teste");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setBounds(132, 138, 600, 102);
		frmPrimeirosPassos.getContentPane().add(lblNewLabel);
	}
}
