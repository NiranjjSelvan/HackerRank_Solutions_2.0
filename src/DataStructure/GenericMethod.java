package DataStructure;

class Printer {
	// Generic method to print elements of an array
	public <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		Printer printer = new Printer();

		// Print the elements of the integer array
		printer.printArray(intArray);

		// Print the elements of the string array
		printer.printArray(stringArray);
	}
}
