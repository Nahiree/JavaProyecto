package com.frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMenuCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenuCliente frame = new FrmMenuCliente();
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
	public FrmMenuCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_InicioCliente inicio = new Frm_InicioCliente();
				inicio.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNewButton.setBounds(28, 21, 64, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblTitulo = new JLabel("Menú");
		lblTitulo.setFont(new Font("Poppins", Font.BOLD, 24));
		lblTitulo.setBounds(331, 28, 73, 29);
		contentPane.add(lblTitulo);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 83, 371, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(354, 59, 17, 48);
		panel.add(scrollBar);
		
		JLabel lblTítuloFR = new JLabel("<html>Té de frutos fojos");
		lblTítuloFR.setFont(new Font("Poppins", Font.BOLD, 24));
		lblTítuloFR.setBounds(193, 20, 145, 87);
		panel.add(lblTítuloFR);
		
		JLabel lblTextoInfFR = new JLabel("<html> Disfruta una deliciosa infución con la frescura de sus ingredientes forestales. ");
		lblTextoInfFR.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblTextoInfFR.setBounds(193, 118, 148, 118);
		panel.add(lblTextoInfFR);
		
		JButton btnCarritoBebidas = new JButton("Añadir al carrito");
		btnCarritoBebidas.setFont(new Font("Poppins", Font.PLAIN, 14));
		btnCarritoBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCarritoBebidas.setBounds(193, 270, 145, 23);
		panel.add(btnCarritoBebidas);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Pictures\\Javita\\terojo.jpg"));
		lblNewLabel_3.setBounds(21, 20, 145, 267);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(370, 83, 374, 318);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(357, 61, 17, 48);
		panel_1.add(scrollBar_1);
		
		JLabel lblTítuloTirN = new JLabel("<html>Tiramisú de cafe");
		lblTítuloTirN.setFont(new Font("Poppins", Font.BOLD, 24));
		lblTítuloTirN.setBounds(189, 35, 132, 62);
		panel_1.add(lblTítuloTirN);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Prueba el increible sabor de nuestro tiramisu de café, un deleite imperdible,");
		lblNewLabel_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(189, 108, 132, 110);
		panel_1.add(lblNewLabel_1);
		
		JButton btnCarritoPostres = new JButton("Añadir al carrito");
		btnCarritoPostres.setFont(new Font("Poppins", Font.PLAIN, 14));
		btnCarritoPostres.setBounds(176, 256, 145, 23);
		panel_1.add(btnCarritoPostres);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Pictures\\Javita\\tiramusi.jpg"));
		lblNewLabel_2.setBounds(21, 27, 158, 252);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-76, -259, 820, 458);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
	}
}
