

class HashTable{
	    public int hash(int id){ return id%20;}
	
        private HNode[] head=new HNode[20];
        
	    public  HashTable(){for(int i=0;i<20;i++)head[i]=null;}

		public  void insert(int k, String nm, int a)
	        {      HNode temp =new HNode(k,nm,a);
	               int index=hash(k);
	               temp.next=head[index];
			       head[index]=temp;}


		public  HNode search(int k)
	        {     
			int index=hash(k);
			HNode temp=head[index];	 
			boolean found=false;
			while(temp!=null&&found==false) {
				   if (temp.rollnumber==k){found=true; break;}
	               temp=temp.next;
	        }
            return temp;}


   }


   