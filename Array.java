package data_structure_array;

public class Array {
	public static void main(String[] args) {
		
	
	int[] numbers = {1,2,34,5,6,7,8,9};
	System.out.println("Length of gthe array is: "+numbers.length);
	//static method access with the help of class. Static method is belong to the class itself.
	
	Array.printArray(numbers);
	
	String[] str = new String[5];
	
	str[0] = "Nanjunda";
	str[1] = "Charan";
	str[2] = "Likhith Gowda";
	str[3] = "Karana";
	str[4] = "Deekshith";
	
	Array.printArrayElement(str);
	
//	/2D array
	
	int[][] number= {
			
			{1,3,4,5,6},
			{23,56,789}
	};System.out.println("2D array: "+number[0][1]);
	
	
	

}
	static void printArray(int[] arr) {
		for (int item : arr) {
			System.out.println("Items in array :" +item);
		}
	}
		
// another method of for loop access by index
		
		static void printArrayElement(String[] str) {
			for (int i = 0; i<str.length;i++) {
				System.out.println("Elements in the array at index["+i+"]: " +str[i]);
			}
		}
		
	}
