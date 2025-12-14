package arraysInterviewCoding;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr [] = { 1,2,3,4,5,6} ;
		int sum=0 ; int missingNumber  =0;
		
		 for (int i =1 ;i <=6;i++) { // this is for original number
			sum=sum+i;
			 }
		 for( int array :arr)
		 {
			 missingNumber= array+missingNumber;
		 }
		 System.out.println(missingNumber);
		 System.out.println(sum);
		 System.out.println("The missing Number is ::" + (sum - missingNumber));

	}

}
