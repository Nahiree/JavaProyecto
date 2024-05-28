package com.frames;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.frames.*;

public class FrmCarritoCompras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCarritoCompras frame = new FrmCarritoCompras();
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
	public FrmCarritoCompras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Volver al inicio");
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_InicioCliente inicio = new Frm_InicioCliente();
				inicio.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(106, 258, 131, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblTítulo = new JLabel("<html>Carrito de compras");
		lblTítulo.setBackground(new Color(160, 82, 45));
		lblTítulo.setForeground(new Color(0, 0, 0));
		lblTítulo.setFont(new Font("Poppins", Font.BOLD, 24));
		lblTítulo.setBounds(239, 69, 245, 42);
		contentPane.add(lblTítulo);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 1, 1);
		contentPane.add(table_1);
		
		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(128, 0, 0));
		table.setFont(new Font("Poppins", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Precio"},
				{"T\u00E9 de frutos rojos", "2", "Bs 12"},
				{"Tiramis\u00FA de caf\u00E9", "2", "Bs 10"},
				{"Total a pagar", null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(319);
		table.getColumnModel().getColumn(1).setPreferredWidth(58);
		table.setBounds(108, 152, 510, 64);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAHIR\\Downloads\\pexels-matvalina-20184915.jpg"));
		lblNewLabel.setBounds(0, 0, 743, 401);
		contentPane.add(lblNewLabel);
	}
}
