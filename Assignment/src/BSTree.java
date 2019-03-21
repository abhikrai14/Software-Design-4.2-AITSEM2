

public class BSTree
{   private      Node head;
    private      Node tail;
	public
	BSTree()  { tail = new Node(0, null, 0, null, null);
			  head = new Node(-1, null, 0, null, tail);}

	void  insert(int k, String nm, int a)
		{
		    Node  p, x;
		    p = head; x = head.right;
		    while (x!=tail)
			{ 	p = x;
		  		x = (k < x.rollnumber) ? x.left : x.right;}
				x = new Node (k, nm,a, tail, tail);
				if (k < p.rollnumber) p.left = x;
	          		else           p.right = x;
					}


        Node   search(int k)
		{
		    Node   x= head.right;
                    tail.rollnumber=k;
                    boolean found=false;
					while (x!=tail && found==false)
						{ 	if (k==x.rollnumber) found=true;
		  					else if (k < x.rollnumber)     x= x.left ;
                                 else               x= x.right;
                        }
					if (x==tail)       return null;
	          		else               return   x;
				}
		}