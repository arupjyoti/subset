import java.io.IOException;
 import java.util.Scanner;
class Subset
{
   // returns the number of unordered pairs 
    static int printSubsets(int set[],int k)
    {
        int n = set.length;
        int i,j,c=0,z=0,s;
        int arr[] = new int[10000000];
	
        for (i = 0; i < (1<<n); i++)
	{
            for (j = 0; j < n; j++)
                {
                if ((i & (1 << j)) > 0)
             	 arr[c++] = set[j];		//  array arr[] contains the subset of the main array set[] which is then examined
		    				//  for number of unordered pairs.
       		 }
            
	if(c>=2)			// to count the number of unordered pairs , if the number of unordered pairs(f,s) , f!=s,
             for(int f=0;f<c-1;++f)	// such that |arr[s] - arr[f]|>=k
                {
                    for(s=f+1;s<c;++s)
                        {
                            if(Math.abs(arr[s]-arr[f])>=k)
                                z++;		// number of unordered pairs are stored in z
                 
                        }
                    }
                    
                      c=0;
                   //  Arrays.fill(arr,0);
        
        }
        
        return (z-1);			
    }
 
    // Driver code
    public static void main(String[] args) throws IOException
    {
      Scanner ob = new Scanner(System.in);
	int res[] = new int[1000000];
      int t = ob.nextInt(),i;
      for(i = 0;i<t;++i)
      {
          int n = ob.nextInt(),k=ob.nextInt();
          int set[] = new int[n];
          for(int j=0;j<n;++j)
          set[j] = ob.nextInt();
      	  res[i] = printSubsets(set,k);
    }
	    
	    
// Display  the number of unordered pairs for each test case
	for(int c= 0 ;c < i;++c)
	System.out.print(" "+res[c]);
}
}
