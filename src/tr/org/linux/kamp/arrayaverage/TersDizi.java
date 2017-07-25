package tr.org.linux.kamp.arrayaverage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TersDizi {

	private static Random rand = new Random();

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Lütfen dizilerin boyutunu tek rakam ile belirleyiniz!");
		int boyut=input.nextInt();
		
		
		
		int[] dizi = new int[boyut];
		generateArray(dizi);
		System.out.println(Arrays.toString(dizi));
		reverseArray(dizi);
		System.out.println(Arrays.toString(dizi));
		
		
		System.out.println();
		System.out.println();
		
		
		
		int[] dizi2 = new int[boyut];
		generateArray(dizi2);
		System.out.println(Arrays.toString(dizi2));
		
		for(int i=dizi2.length-1;i>=0;i--) {
			System.out.print(dizi2[i]+"  ");
		}
		
		input.close();
	}

	public static void generateArray(int[] dizi) {

		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = rand.nextInt(100) + 1;
		}

	}

	public static void reverseArray(int[] dizi) {
		int temp;

		for (int i = 0; i < dizi.length / 2; i++) {

			temp = dizi[i];
			dizi[i] = dizi[dizi.length - 1 - i];
			dizi[dizi.length - 1 - i] = temp;

		}

	}

}
