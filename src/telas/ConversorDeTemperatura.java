package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ConverterTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class ConversorDeTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField txtTemperaturaInicial;
	private JTextField txtTemperaturaConvertida;
	
	ConverterTemperatura converterTemperatura = new ConverterTemperatura();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeTemperatura frame = new ConversorDeTemperatura();
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
	public ConversorDeTemperatura() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor de Temperatura");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 22, 414, 25);
		contentPane.add(lblNewLabel);
		
		txtTemperaturaInicial = new JTextField();
		//txtTemperaturaInicial.setText("0");
		txtTemperaturaInicial.setBounds(21, 108, 154, 38);
		contentPane.add(txtTemperaturaInicial);
		txtTemperaturaInicial.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("----->");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(185, 102, 78, 38);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxTempInicial = new JComboBox();
		comboBoxTempInicial.setForeground(Color.BLACK);
		comboBoxTempInicial.setBackground(Color.WHITE);
		comboBoxTempInicial.setBounds(21, 77, 154, 20);
		contentPane.add(comboBoxTempInicial);
		comboBoxTempInicial.setModel(new DefaultComboBoxModel(new String[] 
				{"Selecione", "Celcius", "Fahrenheit", "Kelvin"}));
		comboBoxTempInicial.setSelectedIndex(0);
		
		JComboBox comboBoxTempConvertida = new JComboBox();
		comboBoxTempConvertida.setBackground(Color.WHITE);
		comboBoxTempConvertida.setModel(new DefaultComboBoxModel(new String[] 
				{"Selecione", "Celcius", "Fahrenheit", "Kelvin"}));
		comboBoxTempConvertida.setSelectedIndex(0);
		comboBoxTempConvertida.setBounds(259, 77, 154, 20);
		contentPane.add(comboBoxTempConvertida);
		
		txtTemperaturaConvertida = new JTextField();
		txtTemperaturaConvertida.setBackground(SystemColor.inactiveCaption);
		txtTemperaturaConvertida.setEditable(false);
		txtTemperaturaConvertida.setBounds(259, 108, 154, 38);
		contentPane.add(txtTemperaturaConvertida);
		txtTemperaturaConvertida.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 179, 391, 49);
		contentPane.add(panel);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int combo1 = comboBoxTempInicial.getSelectedIndex();
				int combo2 = comboBoxTempConvertida.getSelectedIndex();
				
				String temperaturaRecebida = txtTemperaturaInicial.getText();
				
				if (combo1 == 0 || combo2 == 0) {
					erroTemperatura();
				}
				
				if (temperaturaRecebida.matches( "^(([\\d]{1,5})(\\.([\\d]{1,2}))?)$")) {
					double temperaturaRecebidaDouble = Double.parseDouble(temperaturaRecebida);
					
					if (combo1 == 1 && combo2 == 1) {
						txtTemperaturaConvertida.setText(temperaturaRecebida);
					}
					
					if (combo1 == 1 && combo2 == 2) {
						String resultado = 
								converterTemperatura.celciusParaFahrenheit(temperaturaRecebidaDouble);
						txtTemperaturaConvertida.setText(resultado);
					}
					
					if (combo1 == 1 && combo2 == 3) {
						String resultado = 
								converterTemperatura.celciusParaKelvin(temperaturaRecebidaDouble);
						txtTemperaturaConvertida.setText(resultado);
					}
					
					if (combo1 == 2 && combo2 == 1) {
						String resultado = 
								converterTemperatura.fahrenheitParaCelsius(temperaturaRecebidaDouble);
						txtTemperaturaConvertida.setText(resultado);
					}
					
					if (combo1 == 2 && combo2 == 2) {
						txtTemperaturaConvertida.setText(temperaturaRecebida);
					}
					
					if (combo1 == 2 && combo2 == 3) {
						String resultado = 
								converterTemperatura.fahrenheitParaKelvin(temperaturaRecebidaDouble);
						txtTemperaturaConvertida.setText(resultado);
					}
					
					if (combo1 == 3 && combo2 == 1) {
						String resultado = 
								converterTemperatura.kelvinParaCelsius(temperaturaRecebidaDouble);
						txtTemperaturaConvertida.setText(resultado);
					}
					
					if (combo1 == 3 && combo2 == 2) {
						String resultado = 
								converterTemperatura.kelvinParaFahrenheit(temperaturaRecebidaDouble);
						txtTemperaturaConvertida.setText(resultado);						
					}
					
					if (combo1 == 3 && combo2 == 3) {
						txtTemperaturaConvertida.setText(temperaturaRecebida);
					}
					
				} else {
					erroTextfieldInvalida();
				}
						
			}
		});
		panel.add(btnConverter);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxTempInicial.setSelectedIndex(0);
				comboBoxTempConvertida.setSelectedIndex(0);
				limpar();
			}
		});
		panel.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voltar();
			}
		});
		panel.add(btnVoltar);
		
		JLabel lblNewLabel_2 = new JLabel("Converter de:");
		lblNewLabel_2.setBounds(20, 58, 155, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("para:");
		lblNewLabel_3.setBounds(259, 58, 154, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	private void limpar() {
		txtTemperaturaInicial.setText("");
		txtTemperaturaConvertida.setText("");
	}
	
	private void voltar() {
		String messagem = "Sair do conversor de temperatura?";
		String titulo = "Confirmação";
		
		int reply = JOptionPane.showConfirmDialog(null, messagem, titulo, JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			this.dispose();
		}
	}
	
	private void erroTemperatura() {
		String mensagem = "Selecione a temperatura";
		String titulo = "Erro";
		
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);

	}
	
	private void erroTextfieldInvalida() {
		String mensagem = "Campo Invalido!";
		String titulo = "Erro";
		
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
}
