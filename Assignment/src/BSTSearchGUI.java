import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BSTSearchGUI {

    JFrame BSTSearchframe;
	private JTextField textField;
	private BSTree tree = new BSTree();//This is new
	//private int current=0; //This is new

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BSTSearchGUI window = new BSTSearchGUI();
					window.BSTSearchframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BSTSearchGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tree.insert(1,"J.Smith",22);
		tree.insert(2,"T.Black",24);
		tree.insert(3,"M.Gray",24);
		
		BSTSearchframe = new JFrame();
		BSTSearchframe.setBounds(100, 100, 521, 361);
		BSTSearchframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BSTSearchframe.getContentPane().setLayout(null);
		
		JLabel lblStudentManagementSystem = new JLabel("STUDENT MANAGEMENT SYSTEM");
		lblStudentManagementSystem.setFont(new Font("Calibri", Font.BOLD, 20));
		lblStudentManagementSystem.setBounds(102, 13, 301, 37);
		BSTSearchframe.getContentPane().add(lblStudentManagementSystem);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField.setBounds(77, 125, 218, 22);
		BSTSearchframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		
		btnSearch.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnSearch.setBounds(323, 124, 97, 25);
		BSTSearchframe.getContentPane().add(btnSearch);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Calibri", Font.PLAIN, 18));
		textArea.setBounds(77, 175, 343, 102);
		BSTSearchframe.getContentPane().add(textArea);
		
		JLabel lblSearch = new JLabel("BINARY SEARCH TREE SEARCH");
		lblSearch.setBounds(162, 63, 192, 16);
		BSTSearchframe.getContentPane().add(lblSearch);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int id=Integer.parseInt(textField.getText());
		    	 Node temp = tree.search(id);
		    	 if (temp==null)
		    	 {  
		    		 textArea.setText("Unknown");
		    	  }
		    	 else
		    	 {
		    		 textArea.setText("Roll Number: "+temp.readRollnumber()+"\nStudent Name: "+temp.readName()+"\nMarks: "+temp.readMarks());
		    		// t1.setText(""+temp.readRollnumber());
		    	     //t2.setText(""+temp.readName());
		             //t3.setText(""+temp.readMarks());
		    	 }
			}
		});
	}
}
