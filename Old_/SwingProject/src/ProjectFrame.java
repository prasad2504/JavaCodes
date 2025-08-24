import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProjectFrame extends JFrame implements ActionListener {
    JLabel lblno1, lblno2, lblresult;
    JTextField txtno1, txtno2;
    JButton btnplus, btnminus, btnmult, btndiv, btnexit;
    
    public ProjectFrame() {
        setTitle("Calculator");
        setSize(719, 553);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lblno1 = new JLabel("Enter first number: ");
        lblno1.setBounds(20, 1, 352, 80);
        lblno2 = new JLabel("Enter second number: ");
        lblno2.setBounds(20, 81, 352, 80);
        lblresult = new JLabel("Result: ");
        lblresult.setBounds(43, 321, 352, 80);
        
        txtno1 = new JTextField();
        txtno1.setBounds(284, 11, 352, 61);
        txtno2 = new JTextField();
        txtno2.setBounds(284, 100, 352, 61);
        
        btnplus = new JButton("+");
        btnplus.setBounds(7, 185, 144, 75);
        btnminus = new JButton("-");
        btnminus.setBounds(161, 185, 132, 75);
        btnmult = new JButton("*");
        btnmult.setBounds(317, 183, 144, 78);
        btndiv = new JButton("/");
        btndiv.setBounds(480, 182, 154, 80);
        btnexit = new JButton("Exit");
        btnexit.setBounds(470, 321, 144, 80);
        getContentPane().setLayout(null);
        
        getContentPane().add(lblno1); getContentPane().add(txtno1);
        getContentPane().add(lblno2); getContentPane().add(txtno2);
        getContentPane().add(btnplus); getContentPane().add(btnminus);
        getContentPane().add(btnmult); getContentPane().add(btndiv);
        getContentPane().add(lblresult); getContentPane().add(btnexit);
        
        btnplus.addActionListener(this);
        btnminus.addActionListener(this);
        btnmult.addActionListener(this);
        btndiv.addActionListener(this);
        btnexit.addActionListener(this);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txtno1.getText());
            double num2 = Double.parseDouble(txtno2.getText());
            double result = 0;
            
            if (e.getSource() == btnplus) {
                result = num1 + num2;
            } else if (e.getSource() == btnminus) {
                result = num1 - num2;
            } else if (e.getSource() == btnmult) {
                result = num1 * num2;
            } else if (e.getSource() == btndiv) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    lblresult.setText("Error: Division by zero");
                    return;
                }
            } else if (e.getSource() == btnexit) {
                System.exit(0);
            }
            
            lblresult.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            lblresult.setText("Error: Invalid input");
        }
    }
    
    public static void main(String[] args) {
        new ProjectFrame();
    }
}