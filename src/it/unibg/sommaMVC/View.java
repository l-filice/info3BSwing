package it.unibg.sommaMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

public class View {
	
	private Model model;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel lblSomma;
	public JButton btnComputeSum;
	
	public View(Model model) {
		
		this.model = model;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Addendo 1");
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Addendo 2");
		
		JLabel lblSomma = new JLabel("New label");
		
		JButton btnNewButton = new JButton("Somma");
		
		JLabel lblRisultato = new JLabel("Risultato:");
	
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(105)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(lblRisultato)
							.addGap(31)
							.addComponent(lblSomma)))
					.addGap(243))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1))
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addComponent(btnNewButton)
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRisultato)
						.addComponent(lblSomma))
					.addGap(3))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public void addListener(ActionListener listener) {
		btnComputeSum.addActionListener(listener);
	}
	
	public void update() {
		lblSomma.setText(""+model.getSomma());
	}
}
