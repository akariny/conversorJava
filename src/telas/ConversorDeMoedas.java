package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controle.ConverterMoedas;

public class ConversorDeMoedas extends JFrame {

	private JPanel contentPane;
	private JTextField txtMoedaInicial;
	private JTextField txtMoedaConvertida;
	
	ConverterMoedas converterMoeda = new ConverterMoedas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeMoedas frame = new ConversorDeMoedas();
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
	public ConversorDeMoedas() {
		setTitle("Conversor de Moedas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor de Moedas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 21, 414, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Converter de:");
		lblNewLabel_1.setBounds(30, 79, 180, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxMoedaInicial = new JComboBox();
		comboBoxMoedaInicial.setBackground(Color.WHITE);
		comboBoxMoedaInicial.setModel(new DefaultComboBoxModel(new String[] 
				{"Selecione", "Real", "Dolar", "Euro", "Libras Esterlinas", "Peso Argentino", "Peso Chileno"}));
		comboBoxMoedaInicial.setSelectedIndex(0);
		comboBoxMoedaInicial.setBounds(30, 94, 180, 22);
		contentPane.add(comboBoxMoedaInicial);
		
		JLabel lblNewLabel_2 = new JLabel("para:");
		lblNewLabel_2.setBounds(244, 79, 180, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBoxMoedaConvertida = new JComboBox();
		comboBoxMoedaConvertida.setModel(new DefaultComboBoxModel(new String[] 
				{"Selecione", "Real", "Dolar", "Euro", "Libras Esterlinas", "Peso Argentino", "Peso Chileno"}));
		comboBoxMoedaConvertida.setSelectedIndex(0);
		comboBoxMoedaConvertida.setBounds(244, 94, 166, 22);
		contentPane.add(comboBoxMoedaConvertida);
		
		txtMoedaInicial = new JTextField();
		txtMoedaInicial.setBounds(30, 127, 180, 40);
		contentPane.add(txtMoedaInicial);
		txtMoedaInicial.setColumns(10);
		
		txtMoedaConvertida = new JTextField();
		txtMoedaConvertida.setBackground(SystemColor.inactiveCaption);
		txtMoedaConvertida.setEditable(false);
		txtMoedaConvertida.setBounds(244, 127, 166, 40);
		contentPane.add(txtMoedaConvertida);
		txtMoedaConvertida.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 196, 382, 49);
		contentPane.add(panel);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int combo1 = comboBoxMoedaInicial.getSelectedIndex();
				int combo2 = comboBoxMoedaConvertida.getSelectedIndex();
				
				String moedaRecebida = txtMoedaInicial.getText();
				
				if(combo1 == 0 || combo2 == 0) {
					erroMoedaSelecionada();
				}
				
				if(moedaRecebida.matches("^(([\\d]{1,5})(\\.([\\d]{1,2}))?)$")) {
					double moedaRecebidaDouble = Double.parseDouble(moedaRecebida);
					
					//real
					if(combo1 == 1 && combo2 == 1) {
						txtMoedaConvertida.setText(moedaRecebida);
					}
					
					if(combo1 == 1 && combo2 == 2) {
						String resultado = converterMoeda.reaisParaDolar(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 1 && combo2 == 3) {
						String resultado = converterMoeda.reaisParaEuro(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 1 && combo2 == 4) {
						String resultado = converterMoeda.reaisParaLibraEsterlina(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 1 && combo2 == 5) {
						String resultado = converterMoeda.reaisParaPesoArgentino(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 1 && combo2 == 6) {
						String resultado = converterMoeda.reaisParaPesoChileno(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					//dolar
					if(combo1 == 2 && combo2 == 1) {
						String resultado = converterMoeda.dolarParaReais(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 2 && combo2 == 2) {
						txtMoedaConvertida.setText(moedaRecebida);
					}
					
					if(combo1 == 2 && combo2 == 3) {
						String resultado = converterMoeda.dolarParaEuro(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 2 && combo2 == 4) {
						String resultado = converterMoeda.dolarParaLibraEsterlina(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 2 && combo2 == 5) {
						String resultado = converterMoeda.dolarParaPesoArgentino(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 2 && combo2 == 6) {
						String resultado = converterMoeda.dolarParaPesoChileno(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					//euro
					if(combo1 == 3 && combo2 == 1) {
						String resultado = converterMoeda.euroParaReais(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 3 && combo2 == 2) {
						String resultado = converterMoeda.euroParaDolar(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 3 && combo2 == 3) {
						txtMoedaConvertida.setText(moedaRecebida);
					}
					
					if(combo1 == 3 && combo2 == 4) {
						String resultado = converterMoeda.euroParaLibraEsterlina(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 3 && combo2 == 5) {
						String resultado = converterMoeda.euroParaPesoArgentino(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 3 && combo2 == 6) {
						String resultado = converterMoeda.euroParaPesoChileno(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					//libra esterlina
					if(combo1 == 4 && combo2 == 1) {
						String resultado = converterMoeda.libraEsterlinaParaReais(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 4 && combo2 == 2) {
						String resultado = converterMoeda.libraEsterlinaParaDolar(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 4 && combo2 == 3) {
						String resultado = converterMoeda.libraEsterlinaParaEuro(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 4 && combo2 == 4) {
						txtMoedaConvertida.setText(moedaRecebida);
					}
					
					if(combo1 == 4 && combo2 == 5) {
						String resultado = converterMoeda.libraEsterlinaParaPesoArgentino(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 4 && combo2 == 6) {
						String resultado = converterMoeda.libraEsterlinaParaPesoChileno(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					//peso argentino
					if(combo1 == 5 && combo2 == 1) {
						String resultado = converterMoeda.pesoArgentinoParaReais(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 5 && combo2 == 2) {
						String resultado = converterMoeda.pesoArgentinoParaDolar(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 5 && combo2 == 3) {
						String resultado = converterMoeda.pesoArgentinoParaEuro(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 5 && combo2 == 4) {
						String resultado = converterMoeda.pesoArgentinoParaLibraEsterlina(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 5 && combo2 == 5) {
						txtMoedaConvertida.setText(moedaRecebida);
					}
					
					if(combo1 == 5 && combo2 == 6) {
						String resultado = converterMoeda.pesoArgentinoParaPesoChileno(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					//peso chileno
					if(combo1 == 6 && combo2 == 1) {
						String resultado = converterMoeda.pesoChilenoParaReais(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 6 && combo2 == 2) {
						String resultado = converterMoeda.pesoChilenoParaDolar(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 6 && combo2 == 3) {
						String resultado = converterMoeda.pesoChilenoParaEuro(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 6 && combo2 == 4) {
						String resultado = converterMoeda.pesoChilenoParaLibraEsterlina(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 6 && combo2 == 5) {
						String resultado = converterMoeda.pesoChilenoParaPesoArgentino(moedaRecebidaDouble);
						txtMoedaConvertida.setText(resultado);
					}
					
					if(combo1 == 6 && combo2 == 6) {
						txtMoedaConvertida.setText(moedaRecebida);
					}
					
				} else {
					erroCampoInvalido();
				}
			}
		});
		panel.add(btnConverter);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxMoedaInicial.setSelectedIndex(0);
				comboBoxMoedaConvertida.setSelectedIndex(0);
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
	}
	
	private void limpar() {
		txtMoedaInicial.setText("");
		txtMoedaConvertida.setText("");
	}
	
	private void voltar() {
		String messagem = "Sair do conversor de moedas?";
		String titulo = "Confirmação";
		
		int reply = JOptionPane.showConfirmDialog(null, messagem, titulo, JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			this.dispose();
		}
		
	}
	
	private void erroMoedaSelecionada() {
		String mensagem = "Selecione a moeda para conversão";
		String titulo = "Erro";
		
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
	private void erroCampoInvalido() {
		String mensagem = "Campo Invalido";
		String titulo = "Erro";
		
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
	}
}
