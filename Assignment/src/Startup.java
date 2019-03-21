import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Startup {

	private JFrame Startupframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startup window = new Startup();
					window.Startupframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Startup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Startupframe = new JFrame();
		Startupframe.setBounds(100, 100, 538, 362);
		Startupframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Startupframe.getContentPane().setLayout(null);
		
		JLabel lblStudentManagementSystem = new JLabel("STUDENT MANAGEMENT SYSTEM");
		lblStudentManagementSystem.setFont(new Font("Calibri", Font.BOLD, 20));
		lblStudentManagementSystem.setBounds(110, 36, 299, 44);
		Startupframe.getContentPane().add(lblStudentManagementSystem);
		
		JButton btnBinarySearchTree = new JButton("BINARY SEARCH TREE");
		
		btnBinarySearchTree.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnBinarySearchTree.setBounds(162, 126, 194, 31);
		Startupframe.getContentPane().add(btnBinarySearchTree);
		
		JButton btnHashTable = new JButton("HASH TABLE");
		
		btnHashTable.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnHashTable.setBounds(162, 183, 194, 31);
		Startupframe.getContentPane().add(btnHashTable);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnExit.setBounds(162, 240, 194, 31);
		Startupframe.getContentPane().add(btnExit);
		
		btnBinarySearchTree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BSTInsertGUI window = new BSTInsertGUI();
				window.BSTInsertframe.setVisible(true);
				Startupframe.dispose();
			}
		});
		
		btnHashTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HashTableInsertGUI();
				Startupframe.dispose();
			}
		});
	}
}
