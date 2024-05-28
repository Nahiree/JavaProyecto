package com.frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmFactura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFactura frame = new FrmFactura();
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
	public FrmFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setFont(new Font("Poppins", Font.BOLD, 24));
		lblFactura.setBounds(309, 34, 109, 29);
		contentPane.add(lblFactura);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblNombre.setBounds(184, 93, 94, 22);
		contentPane.add(lblNombre);
		
		JLabel lbl_idCliente = new JLabel("ID Cliente:");
		lbl_idCliente.setFont(new Font("Poppins", Font.PLAIN, 14));
		lbl_idCliente.setBounds(184, 126, 80, 14);
		contentPane.add(lbl_idCliente);
		
		JLabel lblFechaEmision = new JLabel("Fecha de emisión:");
		lblFechaEmision.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblFechaEmision.setBounds(184, 151, 133, 14);
		contentPane.add(lblFechaEmision);
		
		JLabel lblFechaLimite = new JLabel("Fecha limite:");
		lblFechaLimite.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblFechaLimite.setBounds(184, 176, 133, 14);
		contentPane.add(lblFechaLimite);
		
		JLabel lbl_idFactura = new JLabel("ID factura:");
		lbl_idFactura.setFont(new Font("Poppins", Font.PLAIN, 14));
		lbl_idFactura.setBounds(184, 201, 88, 14);
		contentPane.add(lbl_idFactura);
		
		JLabel lblDetalle = new JLabel("Detalle del pedido");
		lblDetalle.setFont(new Font("Poppins", Font.BOLD, 14));
		lblDetalle.setBounds(184, 226, 146, 14);
		contentPane.add(lblDetalle);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Lista de productos");
		lblNewLabel_3.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(207, 251, 88, 49);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<html> Lista de precios");
		lblNewLabel_4.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(426, 255, 80, 41);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblTotalPagar = new JLabel("Total a pagar");
		lblTotalPagar.setFont(new Font("Poppins", Font.BOLD, 14));
		lblTotalPagar.setBounds(426, 331, 109, 14);
		contentPane.add(lblTotalPagar);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
		lblNewLabel_6.setBounds(0, 0, 154, 401);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
		lblNewLabel_6_1.setBounds(579, 0, 165, 435);
		contentPane.add(lblNewLabel_6_1);
		
		JButton btnVolver = new JButton("Volver al inicio");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_InicioCliente inicio = new Frm_InicioCliente();
				inicio.setVisible(true);
			}
		});
		btnVolver.setFont(new Font("Poppins", Font.BOLD, 14));
		btnVolver.setBounds(206, 367, 154, 23);
		contentPane.add(btnVolver);
	}

}
