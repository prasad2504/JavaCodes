import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class WelcomeFrame extends JFrame implements ActionListener{
	JLabel l1;
	JButton btnstart,btnexit;
	public WelcomeFrame() {
		getContentPane().setLayout(null);
		l1 = new JLabel("");
		l1.setIcon(new ImageIcon("C:\\Users\\Asus\\OneDrive\\Desktop\\stude.jpg"));
		l1.setBounds(150, 25, 295, 220);
		getContentPane().add(l1);
		
		btnstart = new JButton("Start");
		btnstart.setBounds(111, 305, 89, 23);
		getContentPane().add(btnstart);
		
		btnexit = new JButton("Exit");
		btnexit.setBounds(323, 305, 89, 23);
		getContentPane().add(btnexit);
		
		btnstart.addActionListener(this);
		btnexit.addActionListener(this);
		
		setSize(599,428);
		setVisible(true);
		setTitle("Splash Screen");
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new WelcomeFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnstart) {
			this.dispose();
			new LoginFrame();
		}
		else {
			this.dispose();
		}
	}
} 


