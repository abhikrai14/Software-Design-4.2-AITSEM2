
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BSInsertGUI extends JFrame implements ActionListener{
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
	private BSTree tree=new BSTree();//This is new
	private int current=0; //This is new

//CONSTRUCTOR
	public BSInsertGUI(){
		//super(s);
		getContentPane().setFont(new Font("Calibri", Font.PLAIN, 18));
		tree.insert(1,"J.Smith",22);
		tree.insert(2,"T.Black",24);
		tree.insert(3,"M.Gray",24);
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		l0.setBounds(203, 33, 105, 27);
		l0.setFont(new Font("Calibri", Font.BOLD, 20));
		getContentPane().setLayout(null);
		content.add(l0);b3.setFont(new Font("Calibri", Font.PLAIN, 18));
		b3.setBounds(307, 263, 93, 34);
		content.add(b3);
		b1.setFont(new Font("Calibri", Font.PLAIN, 18));
		b1.setBounds(36, 263, 105, 35);
		getContentPane().add(b1);
		b2.setFont(new Font("Calibri", Font.PLAIN, 18));
		b2.setBounds(190, 263, 105, 35);
		getContentPane().add(b2);
		l3.setFont(new Font("Calibri", Font.PLAIN, 18));
		l3.setBounds(74, 179, 105, 27);
		getContentPane().add(l3);
		l2.setFont(new Font("Calibri", Font.PLAIN, 18));
		l2.setBounds(74, 139, 105, 27);
		getContentPane().add(l2);
		l1.setBounds(76, 99, 131, 27);
		getContentPane().add(l1);
		l1.setFont(new Font("Calibri", Font.BOLD, 18));
		t3.setFont(new Font("Calibri", Font.PLAIN, 18));
		t3.setBounds(219, 179, 210, 27);
		getContentPane().add(t3);
		t2.setFont(new Font("Calibri", Font.PLAIN, 18));
		t2.setBounds(219, 139, 210, 27);
		getContentPane().add(t2);
		t1.setFont(new Font("Calibri", Font.PLAIN, 18));
		t1.setBounds(219, 99, 210, 27);
		getContentPane().add(t1);
		b2.addActionListener(this);
		b1.addActionListener(this);b3.addActionListener(this);
		   //Horiz , Vert
		setSize(526,368);    setVisible(true);}



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
//	    	 int id=Integer.parseInt(t1.getText());
//	    	 Node temp = tree.search(id);
//	    	 if (temp==null)
//	    	 {  
//	    		 t2.setText("Unknown");
//	    	     t3.setText("");
//	    	  }
//	    	 else
//	    	 {
//	    		 t1.setText(""+temp.readRollnumber());
//	    	     t2.setText(""+temp.readName());
//	             t3.setText(""+temp.readMarks());
//	    	 }
	    	 //BSTSearchGUI s = new BSTSearchGUI();
	    	 //this.dispose();
	     }
	     
	     if (target==b3)
	     {
	    	this.setVisible(false);
	     }
    }
}

