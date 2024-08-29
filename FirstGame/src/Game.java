import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	JFrame window;
	Container con;
	JPanel titleNamePanel,startButtonPanel;
	JLabel titleNameLabel,startButtonLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN,40); 
	public static void main(String[] args) {
		new Game();

	}
	
	public Game() {
		//create window 
		window = new JFrame();
		window.setSize(1000,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		
		//content pane of window
		con = window.getContentPane();
		//create panel for title name
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 800, 250);
		titleNamePanel.setBackground(Color.black);
		//create label for title name in title panel
		titleNameLabel = new JLabel("ADVENTURE GAME");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		//add title label to titlepanel
		titleNamePanel.add(titleNameLabel);
		//create start button panel
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(400,400, 200, 150);
		startButtonPanel.setBackground(Color.blue);
		//create start button label
		
		//add title panel to content pane
		con.add(titleNamePanel);
	}

}
