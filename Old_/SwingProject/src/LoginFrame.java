import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;


public class LoginFrame extends JFrame implements ActionListener {
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2,btnregister;
	
	private JPasswordField txtpassword;
	LoginFrame(){
		l1 = new JLabel("Enter your user name ");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l1.setBackground(new Color(0, 255, 255));
		l1.setBounds(10, 46, 182, 17);
		l2 = new JLabel("                             ");
		l2.setBounds(89, 196, 289, 28);
		t1 = new JTextField(30);
		t1.setBounds(202, 46, 246, 20);
		b1 = new JButton("Login");
		b1.setSelected(true);
		b1.setBackground(new Color(0, 0, 0));
		b1.setBounds(116, 152, 76, 23);
		b2 = new JButton("Cancel");
		b2.setSelected(true);
		b2.setBackground(new Color(128, 255, 255));
		b2.setBounds(219, 152, 87, 23);
		setLocationRelativeTo(null);
		
		getContentPane().setBackground(new Color(255, 128, 128));
		setSize(500,300);
		setTitle("Login Frame ");
		setVisible(true);
		getContentPane().setLayout(null);
		getContentPane().add(l1);
		getContentPane().add(t1);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(l2);
		
		JLabel lblEnterYourUser = new JLabel("Enter your user password ");
		lblEnterYourUser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEnterYourUser.setBackground(Color.CYAN);
		lblEnterYourUser.setBounds(10, 95, 224, 17);
		getContentPane().add(lblEnterYourUser);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(219, 95, 223, 20);
		getContentPane().add(txtpassword);
		
		btnregister = new JButton("New User?  Register Now");
		btnregister.setBounds(289, 12, 185, 23);
		getContentPane().add(btnregister);
		// register the component for event handling
		b1.addActionListener(this);
		b2.addActionListener(this);
		btnregister.addActionListener(this);
	}
	public static void main(String[] args) {
		LoginFrame f1 = new LoginFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			//System.out.println(n+ " You have clicked on Ok Button");
			String un = t1.getText();
			String pwd = txtpassword.getText();
			if(un.equals("student") && pwd.equals("student")) {
				l2.setText("Login Successfull");
				dispose();
				new ProjectFrame();
			}
			else {
				l2.setText("Invalid Username of Password");
			}
			
		}
		else if(e.getSource()==b2)
			//System.out.println(n + " You have clicked on Cancel Button");
			dispose();
		else if(e.getSource()==btnregister) {
			dispose();
			new RegistrationFrame();
		}
	}
}
