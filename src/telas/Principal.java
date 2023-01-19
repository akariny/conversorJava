package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Conversor Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Conversor Java");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 11, 414, 43);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("selecione o que deseja converter");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 65, 404, 22);
		contentPane.add(lblNewLabel_1);

		JButton btnMoedas = new JButton("Conversor de Moedas");
		btnMoedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorDeMoedas moedas = new ConversorDeMoedas();
				moedas.setVisible(true);
			}
		});
		btnMoedas.setBounds(65, 112, 304, 30);
		contentPane.add(btnMoedas);

		JButton btnTemperatura = new JButton("Conversor de Temperatura");
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorDeTemperatura temperatura = new ConversorDeTemperatura();
				temperatura.setVisible(true);
			}
		});
		btnTemperatura.setBounds(65, 153, 304, 30);
		contentPane.add(btnTemperatura);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		btnSair.setBounds(65, 194, 304, 30);
		contentPane.add(btnSair);
	}

	private void sair() {
		String messagem = "Deseja realmente sair?";
		String titulo = "Confirmação";
		
		// Exibe caixa de dialogo solicitando confirmação ou não.
		// Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
		int reply = JOptionPane.showConfirmDialog(null, messagem, titulo, JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			System.exit(reply);
		}
	}
}
