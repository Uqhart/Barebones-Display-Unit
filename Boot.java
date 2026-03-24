import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Boot extends JFrame {

    JLabel label = new JLabel("BAREBONES DISPLAY UNIT (BDU)");

    public Boot() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        this.getContentPane().setBackground(new Color(0,0,0));
        this.getContentPane().setCursor(null);
        this.setVisible(true);

        label.setFont(new Font("Arial",Font.BOLD,50));
        label.setForeground(new Color(255,255,255));
        label.setSize(100,60);
        
        this.add(label);
    }
}
