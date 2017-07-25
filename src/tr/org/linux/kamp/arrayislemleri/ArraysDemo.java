package tr.org.linux.kamp.arrayislemleri;

import java.util.Random;

public class ArraysDemo {

	private static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];

	public static void main(String[] args) {
		generateArray();
		printArray();
		int item = 5;
		
		if(lastIndexOfNotSorted(item)!=-1) {
			System.out.println("Aranan değer: " + lastIndexOfNotSorted(item)+".index'de bulunuyor!");		
		}
		else {
			System.out.println("Aranan eleman bulunamadı!");
		}
		sortArray();

		System.out.println("Sıralanmış dizi:");
		printArray();

		
		if (searchArray(item)) {
			System.out.println(item + " dizimizde bulundu!");
		} else {
			System.out.println(item + " dizimizde bulunamadı!");
		}
		
		
		if(lastIndexOf(item)!=-1) {
			System.out.println("Aranan değer: " + lastIndexOf(item)+".index'de bulunuyor!");		
		}
		else {
			System.out.println("Aranan eleman bulunamadı!");
		}
		
		
		

	
		

	}

	public static void generateArray() {
		int item;
		for (int i = 0; i < array.length; i++) {
			item = rand.nextInt(10);
			array[i] = item;
		}
	}

	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	public static void sortArray() {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	public static boolean searchArray(int item) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == item) {
				return true;
			}
		}
		return false;
	}
	
	
	private static int lastIndexOf(int item) {
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]==item) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	private static int lastIndexOfNotSorted(int item) {
		int lastIndex=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==item) {
				lastIndex=i;
			}
		}
		if(lastIndex==0) {
			return -1;
		}
		else {
			return lastIndex;
		}
	}

}
