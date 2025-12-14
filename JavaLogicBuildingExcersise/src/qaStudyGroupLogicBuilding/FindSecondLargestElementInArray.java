package qaStudyGroupLogicBuilding;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {
		// today we will solve two problems second largest  ,merging 
		//given an array 
		
		int arr [] = { 1,3,2,7,5};   // from here i need to find the largest and second largest 
		
		int largestNumber =Integer.MIN_VALUE;  //  
		int secondLargestNumber = Integer.MIN_VALUE; 
		int thirdLargestNumber =Integer.MIN_VALUE; // do it 
		
		for(int number  : arr ) {   // number --> 1 > -999
			if(number>largestNumber) {  // 7 > 3  //5 >7
				
				secondLargestNumber =largestNumber;
				largestNumber=number;   //largest Number  ==1, secondLargest =largestNumber
			} else if (number >secondLargestNumber && number!=largestNumber) {
			   secondLargestNumber=	number;
			} else {
				
			}
		}
		
		System.out.println("Largest Number is : " + largestNumber);
		System.out.println("Second Largest Number is : " + secondLargestNumber);

	}
	
	/* IST ITERATION NUMBER --> 1 LARGESTNumber --> -23232  num>largest true           largestNumber=   1 
	 * 2nd iteration 3 > 1  --> largest number --1 >  secondLargest 1 -->      largestNumber   3
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
