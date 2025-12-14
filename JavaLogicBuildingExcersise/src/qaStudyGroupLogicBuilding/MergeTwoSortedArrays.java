package qaStudyGroupLogicBuilding;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		/*  if your array is not sorted sort it first  
		 * a1 ==> [1,2,4] a2=>[3,5]  a1+a2 --> a3[1,2,3,4,5]
		 * 
		 * int [] a3 = new Int(a1.length + a2.length) -->3 +2 ==5
		 * 
		 * two pointers technique 
		 * a1[0]  ->1 p1=0 p1<a1.length 0<3  p2 =0 ;p2<a2.length true
		 * 
		 *  1-mountain array ,rotate array in k step ,rotate array  on the left , jagged arrays ,monotonic array
		 *  2-reverse linked list 3- character frequency hashmap 4- character frequency without hashmap 
		 *  4-reverse map ...two pointer technique in string ....solve
		 * 5- 
		 * 
		 */
		
		int [] a1 = {1,2 ,4};   //1,2 3<3  a1 length --> 3
		int [] a2 = {3,5 };   //0,1
		
		int [] a3 = new int[a1.length + a2.length];   // 3+ 2 //[ 1  ,2 ,   3  ,4                ]
		
		int p1=0; int p2=0 ;int p3 =0; // p1 ==> 1 p2==> 0;p3 ==>1
		
		while(p1<a1.length && p2<a2.length) {  //2nd iteration p1--> 1st index --> 2  p2 , 3 --> 2<3 false && true --> false 
			if(a1[p1] < a2[p2]) { 
				a3[p3] = a1[p1] ;  // a3[1,2,3 ,4, 5]
				p1++;
				p3++;                          //p3 0 index[1 ,
			} else {
				a3[p3]=a2[p2];
				p2++;
				p3++;
			}
			
		}
		
		while(p1 <a1.length) {
			a3[p3] =a1[p1] ;
			p1++;
			p3++;
		}
		
		while( p2 <a2.length) {
			a3[p3] =a2[p2] ;  // 5
			p2++;
			p3++;
		}
		
		
		
		for( int number :   a3 ) {
			System.out.print(number + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
