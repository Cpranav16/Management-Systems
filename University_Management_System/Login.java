import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton loginBtn,cancelBtn;
    JTextField tfusername,tfpassword;
    Login (){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        // Username Label
        JLabel lbusername = new JLabel("Username");
        lbusername.setBounds(40,40,100,20);
        lbusername.setFont(new Font("arial", Font.BOLD,15));
        add(lbusername);

        tfusername = new JTextField();
        tfusername.setBounds(150,40,150,20);
        add(tfusername);


        // Password Label
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(40,80,100,20);
        lbpassword.setFont(new Font("aria",Font.BOLD,15));
        add(lbpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150,80,150,20);
        add(tfpassword);


        //Button Label for Login
        loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(40,190,100,30);
        add(loginBtn);
        loginBtn.addActionListener(this);


        //Buttton Label for Cancel
        cancelBtn = new JButton("CANCEL");
        cancelBtn.setBounds(200,190,100,30);
        add(cancelBtn);
        cancelBtn.addActionListener(this);


        //Image Configuration
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 =i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);


        //JFrame setting should be at last bcz if you call setVisible(true) before adding components,
        // the UI may not update properly,
        // leading to missing or incorrectly displayed elements,
        // bcz Swing uses Single Thread only for GUI updates.
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String query1;
        if (e.getSource()==loginBtn) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            //mysql query
            query1 = "select * from login where username = '"+username+"' and password = '"+password+"';";
            try{
                DBConnect db = new DBConnect();
                ResultSet rs =  db.s.executeQuery(query1);
                if (rs.next()){
                    setVisible(false);
                    new Dashboard();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
        }
        }
        else if (e.getSource()==cancelBtn) {setVisible(false);}
    }
}
