// User defined Pair class
class Pair {
	int x;
	int y;

	// Constructor
public Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Matrix_Sum {
    	static void compare(Pair arr[], int n)
	{
		// Comparator to sort the pair according to second element
		Arrays.sort(arr, new Comparator<Pair>() {
			@Override public int compare(Pair p1, Pair p2)
			{
				return p1.y - p2.y; // To compare the first element just
									//change the variable from p1.y - p2.y to x.
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i].x + " ");
		}
		System.out.println();
	}
    
    public int[] kWeakestRows(int[][] mat, int k) {
        
        // creating a list for storing the pair
        // ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
        Pair list[] = new Pair[mat.length];
        
        //traversing through the array
        for(int i=0;i<mat.length;i++)
        {
            int sum = 0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum += mat[i][j];
            }
            
            list[i] = new Pair(i,sum);
        }
        
        compare(list,mat.length);
        
        int ans[] = new int[k];
        
        for(int i=0;i<mat.length;i++)
        {
            if(i>=k)
            break;
            ans[i] = list[i].x;
        }
        
        return ans;
    }
}

