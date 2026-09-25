
public class TestApp {

	public static void main(String[] args) {
		
		System.out.println("bubbleSort    : ");
		int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};
		
		Sorting sort1 = new Sorting(nums);
		sort1.bubbleSort();
		sort1.printSortedData();
		//9 10 11 22 23 38 87 92
		
		System.out.println();
		System.out.println("selectionSort : ");
		int[] nums2 =  {25, 11, 45, 6, 87, 20, 78, 64};
		Sorting sort2 = new Sorting(nums2);
		sort2.selectionSort();
		sort2.printSortedData();
		//6 11 20 25 45 64 78 87
		
		System.out.println();
		System.out.println("insertionSort : ");
		int[] nums3 =   {68, 10, 87, 75, 14, 36, 98, 76};
		Sorting sort3 = new Sorting(nums3);
		sort3.insertionSort();
		sort3.printSortedData();
		//10 14 36 68 75 76 87 98
		
		System.out.println();
		System.out.println("quicksort     :  ");
		int[] nums4 = {87, 11, 26, 35, 49, 85, 21, 46};
		Sorting sort4 = new Sorting(nums4);
		sort4.quicksort();
		sort4.printSortedData();
		//11 21 26 35 46 49 85 87

	}

}
