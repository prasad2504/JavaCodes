package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener{

	JLabel lblusername , lalpassword;
	JTextField txtusername ;
	JPasswordField txtpassword;
	JButton btnlogin,btncancel,btnregister;
	
	User user;
	
	public LoginForm(User user) {
		this.user=user;
		lblusername = new JLabel("enter your name");
		lblusername.setBounds(67, 83, 76, 13);
		lalpassword = new JLabel("enter your password");
		lalpassword.setBounds(61, 120, 94, 13);
		txtusername = new JTextField(20);
		txtusername.setBounds(169, 80, 166, 19);
		txtpassword = new JPasswordField(20);
		txtpassword.setBounds(169, 117, 166, 19);
		btnlogin = new JButton("login");
		btnlogin.setBounds(124, 159, 76, 30);
		btncancel = new JButton("cancel");
		btncancel.setBounds(225, 159, 76, 30);
		btnregister = new JButton();
		getContentPane().setLayout(null);
		
		getContentPane().add(lblusername);
		getContentPane().add(txtusername);
		
		getContentPane().add(lalpassword);
		getContentPane().add(txtpassword);
		
		getContentPane().add(btnlogin);
		getContentPane().add(btncancel);
		getContentPane().add(btnregister);
		
		//register to butoon
		
		btnlogin.addActionListener(this);
		btncancel.addActionListener(this);
		btnregister.addActionListener(this);
		
		setSize(400,300);
		setVisible(true);
		
		
		
		
		
	}


public static void main(String[] args) {
	
}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnregister) {
			new Resgistration();
		}
	    if(e.getSource()==btnlogin) {
	    	String un = txtusername.getText();
	    	String ps = new String(txtpassword.getPassword());
	    	if(un.equals(user.username)&&ps.equals(user.password)) {
	    		//System.out.println("success");
	    		JOptionPane.showMessageDialog(this, "success");
	    	}else {
	    		//System.out.println("invalid");
	    		JOptionPane.showMessageDialog(this, "invalid");
	    	}
	    }
		
	    else if(e.getSource()==btncancel) {
		  this.dispose();
	  }
	}
}
