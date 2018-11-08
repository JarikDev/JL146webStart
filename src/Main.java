import javax.jnlp.FileContents;
import javax.jnlp.FileOpenService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {
    static JFrame jFrame=getJFrame();
    static JPanel jPanel=new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JButton("Submit"));
     
    }
    static JFrame getJFrame(){
        JFrame jFrame=new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
