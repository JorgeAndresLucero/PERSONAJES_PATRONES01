package Gui;


import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazUno extends JFrame {

	private JPanel contentPane;
	VentanaOrco continuar = new VentanaOrco();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazUno frame = new InterfazUno();
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
	public InterfazUno() {
		setTitle("CAT\u00C1LOGO DE PERSONAJES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblSeleccioneElPersonaje = new JLabel("Seleccione el personaje que desea crear");
		lblSeleccioneElPersonaje.setBounds(10, 64, 426, 14);
		lblSeleccioneElPersonaje.setFont(new Font("Tunga", Font.PLAIN, 18));
		contentPane.add(lblSeleccioneElPersonaje);
		
		//Botones de Seleccion
		JButton btnOrco = new JButton("");
		btnOrco.setBounds(10, 105, 200, 200);
		btnOrco .setIcon(new ImageIcon(InterfazUno.class.getResource("orco.png")));
		contentPane.add(btnOrco);
		//Accion Orco
		btnOrco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaOrco nuevaOrco = new VentanaOrco();
				nuevaOrco.setVisible(true);
				InterfazUno.this.dispose();
			}
		});
		
		JButton btnMago = new JButton("");
		btnMago.setBounds(220, 105, 200, 200);
		btnMago .setIcon(new ImageIcon(InterfazUno.class.getResource("mago.png")));
		contentPane.add(btnMago);
		//Accion botonMago
		btnMago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaMago nuevaMago = new VentanaMago();
				nuevaMago.setVisible(true);
				InterfazUno.this.dispose();
			}
		});
		
		JButton btnHumano = new JButton("");
		btnHumano.setBounds(430, 105, 200, 200);
		btnHumano.setIcon(new ImageIcon(InterfazUno.class.getResource("humano.png")));
		contentPane.add(btnHumano);
		
		//Accion botonHumano
				btnHumano.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						VentanaHumano nuevaHumano = new VentanaHumano();
						nuevaHumano.setVisible(true);
						InterfazUno.this.dispose();
					}
				});
				
						
		JButton btnHobbit = new JButton("");
		btnHobbit.setIcon(new ImageIcon(InterfazUno.class.getResource("hobbit.png")));
		btnHobbit.setBounds(640, 105, 200, 200);
		contentPane.add(btnHobbit);
		//Accion botonHobbit
		btnHobbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaHobbit nuevaHobbit = new VentanaHobbit();
				nuevaHobbit.setVisible(true);
				InterfazUno.this.dispose();
				
			}
		});
		
		
		
		
	}
}
