package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Color;

public class Square extends JFrame implements ActionListener{
  JLabel a1,ans;
  JTextField t1;
  JButton b1;
  
  Square(){
    a1=new JLabel ("Enter any number");
    a1.setOpaque(true);
    a1.setBounds(150, 86, 160, 30);
    a1.setBackground(new Color(0, 255, 255));
    t1=new JTextField (30);
    t1.setBackground(new Color(192, 192, 192));
    t1.setBounds(349, 82, 150, 36);
    b1=new JButton("Square");
    b1.setForeground(new Color(255, 255, 255));
    b1.setEnabled(false);
    b1.setBackground(new Color(255, 0, 0));
    b1.setBounds(269, 150, 113, 21);
    ans= new JLabel("    ");
    ans.setForeground(new Color(0, 128, 255));
    ans.setBackground(new Color(255, 0, 255));
    ans.setBounds(287, 212, 150, 55);
    getContentPane().setLayout(null);
    
    getContentPane().add(a1);
    getContentPane().add(t1);
    getContentPane().add(b1);
    getContentPane().add(ans);
    
    b1.addActionListener(this);
    
    
    setSize(891,479);
    setTitle("Square Application");
    setVisible(true);
    setLocationRelativeTo(null);
    
  }
  public static void main(String[] args) {
    Square d1 = new Square();
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    String n = t1.getText();
    int no=Integer.parseInt(n);
    //System.out.println(no*no);
    ans.setText(""+(no*no));
    
  }
  
}