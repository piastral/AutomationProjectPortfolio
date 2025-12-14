package arraysInterviewCoding;

public class MoveAllZerosToEndInArray {
	public static void main(String[] args) {
		int arr [] = {1,0, 2, 0,3,0};
		// move all the 0s to the end and non zzero on the right 
	int i =0;
		
		for(int j = 0; j<=arr.length-1 ;j++) {
			
				if(arr[j] !=0) {
					int temp =arr[i] ;
					 arr[i] =arr[j];
					 arr[j] =temp;
					 i++;
					  
							
				
			}
			
		}
		for(int arr1 : arr)
		{
			System.out.print(arr1 + " " );
		}
		 
	}

}
