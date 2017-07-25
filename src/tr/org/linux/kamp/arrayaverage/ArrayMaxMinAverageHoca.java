package tr.org.linux.kamp.arrayaverage;

import java.util.Arrays;
import java.util.Random;

public class ArrayMaxMinAverageHoca {

	private static int[] array = new int[100];
	private static Random rand = new Random();

	public static void main(String[] args) {
		
		
		
		generateArray();
		System.out.println(Arrays.toString(array));// diziyi döngü kullanmadan bastırmak için kullandığımız fonksiyon
		
		
		
	}

	public static void generateArray() {

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 1;
		}
	}
}
