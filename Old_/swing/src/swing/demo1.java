package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class demo1 {
	public static void main(String[] args) {
		
		JFrame f1 = new JFrame();
		
		JLabel a =new  JLabel("Enter your name");
		JTextField t1 = new JTextField(40);
		JButton b1 = new JButton("ok");
		
		
		
		f1.add(a);
		f1.add(t1);
		f1.add(b1);
		
		f1.setLayout(new FlowLayout());
		f1.setTitle("My First Application");
		f1.setSize(600,400);
		f1.setVisible(true);
		
	}

}
