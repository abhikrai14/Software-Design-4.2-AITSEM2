import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BSTInsertGUI {

	JFrame BSTInsertframe;
	private JTextField rnTF;
	private JTextField nameTF;
	private JTextField marksTF;
	private BSTree tree=new BSTree();//This is new
	//private int current=0; //This is new

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BSTInsertGUI window = new BSTInsertGUI();
					window.BSTInsertframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BSTInsertGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BSTInsertframe = new JFrame();
		BSTInsertframe.setBounds(100, 100, 492, 412);
		BSTInsertframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BSTInsertframe.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("Roll Number: ");
		label_1.setFont(new Font("Calibri", Font.BOLD, 18));
		label_1.setBounds(91, 132, 131, 27);
		BSTInsertframe.getContentPane().add(label_1);
		
		rnTF = new JTextField("", 9);
		rnTF.setFont(new Font("Calibri", Font.PLAIN, 18));
		rnTF.setBounds(234, 132, 210, 27);
		BSTInsertframe.getContentPane().add(rnTF);
		
		nameTF = new JTextField("", 9);
		nameTF.setFont(new Font("Calibri", Font.PLAIN, 18));
		nameTF.setBounds(234, 172, 210, 27);
		BSTInsertframe.getContentPane().add(nameTF);
		
		marksTF = new JTextField("", 9);
		marksTF.setFont(new Font("Calibri", Font.PLAIN, 18));
		marksTF.setBounds(234, 212, 210, 27);
		BSTInsertframe.getContentPane().add(marksTF);
		
		JLabel label_2 = new JLabel("Name: ");
		label_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		label_2.setBounds(89, 172, 105, 27);
		BSTInsertframe.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Marks: ");
		label_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		label_3.setBounds(89, 212, 105, 27);
		BSTInsertframe.getContentPane().add(label_3);
		
		JButton button = new JButton("Insert");
		
		button.setFont(new Font("Calibri", Font.PLAIN, 18));
		button.setBounds(51, 296, 105, 35);
		BSTInsertframe.getContentPane().add(button);
		
		JButton button_1 = new JButton("Search");
		
		button_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		button_1.setBounds(205, 296, 105, 35);
		BSTInsertframe.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Close");
		button_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		button_2.setBounds(322, 296, 93, 34);
		BSTInsertframe.getContentPane().add(button_2);
		
		JLabel lblStudent = new JLabel("STUDENT");
		lblStudent.setFont(new Font("Calibri", Font.BOLD, 20));
		lblStudent.setBounds(205, 36, 85, 35);
		BSTInsertframe.getContentPane().add(lblStudent);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				    int id=Integer.parseInt(rnTF.getText());
		 		     String nm= nameTF.getText();
		 		     int ag=Integer.parseInt(marksTF.getText());
		 		     tree.insert(id, nm, ag);
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BSTSearchGUI window = new BSTSearchGUI();
				window.BSTSearchframe.setVisible(true);
				BSTInsertframe.dispose();
			}
		});
	}
}
