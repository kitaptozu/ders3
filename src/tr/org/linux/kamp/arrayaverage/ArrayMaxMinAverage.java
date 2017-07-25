package tr.org.linux.kamp.arrayaverage;

import java.util.Random;

public class ArrayMaxMinAverage {

	private static Random rand = new Random();

	public static void main(String[] args) {
		int[] array = new int[100];
		array = generateArray(array);

		printArray(array);

		System.out.println("Max number: " + max(array));
		System.out.println("Min number: " + min(array));
		System.out.println("Average of numbers: " + average(array));

	}

	public static int[] generateArray(int[] dizi) {

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rand.nextInt(100) + 1;
		}

		return dizi;
	}

	public static void printArray(int[] dizi) {

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + "\t");
		}
		System.out.println();
	}

	public static int max(int[] dizi) {
		int max = 0;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] > max) {
				max = dizi[i];
			}
		}
		return max;
	}

	public static int min(int[] dizi) {
		int min = dizi[0];

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] < min) {
				min = dizi[i];
			}
		}
		return min;
	}

	public static int average(int[] dizi) {
		int average, toplam = 0;
		int max = max(dizi);
		int min = min(dizi);
		int genel = dizi.length;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] != max && dizi[i] != min) {
				toplam += dizi[i];
			} else {
				genel--;
			}
		}
		average = toplam / genel;
		return average;
	}

}
