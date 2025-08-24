
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;

public class RegistrationFrame extends JFrame implements ActionListener{

	
	JLabel lblfirstname , lbllastname , mobile ,email ,username , lblpassword;
	JTextField txtfirstname , txtlastname , txtmobile , txtemail , txtusername ; 
	JPasswordField password;
	JButton btnregister , btncancel;
	JLabel lblimg;
	
	
	
	public RegistrationFrame() {
		getContentPane().setIgnoreRepaint(true);
		
		 lblfirstname = new JLabel("Enter your first name");
		 lblfirstname.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 lblfirstname.setBounds(237, 297, 132, 13);
		 lbllastname = new JLabel("Enter your last name");
		 lbllastname.setBounds(237, 339, 155, 19);
		 mobile = new JLabel("enter your mobile number");
		 mobile.setBounds(215, 387, 177, 19);
		 email =new JLabel("enter your mail");
		 email.setBounds(264, 445, 105, 16);
		 username = new JLabel ("enter your username");
		 username.setBounds(238, 499, 131, 13);
		 lblpassword = new JLabel("enter your password");
		 lblpassword.setBounds(240, 545, 132, 13);
		
		 
		 txtfirstname = new JTextField(20);
		 txtfirstname.setBounds(414, 294, 166, 19);
		 txtlastname =new JTextField(20);
		 txtlastname.setBounds(414, 339, 166, 19);
		 txtmobile = new JTextField(20);
		 txtmobile.setBounds(414, 387, 166, 19);
		 txtemail =  new JTextField(20);
		 txtemail.setBounds(414, 444, 166, 19);
		 txtusername = new JTextField(20);
		 txtusername.setBounds(414, 496, 166, 19);
		 password = new JPasswordField(20);
		 password.setBounds(414, 542, 166, 19);
		 
		 btnregister = new JButton("Register");
		 btnregister.setBounds(290, 615, 97, 34);
		 btncancel= new JButton("Cancel");
		 btncancel.setBounds(422, 615, 88, 34);
		 
		 ImageIcon icon =new ImageIcon("D:\\new.png");
		 getContentPane().setLayout(null);
		 lblimg = new JLabel(icon);
		 lblimg.setBounds(135, 0, 500, 280);
		 getContentPane().add(lblimg);
		 
		 getContentPane().add(lblfirstname);
		 getContentPane().add(txtfirstname);
		 
		 getContentPane().add(lbllastname);
		 getContentPane().add(txtlastname);
		 
		 getContentPane().add(mobile);
		 getContentPane().add(txtmobile);
		 
		 getContentPane().add(email);
		 getContentPane().add(txtemail);
		 
		 getContentPane().add(username);
		 getContentPane().add(txtusername);
		 
		 getContentPane().add(lblpassword);
		 getContentPane().add(password);
		 
		 getContentPane().add(btnregister);
		 getContentPane().add(btncancel); 
		 
		 
		 btnregister.addActionListener(this);
		 btncancel.addActionListener(this);
		 
		 
		 setSize(800,800);
		 setVisible(true);
		 setLocationRelativeTo(null);
		 
		 
	}

	
	public static void main(String[] args) {
		new RegistrationFrame();
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnregister) {
			String fn = txtfirstname.getText();
			String ln = txtlastname.getText();
			String mb = txtmobile.getText();
			String em = txtemail.getText();
			String un = txtusername.getText();
			String ps = new String(password.getPassword());
			
			//User user = new User(fn,ln,mb,em,un,ps);
			JOptionPane.showMessageDialog(this, "succes , login now");
			new LoginFrame();
		}
		else if(e.getSource()==btncancel) {
			this.dispose();
		}
		
		
	}

}
