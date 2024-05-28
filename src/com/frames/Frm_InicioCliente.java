package com.frames;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.frames.*;

public class Frm_InicioCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_InicioCliente frame = new Frm_InicioCliente();
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
	public Frm_InicioCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Bienveninidx!");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 24));
		lblNewLabel_1.setBounds(55, 30, 200, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFrase = new JLabel("<html>Tómatelo con calma, tómate un té!");
		lblFrase.setForeground(new Color(255, 255, 255));
		lblFrase.setFont(new Font("Poppins", Font.BOLD, 24));
		lblFrase.setBounds(209, 118, 315, 87);
		contentPane.add(lblFrase);
		
		JButton btnMenu = new JButton("Menú");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmMenuCliente menu = new FrmMenuCliente();
				menu.setVisible(true);
			}
		});
		btnMenu.setForeground(new Color(160, 82, 45));
		btnMenu.setFont(new Font("Poppins", Font.PLAIN, 14));
		btnMenu.setBounds(101, 259, 89, 23);
		contentPane.add(btnMenu);
		
		JButton btnCarritoCompras = new JButton("Carrito de Compras");
		btnCarritoCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCarritoCompras carrito = new FrmCarritoCompras();
				carrito.setVisible(true);
			}
		});
		btnCarritoCompras.setForeground(new Color(160, 82, 45));
		btnCarritoCompras.setFont(new Font("Poppins", Font.PLAIN, 14));
		btnCarritoCompras.setBounds(253, 259, 193, 23);
		contentPane.add(btnCarritoCompras);
		
		JButton btnFacturacion = new JButton("Facturación");
		btnFacturacion.setForeground(new Color(160, 82, 45));
		btnFacturacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmFactura factura = new FrmFactura();
				factura.setVisible(true);
			}
		});
		btnFacturacion.setFont(new Font("Poppins", Font.PLAIN, 14));
		btnFacturacion.setBounds(514, 259, 125, 23);
		contentPane.add(btnFacturacion);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
		lblNewLabel.setBounds(0, 0, 757, 401);
		contentPane.add(lblNewLabel);
	}
}
