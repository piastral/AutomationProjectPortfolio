package arraysInterviewCoding;

public class FindTheSecondAndThirdLargestArray {

	public static void main(String[] args) {
		
		int largestNumber =Integer.MIN_VALUE;
		int secondLargest =Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		int arr [] = { 1,5,2,7,3} ;
		
		for(  int no : arr ) {
			if(no>largestNumber) {
				
				thirdLargest=secondLargest;
				secondLargest=largestNumber;
				largestNumber=no;
				
			} else if (no >secondLargest && no !=largestNumber) {
				thirdLargest=secondLargest;
				secondLargest=no;
				
			}else if (no>thirdLargest && no !=secondLargest){
					
					thirdLargest=	no;
					
					}
			}
			
		
			
		
		
		System.out.println("Largest Number is " + largestNumber);
		System.out.println("Second largest Number is  " + secondLargest);
		System.out.println("ThirdLargest Number is " +thirdLargest);

		
		
	}

}
