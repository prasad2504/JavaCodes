package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo2 extends JFrame implements ActionListener {
	
	JLabel a1;
	JTextField t1;
	JButton b1;
	
	
	Demo2(){
		a1=new JLabel("enter name");
		t1=new JTextField(20);
		b1=new JButton("OK");
		
		
		
		add(a1);
		add(t1);
		add(b1);
		
		b1.addActionListener(this);
		
		//setLayout(new FlowLayout());
		setLayout(null);  //absolute layout 
		setTitle("My First Application");
		setSize(600,400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		Demo2 d1 =new Demo2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		String n = t1.getText();
		System.out.println("hiiiiii..." + n);
	}

}
