void buildSegTree(vector<int>& arr, int treeIndex,int lo,int hi)
{
	
	if(lo == hi) { //leaf node store value in node 
        tree[treeIndex] = arr[lo];
        return
	}

	int mid = lo + (hi - lo) / 2; // recurse seeper for children 
	buildSegTree(arr, 2 * treeIndex + 1, lo, mid); 
	buildSegTree(arr, 2 * treeIndex) + 2, mid + 1, hi); 


	//merge build results 
	tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2 * treeIndex + 2]);
	}

int querySegTree(int treeIndex, int lo, int i, int j)
{
	

	if (lo > j || hi<i) 
		return 0;

	if(i <= lo && j >= hi) 
		return tree[treeIndex]; 

	int mid = lo + (hi - lo) / 2; 

	if(i > mid) 
		return querySegTree(2 * treeIndex + 2, mid + 1,hi,i,j); 
	else if (j <= mid)
		return querySegTree(2 * treeIndex + 1,lo,mid,i,j); 

	int leftQuery = querySegTree(2 * treeIndex + 1,lo,mid,i,mid);
	int rightQuery = querySegTree(2 * treeIndex + 2,mid + 1,hi,mid +1,j); 


	//merg query results
	return merge(leftQuery, rightQuery); 

}   