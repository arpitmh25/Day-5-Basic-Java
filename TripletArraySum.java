import java.util.Scanner;
class TripletArraySum {
static void findTriplet(int[] arr, int n)
	{
    	boolean number = true;
    	for (int i=0; i<n-2; i++)
    	{
        	for (int j=i+1; j<n-1; j++)
        	{
            	for (int k=j+1; k<n; k++)
            	{
                	if (arr[i]+arr[j]+arr[k] == 0)
                	{
                    	System.out.print(arr[i]);
                    	System.out.print(" ");
                    	System.out.print(arr[j]);
                    	System.out.print(" ");
                    	System.out.println(arr[k]);

	                    number = true;
	                }
	            }
	        }
	    }

    	if (number == false)
        	System.out.println("Does not exist ");

	}


	public static void main(String[] args){
    		int arr[] = {1, -1, 2, -2, 3, -3};
    		int n =arr.length;
    		findTriplet(arr, n);

	}
}