
class HNode 
{
	int rollnumber;
	String  name;
    int marks;
	HNode next;

	HNode(int rn, String nm, int m)
	{ 
		rollnumber = rn;
	    name = nm;
        marks=m;
		next = null;  
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