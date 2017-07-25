package tr.org.linux.kamp.arrays;

public class CarpimTaplosu {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int[][] carpimTablosu = new int[9][9];
	 * 
	 * for (int i = 0; i < carpimTablosu.length; i++) { for (int j = 0; j <
	 * carpimTablosu[i].length; j++) { carpimTablosu[i][j] = (i + 1) * (j + 1); } }
	 * 
	 * for (int i = 0; i < carpimTablosu.length; i++) { for (int j = 0; j <
	 * carpimTablosu[i].length; j++) { System.out.print(carpimTablosu[i][j] + "\t");
	 * } System.out.println(); }
	 * 
	 * }
	 */

	public static int[][] initialize(int n) {
		int[][] matrices = new int[n][n];

		for (int j = 0; j < matrices.length; j++) {

			for (int k = 0; k < matrices[j].length; k++) {
				matrices[j][k] = (j + 1) * (k + 1);

			}
		}
		return matrices;

	}

	public static void arrayToPointer(int[][] dizi) {

		for (int j = 0; j < dizi.length; j++) {

			for (int k = 0; k < dizi[j].length; k++) {
				System.out.print(dizi[j][k] + "\t");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		arrayToPointer(initialize(15));
	}

}
