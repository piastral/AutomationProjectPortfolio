package arraysInterviewCoding;

public class LargestElementInArray {
	public static void main(String[] args) {

		int largestElement = Integer.MIN_VALUE;
		int arr[] = { 35, 5, 10, 15, 20, 25, 65 };
		  

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] >= largestElement) {
				largestElement = arr[i];
				}
		
	
}
		
	}
}
