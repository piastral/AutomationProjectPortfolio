package arraysInterviewCoding;


public class ReversingAnArray {
	// reverse the array but keeping the original array as same no change 
	public static void main(String[] args) {
		int nums[] = { 10, 500, 30, 5, 40 };
		
		System.out.println("The original array before reversing :: >");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
		
		
		//using two pointers approach lets solve the problem 
		
		//first take left for 0 ;take right for length-1
		int left  = 0; int right =nums.length-1;
		while(left<right) {
			int temp = nums[left];
			nums[left]  = nums[right];
			nums[right] =temp;
			
			left ++;
			right --;
			
			
			
		}
		
		System.out.println();
		System.out.println("The reverse array is : =>");
		for(int num :nums) {
			System.out.print( num + " ");
		}
		
      
         
          
  

	}

}
