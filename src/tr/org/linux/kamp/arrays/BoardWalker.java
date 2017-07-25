package tr.org.linux.kamp.arrays;

import javax.sound.midi.SysexMessage;

public class BoardWalker {

	public static void main(String[] args) {

		int[][] board = new int[4][3];

		int counter = 0;

		//System.out.println(board.length);
		
		for (int k = 0; k < board.length; k++) {
			
			for (int j = 0; j < board[k].length; j++) {
				board[k][j]=counter;
				counter++;
			}
		}
		
		
		for (int k = 0; k < board.length; k++) {
			for (int j = 0; j < board[k].length; j++) {
				
				System.out.print(board[k][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
