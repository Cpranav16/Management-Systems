import javax.swing.*;
import java.awt.*;

// using JFrame for the window screen using Swing for Desktop Application
public class Splash extends JFrame implements Runnable{
    Thread t;
    public Splash() {
        // Storing Image in object(i1) using ImageIcon Class from System-Resoure to be loaded in JFrame,
        // Scaling img as req. and storing as image(i2)
        // But Scaled img cant be Loaded directly so needed to convert into ImageIcon(i3),
        // JLabel to show in JFrame and add() for adding in JFrame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t =new Thread(this);
        t.start();

// Setting JFrame configuration True bcz its always hidden,
// Setting Location from X-axis & Y-axis,
// Setting Size from where tobe Visible.
        setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        for (int i = 30; i<=450; i+=4) {
            int newWidth = i * 2; // Grows both sides (left & right)
            int newHeight = i + (i / 2); // Increase height normally
            int newX = (screenWidth - newWidth) / 2; // Keep centered horizontally
            int newY = (screenHeight - newHeight) / 2; // Keep centered vertically

            setSize(newWidth, newHeight);
            setLocation(newX, newY);

            try{
                Thread.sleep(10);
            }catch (Exception e){
        }
    }}

    // For closing the Frame for login
    @Override
    public void run(){
        try {
            Thread.sleep(7000);
            setVisible(false);

            //Next Frame i.e. Login frame.
            new Login();
        } catch (Exception e) {

        }
    }


    public static void main(String[] args) {
        new Splash();
    }
}
