package assignment.array;

public class MaxandMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int[] arr= {-2,14,1,10,9};
		int max=arr[0];
		int min=arr[0];
		
		for(int a:arr)
			
		{
			if(a<min)
		
				
		min=a;
			if(a>max)
		max=a;
	}
		System.out.println("Maximum elements in array : "+max);
		System.out.println("Minimum elements in array : "+min);


}
}
