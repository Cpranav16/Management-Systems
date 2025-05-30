import javax.swing.*;
import java.awt.*;

public class StudentDetails extends JFrame {
    JLabel lb_name, lb_rno, lb_address, lb_email, lb_classxii, lb_course, lb_fathername, lb_dob, lb_phone, lb_classx, lb_aadhar, lb_branch;
    JTextField tf_name, tf_rno, tf_address, tf_emial, tf_classxii, tf_course, tf_fathername, tf_dob, tf_phone, tf_classx, tf_aadhar, tf_branch;
    JButton submit, cancel;

    StudentDetails(){

        setSize(850,750);
        setLocation(300,37);

        getContentPane().setBackground(Color.white);
        setLayout(null);

        // Username Label
        lb_name = new JLabel("Name");
        lb_name.setBounds(50,90,150,30);
        lb_name.setFont(new Font("arial", Font.BOLD,15));
        add(lb_name);

        tf_name = new JTextField();
        tf_name.setBounds(160,90,170,30);
        add(tf_name);


        // RollNo Label
        lb_rno = new JLabel("Roll No.");
        lb_rno.setBounds(50,180,150,30);
        lb_rno.setFont(new Font("arial", Font.BOLD,15));
        add(lb_rno);

        tf_rno = new JTextField();
        tf_rno.setBounds(160,180,170,30);
        add(tf_rno);


        // Address Label
        lb_address = new JLabel("Address");
        lb_address.setBounds(50,270,150,30);
        lb_address.setFont(new Font("arial", Font.BOLD,15));
        add(lb_address);

        tf_address = new JTextField();
        tf_address.setBounds(160,270,170,30);
        add(tf_address);


        // Email Label
        lb_email = new JLabel("Email ID");
        lb_email.setBounds(50,360,150,30);
        lb_email.setFont(new Font("arial", Font.BOLD,15));
        add(lb_email);

        tf_emial = new JTextField();
        tf_emial.setBounds(160,360,170,30);
        add(tf_emial);


        // Class XII Label
        lb_classxii = new JLabel("Class XII");
        lb_classxii.setBounds(50,450,150,30);
        lb_classxii.setFont(new Font("arial", Font.BOLD,15));
        add(lb_classxii);

        tf_classxii = new JTextField();
        tf_classxii.setBounds(160,450,170,30);
        add(tf_classxii);


        // Course Name Label
        lb_course = new JLabel("Course");
        lb_course.setBounds(50,540,150,30);
        lb_course.setFont(new Font("arial", Font.BOLD,15));
        add(lb_course);

        tf_course = new JTextField();
        tf_course.setBounds(160,540,170,30);
        add(tf_course);


        // Father Name Label
        lb_fathername = new JLabel("Father");
        lb_fathername.setBounds(420,90,150,30);
        lb_fathername.setFont(new Font("arial", Font.BOLD,15));
        add(lb_fathername);

        tf_fathername = new JTextField();
        tf_fathername.setToolTipText("Father Name");
        tf_fathername.setBounds(550,90,170,30);
        add(tf_fathername);
//
//
//        // D.O.B. Label
//        lb_dob = new JLabel("Name");
//        lb_dob.setBounds(40,40,100,20);
//        lb_dob.setFont(new Font("arial", Font.BOLD,15));
//        add(lb_dob);
//
//        tf_dob = new JTextField();
//        tf_dob.setBounds(150,40,150,20);
//        add(tf_dob);
//
//
//        // Phone Label
//        lb_phone = new JLabel("Name");
//        lb_phone.setBounds(40,40,100,20);
//        lb_phone.setFont(new Font("arial", Font.BOLD,15));
//        add(lb_phone);
//
//        tf_phone = new JTextField();
//        tf_phone.setBounds(150,40,150,20);
//        add(tf_phone);
//
//
//        // Class X Label
//        lb_classx = new JLabel("Name");
//        lb_classx.setBounds(40,40,100,20);
//        lb_classx.setFont(new Font("arial", Font.BOLD,15));
//        add(lb_classx);
//
//        tf_classx = new JTextField();
//        tf_classx.setBounds(150,40,150,20);
//        add(tf_classx);
//
//
//        // Adhaar Label
//        lb_aadhar = new JLabel("Name");
//        lb_aadhar.setBounds(40,40,100,20);
//        lb_aadhar.setFont(new Font("arial", Font.BOLD,15));
//        add(lb_aadhar);
//
//        tf_aadhar = new JTextField();
//        tf_aadhar.setBounds(150,40,150,20);
//        add(tf_aadhar);
//
//
//        // Branch Label
//        lb_branch = new JLabel("Name");
//        lb_branch.setBounds(40,40,100,20);
//        lb_branch.setFont(new Font("arial", Font.BOLD,15));
//        add(lb_branch);
//
//        tf_branch = new JTextField();
//        tf_branch.setBounds(150,40,150,20);
//        add(tf_branch);

        setVisible(true);
    }

    public static void main (String[] args){
    new StudentDetails();
    }

}
