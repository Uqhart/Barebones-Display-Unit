import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Desktop extends JFrame implements ActionListener {

    JDesktopPane desktop;

    public Desktop() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        desktop = new JDesktopPane();
        desktop.setBackground(new Color(21,114,148));
        add(desktop, BorderLayout.CENTER);

        Taskbar();
        // Chrome();

        this.setVisible(true);
    }

    void Taskbar() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(19,86,111));
        // panel.setLayout(null);
        panel.setPreferredSize(new Dimension(0,65));

        // ImageIcon chromeIcon = new ImageIcon("chromeicon.png");
        ImageIcon startIcon = new ImageIcon("starticon.png");
        ImageIcon settingsIcon = new ImageIcon("settingsicon.png");

        JButton start = new JButton();
        start.setIcon(startIcon);
        start.setBounds(0,0,50,50);
        start.setFocusable(false);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        start.setFocusPainted(false);
        start.setToolTipText("Start Menu");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StartMenu();
            }
        });

        // JButton chrome = new JButton();
        // chrome.setIcon(chromeIcon);
        // chrome.setBounds(0,0,50,50);
        // chrome.setFocusable(false);
        // chrome.setOpaque(false);
        // chrome.setContentAreaFilled(false);
        // chrome.setBorderPainted(false);
        // chrome.setFocusPainted(false);
        // chrome.setToolTipText("Chrome Web Browser");

        JButton settings = new JButton();
        settings.setIcon(settingsIcon);
        settings.setBounds(0,0,50,50);
        settings.setFocusable(false);
        settings.setOpaque(false);
        settings.setContentAreaFilled(false);
        settings.setBorderPainted(false);
        settings.setFocusPainted(false);
        settings.setToolTipText("Settings");
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Settings();
            }
        });

        panel.add(start);
        // panel.add(chrome);
        panel.add(settings);

        add(panel, BorderLayout.SOUTH);
    }

    void Settings() {
        JInternalFrame frame = new JInternalFrame("Settings");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setClosable(true);
        frame.setMaximizable(true);
        frame.setResizable(true);
        frame.setVisible(true);
        desktop.add(frame);
    }

    void Chrome() {
        JInternalFrame frame = new JInternalFrame("Chrome Web Browser");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setSize(900,900);
        frame.setClosable(true);
        frame.setMaximizable(true);
        frame.setResizable(true);
        frame.setVisible(true);
    }

    void StartMenu() {
        JInternalFrame frame = new JInternalFrame("Start Menu");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JButton cmd = new JButton(" Command Prompt");
        JButton textEditor = new JButton(" Text Editor");

        final int width = 500;
        final int height = 650;
        final int taskbarHeight = 65;

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        //((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);

        final int x = (screen.width - width) / 2;
        final int y = ((screen.height + (taskbarHeight * 3)) - height) / 2;

        frame.setBounds(x,y,width,height);
        frame.setLayout(new BorderLayout());
        frame.setBackground(new Color(255,255,255));
        frame.setClosable(true);
        frame.setVisible(true);

        // Buttons
        cmd.setSize(width,(height / 9));
        cmd.setBackground(new Color(255,255,255));
        cmd.setForeground(new Color(0,0,0));
        cmd.setFont(new Font("Courier New",Font.BOLD,20));
        cmd.setHorizontalAlignment(SwingConstants.LEFT);
        cmd.setBorderPainted(false);
        cmd.setFocusPainted(true);
        cmd.setToolTipText("Command Prompt");
        cmd.setFocusable(false);

        textEditor.setSize(width,(height / 8));
        textEditor.setFocusable(false);

        frame.add(cmd,BorderLayout.NORTH);
        //frame.add(textEditor,BorderLayout.NORTH);
        desktop.add(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
