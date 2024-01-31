import java.util.Arrays;

public class meetday1 {

	public static void main(String[] args) {
//		int abcde[] = {10 ,20 ,30 };
//		
//		System.out.println(Arrays.toString(abcde));
//	
	//	Now Multidimensional array
		//System.out.println(Arrays.deepToString(abc));// we use this to print multidimensional array
//		int abc[][] = {{1},//first element
//					{4,5},
//					{7,8,9}};
//		
//		System.out.println("Lenght of first element inside an array :"+abc[0].length+
//				" "+"Lenght of second element inside an array"+abc[1].length+" "+
//				"Lenght of 3rd element inside an array"+abc[2].length); // to find lenght of an array
       
		// now copying from one array to another array
//		int a[]= {1,2,3};
//		int b[]= a.clone();
//		System.out.println("Normal Array = "+Arrays.toString(a));
//		System.out.println("Copied Array = "+Arrays.toString(b));
		
		//now to sort the array
//		int yassir[] = {8,1,3,9,2,5};
//		Arrays.sort(yassir);
//		System.out.println(Arrays.toString(yassir));
		
	//	now we will try to fill each index in an array
		//another way of defining an array 
//		int moenjhat[] = new int[3];// 3 refers to number of indexs in an array
//		System.out.println(Arrays.toString(moenjhat));// you can see that our array is empty
//	   we will try to fill it now
//		Arrays.fill(moenjhat, 3);
//		moenjhat[0] = 69;
//		moenjhat[1] = 99;
//		moenjhat[2] = 18;
//		System.out.println(Arrays.toString(moenjhat));
		
	//	we will use for loop for filling array
//		int moenjhat[] = new int[5];
//		Arrays.fill(moenjhat, 3);
//		for(int i = 0; i < moenjhat.length ; i++) {
//			moenjhat[i] = i+1;
//		}
//		System.out.println("The penis size of moen is ="+Arrays.toString(moenjhat));
		
//		now let us come to binary search , what BS does is 
//		it provides us the location of particular element
		
//		int[] iceburst = { 1 ,2 ,3,4,5,6,7,18};
//		int small = Arrays.binarySearch(iceburst, 2);
//		// we assign an variable that stores the address of particular element
//		System.out.println(small);
//		int king = Arrays.binarySearch(iceburst, 18);
//		System.out.println(king);
//		// arrays are stored in order of 0,1,2,3,4
		
//		String moen[] = {"smoke","gandu","gay"};
//		// to fing the length of particular element
//		
//		System.out.println(moen[0].length());
//		System.out.println(moen[1].length());
//		System.out.println(Arrays.toString(moen));
		
		int n=3;
		int k=5;
		for(int i=1; i<=n ; i++) {
			for(int j=i+2;j<=k;j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}
	
}
