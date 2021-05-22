import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class smartwatch_window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public smartwatch_window() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 252, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(94, 8, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	    JLabel lblNewLabel_1 = new JLabel("Surname:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 42, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 39, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 70, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		 JLabel lblNewLabel_2 = new JLabel("A.M.K.A.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 73, 56, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Homy tel:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 135, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(94, 132, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		BufferedImage buttonIcon = ImageIO.read(new File("button_Background/addButton.png"));
		JButton btnNewButton = new JButton(new ImageIcon(buttonIcon));
		btnNewButton.setBorder(BorderFactory.createEmptyBorder());
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("All good");
			}
		});
		btnNewButton.setBounds(195, 102, 41, 48);
		
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(textField.getText().isEmpty()) && !(textField_1.getText().isEmpty()) && !(textField_2.getText().isEmpty()))
				{
					User user = new User(textField.getText(),textField_1.getText(), textField_2.getText());
					System.out.println("User Created");
				}
				
			}
		});
		btnNewButton_1.setBounds(67, 94, 125, 25);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
