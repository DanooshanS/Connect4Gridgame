package GIT;
import java.util.*;

public class Cn4Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to Connect 4!");
		System.out.println("Rules are as followed:");
		int[] column = new int[7];
		String[] board = new String[6];
		int player = 0;
		for (int i = 0; i <= 6; i++){
			column[i] = i;
		}
		for (int i = 0; i <= 41; i++){
			board[i] = "  ";
		}
		
		boolean gameOver = false;
		
		System.out.println(board[0]+ "|" + board[6] + "|" + board[12]+ "|" + board[18]+  "|" + board[24]+  "|" + board[30]+  "|" + board[36]);
		System.out.println("--------------------");
		System.out.println(board[1]+ "|" + board[7] + "|" + board[13]+ "|" + board[19]+  "|" + board[25]+  "|" + board[31]+  "|" + board[37]);
		System.out.println("--------------------");
		System.out.println(board[2]+ "|" + board[8] + "|" + board[14]+ "|" + board[20]+  "|" + board[26]+  "|" + board[32]+  "|" + board[38]);
		System.out.println("--------------------");
		System.out.println(board[3]+ "|" + board[9] + "|" + board[15]+ "|" + board[21]+  "|" + board[27]+  "|" + board[33]+  "|" + board[39]);
		System.out.println("--------------------");
		System.out.println(board[4]+ "|" + board[10] + "|" + board[16]+ "|" + board[22]+  "|" + board[28]+  "|" + board[34]+  "|" + board[40]);
		System.out.println("--------------------");
		System.out.println(board[5]+ "|" + board[11] + "|" + board[17]+ "|" + board[23]+  "|" + board[29]+  "|" + board[35]+  "|" + board[41]);
		System.out.println("Which column would you like to place a piece?");
		int answer =  in.nextInt();
		if (player == 0){ 
			
			
			
		}
		while (gameOver == false){
			
			
		}
	}

}
