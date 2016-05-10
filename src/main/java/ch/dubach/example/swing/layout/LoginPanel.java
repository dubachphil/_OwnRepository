package ch.dubach.example.swing.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel {

	public LoginPanel() {

	}

	public static void main (String[] args) {
		JFrame frame = new JFrame();

		frame.setLayout(null);

		//For Positioning the Containers

		//Labeling
		JLabel label = new JLabel("WELCOME TO LOGIN PANEL", JLabel.CENTER);
		JLabel user = new JLabel("UserName:");
		JLabel pass = new JLabel("Password:");

		//Some features of SETBOUNDS() Methods
		//setBounds(x-axis, y-axis, width, height);
		label.setBounds(150,10,220,20);
		user.setBounds(150,50,100,50);
		pass.setBounds(150,90,100,50);

		//TextField
		JTextField userField = new JTextField();
		JPasswordField passField = new JPasswordField();

		//Some of the features of SETBOUNDS() Methods
		//setBounds(x-axis, y-axis, width, height);
		userField.setBounds(250,65,80,20);
		passField.setBounds(250,105,80,20);

		//Button
		JButton but1 = new JButton("Bestätigen");

		//setBounds(x-axis, y-axis, width, height);
		but1.setBounds(200,150,150,20);

		//adding containers to JFRAME
		frame.getContentPane().add(label);
		frame.getContentPane().add(user);
		frame.getContentPane().add(userField);
		frame.getContentPane().add(pass);
		frame.getContentPane().add(passField);
		frame.getContentPane().add(but1);

		//features of JFrame
		//Although these can be defined
		//before the containers.
		//We defined at last
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(500,300);
		
		System.out.println(userField.getText());

	}

}