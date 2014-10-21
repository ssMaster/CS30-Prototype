import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;


public class MainMenuPrototype extends JFrame {

	private JPanel	contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuPrototype frame = new MainMenuPrototype();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenuPrototype() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		// Send the user to the correct order menu based on the time (breakfast or lunch)
		JButton btnNewButton_1 = new JButton("ORDER");
		contentPane.add(btnNewButton_1);
		
		// 
		JButton btnNewButton = new JButton("PAY & GO");
		contentPane.add(btnNewButton);
		
		// Show the list of items currently ordered
		JButton btnNewButton_3 = new JButton("REVIEW ORDER");
		contentPane.add(btnNewButton_3);
		
		// Send the user to the menu frame for drinks and desserts
		JButton btnNewButton_2 = new JButton("DRINKS & DESSERTS");
		contentPane.add(btnNewButton_2);
	}

}
