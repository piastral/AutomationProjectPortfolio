package arraysInterviewCoding;

public class LinearSearching {

	public static void main(String[] args) {
		boolean found = false;
		int nums[] = { 10, 500, 30, 5, 40 };
		int key = 10;

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == key) {
				System.out.println("The key is :- " + key + " And  the index of the key is :-" + i);
				found = true;
				break;
			}

		}
		if(!found) {
			System.out.println("Key not found");
		}
	}

}
