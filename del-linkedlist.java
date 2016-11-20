// delete a linked list at a particular location 

class LinkedList 
{ 
		Node head; //haed of list 

		/*linked list node */ 
		class Node 
		{ 
			int data; 
			Node next; 
			Node(int d) 
			{ 
				data = d;
				next = null; 
			}
		}
/* inserts a new node at front od the list */ 
public void push(int new_data)
{ 
	/* 1 & 2: allocate the node and put it in data */ 
	Node new_node = new Node(new_data); 

	/*3 make next of new node as head */ 
	new_node.next = head; 

	/*4 move the head to point to new node */ 
	head = new_node; 
  }
    void deleteNode(int position)
   { 
     // if linked list is empty 
     if(head == null)
       return; 

       // store the head node 
       Node temp = head; 

       // if head needs to be removed
       if(position == 0)
       { 
       		head = temp.next; 
       		return; 

       }

       // find previous node of the node to be deleted 
       for (int i=0; temp!=null && i<position-1;i++)
       		temp = temp.next; 

       // if position is more than number of ndoes
       if (temp == null || temp.next == null)
        return; 


        Node next = temp.next.next; 

        temp.next = next; 
    }  

    public void printList() 
    { 
     Node tnode = head; 
     while (tnode != null) 
     { 
     	System.out.println(tnode.data+" "); 
     	tnode = tnode.next; 

     }
   } 

   /* driver program to test above functions. Ideally ths function should be kept in a separate class. Kept here to heep code compact */ 
  
  public static void main(String  args) 
{ 
  /* start with an empty list  */ 
  LinkedList llist = new LinkedList(); 

  llist.push(7);
  llist.push(1); 
  llist.push(3); 
  llist.push(2); 
  llist.push(8); 

  System.out.println("\n created linked list is: ");
  llist.printList(); 
   
   llist.deleteNode(4); //delete node at positon 4 

   System.out.println("\n linkd list after deletion at position 4"); 
   llist.printList(); 
  } 
 } 

 








