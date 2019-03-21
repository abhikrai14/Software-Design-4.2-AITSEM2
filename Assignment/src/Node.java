
class Node {
	
	int rollnumber;
	String  name;
    int marks;
	Node left;
	Node right;
	
	Node(int rn, String nm, int m, Node ll, Node rr)
	{ 
		rollnumber = rn;
		name = nm;
        marks=m;
		left = ll; right = rr; 
	}
	
	public int readRollnumber()
	{
		return rollnumber;
	}
	
	public String readName()
	{
		return name;
	}
	
	public int readMarks()
	{
		return marks;
	}
}