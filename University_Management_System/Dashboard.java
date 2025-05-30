import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Dashboard extends JFrame implements ActionListener {


    Dashboard() {
        setSize(1540,850);

        //Image Configuration
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1540,850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        //creating Menu-Bar
        JMenuBar mb = new JMenuBar();

        JMenu newInfo =  new JMenu("Information");
        mb.add(newInfo);
        JMenuItem facInfo = new JMenuItem("Faculty Information");
        newInfo.add(facInfo);
        JMenuItem stdInfo = new JMenuItem("Student Information");
        newInfo.add(stdInfo);

        JMenu vwDetail =  new JMenu("View Details");
        mb.add(vwDetail);
        JMenuItem facvw = new JMenuItem("Faculty Details");
        vwDetail.add(facvw);
        JMenuItem stdvw = new JMenuItem("Student Details");
        vwDetail.add(stdvw);


        JMenu appleave =  new JMenu("Apply Leave");
        mb.add(appleave);
        JMenuItem faclv = new JMenuItem("Faculty Leave");
        appleave.add(faclv);
        JMenuItem stdlv = new JMenuItem("Student Leave");
        appleave.add(stdlv);


        JMenu lDetails =  new JMenu("Leave Details");
        mb.add(lDetails);
        JMenuItem facDl = new JMenuItem("Faculty Leave Details");
        lDetails.add(facDl);
        JMenuItem stdDl = new JMenuItem("Student Leave Details");
        lDetails.add(stdDl);


        JMenu examinations =  new JMenu("Examinations");
        mb.add(examinations);
        JMenuItem ExmRes = new JMenuItem("Exam's Results");
        examinations.add(ExmRes);
        JMenuItem EntMarks = new JMenuItem("Enter Marks");
        examinations.add(EntMarks);


        JMenu upDetails =  new JMenu("Update Details");
        mb.add(upDetails);
        JMenuItem facup = new JMenuItem("Update Faculty Details");
        upDetails.add(facup);
        JMenuItem stdup = new JMenuItem("Update Student Details");
        upDetails.add(stdup);


        JMenu feeDetails =  new JMenu("Fee Details");
        mb.add(feeDetails);
        JMenuItem stdFee = new JMenuItem("Fee Structure");
        feeDetails.add(stdFee);
        JMenuItem stdFeeForm = new JMenuItem("Student Fee Form");
        feeDetails.add(stdFeeForm);


        JMenu utility =  new JMenu("Utility");
        mb.add(utility);
        JMenuItem calc = new JMenuItem("Calculator");
        calc.addActionListener(this);
        utility.add(calc);
        JMenuItem Notepd = new JMenuItem("Notepad");
        Notepd.addActionListener(this);
        utility.add(Notepd);


        JMenu exit =  new JMenu("Exit");
        mb.add(exit);
        JMenuItem cl = new JMenuItem("Close");
        cl.addActionListener(this);
        exit.add(cl);
        JMenuItem Signout = new JMenuItem("Sign Out");
        Signout.addActionListener(this);
        exit.add(Signout);

        setJMenuBar(mb);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("Close")){
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if (msg.equals("Sign Out")) {
            setVisible(false);
            new Login();
        }
    }


    public static void main(String[] args) {
        new Dashboard();
    }
}
