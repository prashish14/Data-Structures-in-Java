// reverse a linked list

void recursiveReverse(struct node** head_ref)
{ 
	strcut node* first; 
	struct node* rest; 

	/* empty list */ 
	if(*heaf_ref == NULL)
		return; 

	/* suppose first = {1,2,3}. rest = {2,3} */ 
	first = *head_ref; 
	rest = first ->next; 

	/* list has only one node */ 
	if (rest == NULL)
		return; 

	/* reverse the rest list and put the first element of the end */ 
	recursiveReverse(&rest); 
	first- > next->next = first; 

	/* tricky step -- see the diagram */ 
	first ->next = NULL; 

	/* fix the head pointer */ 
	*head_ref = rest; 
}