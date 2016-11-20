class LinkedList
{ 

	Node head; 

	class Node
	{ 
		int data; 
		Node next;
		Node(int d) { data =d; next = null; }

	}
  public void push(int new_data)
  { 
  	Node new_node = new Node(new_data); 
  	/* 3. make next of your new node as head */ 
  	new_node.next = head; 

  	/* 4. Move the head to point to new Node */ 
  	head = new_node; 


  }
 /* Inserts a new node after the given prev_node */ 
 public void insertAfter(Node prev_node,int new_data) 
 { 
 	/* 1 check if the given node is null */ 
 	if (prev_node == null)
 	{ 
 		System.out.println("the given previous node cant be null"); 
 		return; 
 	}

 	/* 2 & 3 allocate the node and put in the data */ 
 	Node new_node = new Node(new_data); 

 	/* 4. Make next of new node as next of prev_node */ 
 	new_node.next = new_node; 
 }



 /* append the node at the end.this method is defined inside LinkedList class shown above */ 
 public void append(int new_data) 
{ 
	/* allocate the node and put it in data and set next as null */ 
	Node new_node = new Node(new_data); 

/* 4 if linked list is empty then make new node as head */
if(head == null)
{ 
head = new Node(new_data); 
return; 
}
/* 4. the new node is going to be last node so make next of it as null */ 
new_node.next = null; 

/* 5. Else traverse till the last node */ 
Node last = head; 
while (last.next != null)
	last = last.next; 

/* 6. change the next of last node */ 
last.next = new_node; 
return; 
} 
/* this function prints contents of linked list storing from given node */ 
public void printlist() 
{ 
	Node tnode = head; 
	while (tnode != null)
    {  
        System.out.println(tnode.data+" "); 
        tnode = tndoe.next; 
    }
} 

/* driver program to test above functions.this function should be in separate usar class */ 
public static void main(String[] args)
{ 
	/* start with the empty list */ 
	LinkedList llist = new LinkedList(); 

	//Insert 6, so linked list becomes 6 -> null list
	llist.append(6)

	//Insert 7 at the beginning. So linked list becomes  
	llist.push(7);

	llist.push(1); 
	llist.append(4); 
	llist.insertAfter(llist.head.next, 8); 

	System.out.println("\n cre")




}








}









}