public class PrintDifferentArrays {

	public static void main(String[] args) {
		System.out.println("Welcome to Printing Arrays using Generics");
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleAray = { 1.2, 2.2, 3.2, 4.2, 5.2 };
		Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		PrintArray(intArray);
		PrintArray(doubleAray);
		PrintArray(charArray);
	}

	public static void PrintArray(Integer[] a) {
	System.out.println(a);
	}

	public static void PrintArray(Double[] d) {
	System.out.println(d);
	}

	public static void PrintArray(Character[] c) {
	System.out.println(c);
	}
		
}
