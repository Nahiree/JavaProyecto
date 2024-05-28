package com.frames;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.frames.*;
public class FrmInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUser;
	private JTextField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInicio frame = new FrmInicio();
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
	public FrmInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInicioSesion = new JLabel("Iniciar sesión:");
		lblInicioSesion.setForeground(new Color(255, 255, 255));
		lblInicioSesion.setFont(new Font("Poppins", Font.BOLD, 22));
		lblInicioSesion.setBounds(293, 91, 180, 20);
		contentPane.add(lblInicioSesion);
		
		textUser = new JTextField();
		textUser.setBounds(235, 166, 262, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblUser = new JLabel("Nombre de usuario:");
		lblUser.setForeground(new Color(255, 255, 255));
		lblUser.setFont(new Font("Poppins", Font.BOLD, 14));
		lblUser.setBounds(235, 141, 160, 14);
		contentPane.add(lblUser);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setForeground(new Color(255, 255, 255));
		lblContraseña.setFont(new Font("Poppins", Font.BOLD, 14));
		lblContraseña.setBounds(235, 191, 111, 20);
		contentPane.add(lblContraseña);
		
		textContraseña = new JTextField();
		textContraseña.setBounds(235, 214, 262, 20);
		contentPane.add(textContraseña);
		textContraseña.setColumns(10);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_InicioCliente inicio = new Frm_InicioCliente();
				inicio.setVisible(true);
			}
		});
		btnAcceder.setFont(new Font("Poppins", Font.BOLD, 14));
		btnAcceder.setBounds(316, 267, 111, 23);
		contentPane.add(btnAcceder);
		
		JButton btnNuevaCuenta = new JButton("¿No tienes una cuenta?");
		btnNuevaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmRegistro registrarse = new FrmRegistro();
				registrarse.setVisible(true);
			}
		});
		btnNuevaCuenta.setFont(new Font("Poppins", Font.BOLD, 14));
		btnNuevaCuenta.setBounds(263, 301, 220, 23);
		contentPane.add(btnNuevaCuenta);
		
		JLabel lblBienvenida = new JLabel("<html> Bienvenidx a Emociones líquidas!");
		lblBienvenida.setBounds(159, 33, 447, 37);
		contentPane.add(lblBienvenida);
		lblBienvenida.setBackground(new Color(139, 69, 19));
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setForeground(new Color(255, 255, 255));
		lblBienvenida.setFont(new Font("Poppins", Font.BOLD, 24));
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
		lblFondo.setBounds(0, 0, 748, 405);
		contentPane.add(lblFondo);
	}
}
