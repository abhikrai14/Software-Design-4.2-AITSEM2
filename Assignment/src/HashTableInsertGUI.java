
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*; //This is new

class HashTableInsertGUI extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("STUDENT");
	private JLabel l1 = new JLabel("Roll Number: ");
	private JLabel l2 = new JLabel("Name: ");
	private JLabel l3 = new JLabel("Marks: ");
	private JTextField t1=new JTextField("",9);
	private JTextField t2=new JTextField("",9);
	private JTextField t3=new JTextField("",9);

	private JButton b1=new JButton("Insert");
	private JButton b2=new JButton("Search");
	private JButton b3=new JButton("Close");
	private HashTable tree=new HashTable();//This is new
	private int current=0; //This is new

//CONSTRUCTOR
	public HashTableInsertGUI(){
		//super(s);
		getContentPane().setFont(new Font("Calibri", Font.PLAIN, 18));
		tree.insert(1,"J.Smith",22);
		tree.insert(2,"T.Black",24);
		tree.insert(3,"M.Gray",24);
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		l0.setBounds(222, 45, 110, 27);
		l0.setFont(new Font("Calibri", Font.BOLD, 20));
		getContentPane().setLayout(null);
		content.add(l0);b3.setFont(new Font("Calibri", Font.PLAIN, 18));
		b3.setBounds(380, 281, 92, 33);
		content.add(b3);
		b1.setFont(new Font("Calibri", Font.PLAIN, 18));
		b1.setBounds(94, 280, 105, 34);
		getContentPane().add(b1);
		b2.setFont(new Font("Calibri", Font.PLAIN, 18));
		b2.setBounds(234, 280, 105, 34);
		getContentPane().add(b2);
		l3.setFont(new Font("Calibri", Font.PLAIN, 18));
		l3.setBounds(94, 196, 105, 27);
		getContentPane().add(l3);
		l2.setFont(new Font("Calibri", Font.PLAIN, 18));
		l2.setBounds(94, 156, 105, 27);
		getContentPane().add(l2);
		l1.setBounds(94, 116, 120, 27);
		getContentPane().add(l1);
		l1.setFont(new Font("Calibri", Font.BOLD, 18));
		t3.setFont(new Font("Calibri", Font.PLAIN, 18));
		t3.setBounds(222, 197, 210, 27);
		getContentPane().add(t3);
		t2.setFont(new Font("Calibri", Font.PLAIN, 18));
		t2.setBounds(222, 156, 210, 27);
		getContentPane().add(t2);
		t1.setFont(new Font("Calibri", Font.PLAIN, 18));
		t1.setBounds(222, 116, 210, 27);
		getContentPane().add(t1);
		b2.addActionListener(this);
		b1.addActionListener(this);b3.addActionListener(this);
		   //Horiz , Vert
		setSize(550,401);    setVisible(true);}



	public void actionPerformed(ActionEvent e){

	  	Object target=e.getSource();
	 	if (target==b1)
	 		{    int id=Integer.parseInt(t1.getText());
	 		     String nm= t2.getText();
	 		     int ag=Integer.parseInt(t3.getText());
	 		     tree.insert(id, nm, ag);
	         }

	     if (target==b2)
	     	{
	    	 int id=Integer.parseInt(t1.getText());
	    	 HNode temp=tree.search(id);
	    	 if (temp==null){  t2.setText("Unknown");
	    	                   t3.setText("");}
	    	 else       { t1.setText(""+temp.readRollnumber());
	    	              t2.setText(""+temp.readName());
	    	              t3.setText(""+temp.readMarks());
	    	            }
	     	}
	     if (target==b3)
	     	{
	    	 this.setVisible(false);
	     	}
	     
	     
          }
}

