package finalproject;

import java.net.URL;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;  // simple ready-made dialogs
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;



public class WebScraperInterface extends JFrame implements ActionListener {
    private JTextArea text;

    public void setupMenu() {
        JMenuBar mbar = new JMenuBar();
        JMenu mnuFile = new JMenu("File");
		JMenu mnuHelp = new JMenu("Help");
		
		JMenuItem miAbout = new JMenuItem("About");
		miAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Web Scraper app created by"
						+ "Pete Alvarez and Juan Maturino.");
			}
		});
                
        JMenuItem miExit = new JMenuItem("Exit");
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnuFile.add(miExit);
		mnuHelp.add(miAbout);
        mbar.add(mnuFile);
		mbar.add(mnuHelp);
        setJMenuBar(mbar);
    }
    public WebScraperInterface() {
        setTitle("Web Scraper");
        setBounds(100,50,400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new FlowLayout());

        JButton btnSave = new JButton("Save to text");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");
				int selection = fileChooser.showSaveDialog(c);
				if (selection == JFileChooser.APPROVE_OPTION) {
					File fileToSave = fileChooser.getSelectedFile();
				}
			}
		});
		
		JButton btnJson = new JButton("Save to JSON");
        
        panSouth.add(btnSave);
		panSouth.add(btnJson);
        c.add(panSouth, BorderLayout.SOUTH);
		
		JPanel panNorth = new JPanel();
		JTextField urlField = new JTextField("", 20);
		JButton btnFetch = new JButton("Fetch");
		JLabel lblUrl = new JLabel("Enter URL:");
		btnFetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String addr = urlField.getText();
				try {
					URL link = new URL(addr);
				} catch (Exception ex) {
					
				}
			}
		});
		panNorth.add(lblUrl);
		panNorth.add(urlField);
		panNorth.add(btnFetch);
		
		c.add(panNorth, BorderLayout.NORTH);
		
        text = new JTextArea();
        Font f = new Font("Monospaced",Font.BOLD,24);
        text.setFont(f);
        text.setEditable(false);
        text.setText("Data goes here");
        c.add(text,BorderLayout.CENTER);
		
        setupMenu();
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("You pressed the button.");
    }

}
