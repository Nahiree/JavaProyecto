package com.frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIdPersona;
	private JTextField textNombres;
	private JTextField textApPaterno;
	private JTextField textApMaterno;
	private JTextField textCelular;
	private JTextField textUsuario;
	private JTextField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistro frame = new FrmRegistro();
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
	public FrmRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setForeground(new Color(255, 255, 255));
		lblRegistrarse.setFont(new Font("Poppins", Font.BOLD, 24));
		lblRegistrarse.setBounds(273, 22, 161, 24);
		contentPane.add(lblRegistrarse);
		
		JLabel lbl_idPersona = new JLabel("ID/NIT");
		lbl_idPersona.setForeground(new Color(255, 255, 255));
		lbl_idPersona.setFont(new Font("Poppins", Font.BOLD, 14));
		lbl_idPersona.setBounds(211, 162, 126, 14);
		contentPane.add(lbl_idPersona);
		
		textIdPersona = new JTextField();
		textIdPersona.setFont(new Font("Poppins", Font.PLAIN, 12));
		textIdPersona.setBounds(211, 181, 143, 20);
		contentPane.add(textIdPersona);
		textIdPersona.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setForeground(new Color(255, 255, 255));
		lblNombres.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNombres.setBounds(211, 66, 120, 14);
		contentPane.add(lblNombres);
		
		textNombres = new JTextField();
		textNombres.setFont(new Font("Poppins", Font.PLAIN, 11));
		textNombres.setBounds(211, 85, 301, 20);
		contentPane.add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblApMaterno = new JLabel("Apellido materno:");
		lblApMaterno.setForeground(new Color(255, 255, 255));
		lblApMaterno.setFont(new Font("Poppins", Font.BOLD, 14));
		lblApMaterno.setBounds(376, 111, 136, 14);
		contentPane.add(lblApMaterno);
		
		textApPaterno = new JTextField();
		textApPaterno.setFont(new Font("Poppins", Font.PLAIN, 12));
		textApPaterno.setBounds(211, 136, 143, 20);
		contentPane.add(textApPaterno);
		textApPaterno.setColumns(10);
		
		JLabel lblApPaterno = new JLabel("Apellido paterno:");
		lblApPaterno.setForeground(new Color(255, 255, 255));
		lblApPaterno.setFont(new Font("Poppins", Font.BOLD, 14));
		lblApPaterno.setBounds(211, 111, 126, 14);
		contentPane.add(lblApPaterno);
		
		textApMaterno = new JTextField();
		textApMaterno.setFont(new Font("Poppins", Font.PLAIN, 12));
		textApMaterno.setBounds(376, 136, 136, 20);
		contentPane.add(textApMaterno);
		textApMaterno.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setForeground(new Color(255, 255, 255));
		lblCelular.setFont(new Font("Poppins", Font.BOLD, 14));
		lblCelular.setBounds(376, 162, 58, 14);
		contentPane.add(lblCelular);
		
		textCelular = new JTextField();
		textCelular.setFont(new Font("Poppins", Font.PLAIN, 12));
		textCelular.setBounds(376, 181, 136, 20);
		contentPane.add(textCelular);
		textCelular.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Nombre de usuario:");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Poppins", Font.BOLD, 14));
		lblUsuario.setBounds(211, 212, 161, 14);
		contentPane.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Poppins", Font.PLAIN, 12));
		textUsuario.setText("El usuario debe tener más de 8 carcateres");
		textUsuario.setBounds(211, 229, 301, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setForeground(new Color(255, 255, 255));
		lblContraseña.setFont(new Font("Poppins", Font.BOLD, 14));
		lblContraseña.setBounds(211, 260, 104, 14);
		contentPane.add(lblContraseña);
		
		textContraseña = new JTextField();
		textContraseña.setBackground(new Color(248, 248, 255));
		textContraseña.setForeground(new Color(0, 0, 0));
		textContraseña.setFont(new Font("Poppins", Font.PLAIN, 12));
		textContraseña.setText("La contraseña debe tener mas de 8 carcateres");
		textContraseña.setBounds(211, 274, 303, 20);
		contentPane.add(textContraseña);
		textContraseña.setColumns(10);
		
		JToggleButton tglbtnCliente = new JToggleButton("Cliente");
		tglbtnCliente.setFont(new Font("Poppins", Font.PLAIN, 14));
		tglbtnCliente.setBounds(211, 305, 143, 23);
		contentPane.add(tglbtnCliente);
		
		JToggleButton tglbtnEmpleado = new JToggleButton("Empleado");
		tglbtnEmpleado.setFont(new Font("Poppins", Font.PLAIN, 14));
		tglbtnEmpleado.setBounds(376, 305, 136, 23);
		contentPane.add(tglbtnEmpleado);
		
		JButton btnRegistrarse = new JButton("Siguiente");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_InicioCliente inicio= new Frm_InicioCliente();
				inicio.setVisible(true);
				
			}
		});
		btnRegistrarse.setFont(new Font("Poppins", Font.BOLD, 14));
		btnRegistrarse.setBounds(303, 339, 131, 23);
		contentPane.add(btnRegistrarse);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
		lblNewLabel.setBounds(0, -9, 744, 422);
		contentPane.add(lblNewLabel);
	}
}
