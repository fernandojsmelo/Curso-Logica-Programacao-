package TelasJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton {

    private JFrame frame;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    private JTextField txtItem;

    /**
     * Create the application.
     */
    public JRadioButton() {
        initialize();
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JRadioButton window = new JRadioButton();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 755, 460);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        javax.swing.JRadioButton rbSubtracao = new javax.swing.JRadioButton("Subtra\u00E7\u00E3o");
        rbSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 26));
        rbSubtracao.setBounds(352, 149, 235, 47);
        frame.getContentPane().add(rbSubtracao);

        javax.swing.JRadioButton rbDivisao = new javax.swing.JRadioButton("Divis\u00E3o");
        rbDivisao.setFont(new Font("Tahoma", Font.PLAIN, 26));
        rbDivisao.setBounds(352, 212, 235, 47);
        frame.getContentPane().add(rbDivisao);

        javax.swing.JRadioButton rbMultiplicacao = new javax.swing.JRadioButton("Multiplica\u00E7\u00E3o");
        rbMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 26));
        rbMultiplicacao.setBounds(352, 278, 235, 47);
        frame.getContentPane().add(rbMultiplicacao);

        JLabel lblNewLabel = new JLabel("Número 1");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(34, 29, 163, 33);
        frame.getContentPane().add(lblNewLabel);

        txtNumero1 = new JTextField();
        txtNumero1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        txtNumero1.setBounds(34, 60, 163, 42);
        frame.getContentPane().add(txtNumero1);
        txtNumero1.setColumns(10);

        JLabel lblNmero = new JLabel("Número 2");
        lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNmero.setBounds(34, 123, 163, 33);
        frame.getContentPane().add(lblNmero);

        txtNumero2 = new JTextField();
        txtNumero2.setFont(new Font("Tahoma", Font.PLAIN, 26));
        txtNumero2.setColumns(10);
        txtNumero2.setBounds(34, 154, 163, 42);
        frame.getContentPane().add(txtNumero2);

        JLabel lblResultado = new JLabel("Resultado");
        lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblResultado.setBounds(34, 214, 163, 33);
        frame.getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
        txtResultado.setColumns(10);
        txtResultado.setBounds(34, 245, 163, 42);
        frame.getContentPane().add(txtResultado);

        JLabel lblItemSelecionado = new JLabel("Item Selecionado");
        lblItemSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblItemSelecionado.setBounds(34, 322, 163, 33);
        frame.getContentPane().add(lblItemSelecionado);

        txtItem = new JTextField();
        txtItem.setFont(new Font("Tahoma", Font.PLAIN, 26));
        txtItem.setColumns(10);
        txtItem.setBounds(34, 353, 163, 42);
        frame.getContentPane().add(txtItem);

        javax.swing.JRadioButton rbAdicao = new javax.swing.JRadioButton("Adi\u00E7\u00E3o");
        rbAdicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                rbAdicao.setSelected(true);
                rbSubtracao.setSelected(false);
                rbDivisao.setSelected(false);
                rbMultiplicacao.setSelected(false);

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                txtResultado.setText(String.valueOf(numero1 + numero2));
                txtItem.setText("Adição");

            }
        });

        rbAdicao.setFont(new Font("Tahoma", Font.PLAIN, 26));
        rbAdicao.setBounds(352, 77, 235, 47);
        frame.getContentPane().add(rbAdicao);

        //-------------------------------

        rbSubtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                rbAdicao.setSelected(false);
                rbSubtracao.setSelected(true);
                rbDivisao.setSelected(false);
                rbMultiplicacao.setSelected(false);

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                txtResultado.setText(String.valueOf(numero1 - numero2));
                txtItem.setText("Subtração");

            }
        });

        rbDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                rbAdicao.setSelected(false);
                rbSubtracao.setSelected(false);
                rbDivisao.setSelected(true);
                rbMultiplicacao.setSelected(false);

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                txtResultado.setText(String.valueOf(numero1 / numero2));
                txtItem.setText("Divisão");

            }
        });

        rbMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                rbAdicao.setSelected(false);
                rbSubtracao.setSelected(false);
                rbDivisao.setSelected(false);
                rbMultiplicacao.setSelected(true);

                double numero1 = Double.parseDouble(txtNumero1.getText());
                double numero2 = Double.parseDouble(txtNumero2.getText());

                txtResultado.setText(String.valueOf(numero1 * numero2));
                txtItem.setText("Multiplicação");

            }
        });


    }
}
