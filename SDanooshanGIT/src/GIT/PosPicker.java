package GIT;

public class PosPicker {
	private static int choice;
	
	public static int Picker(int answer, String[] board ){
		choice = 42;
		if (answer == 0){
			if (board[5].equals("  ")){
				choice = 5;
				return choice;
			}
			else if (board[4].equals("  ")){
				choice = 4;
				return choice;
			}
			else if (board[3].equals("  ")){
				choice = 3;
				return choice;
			}
			else if (board[2].equals("  ")){
				choice = 2;
				return choice;
			}
			else if (board[1].equals("  ")){
				choice = 1;
				return choice;
			}
			else if (board[0].equals("  ")){
				choice = 0;
				return choice;
			} else {
				choice = 42;
				return 42;
			}
		}
		if (answer == 1){
			if (board[11].equals("  ")){
				choice = 11;
				return choice;
			}
			else if (board[10].equals("  ")){
				choice = 10;
				return choice;
			}
			else if (board[9].equals("  ")){
				choice = 9;
				return choice;
			}
			else if (board[8].equals("  ")){
				choice = 8;
				return choice;
			}
			else if (board[7].equals("  ")){
				choice = 7;
				return choice;
			}
			else if (board[6].equals("  ")){
				choice = 6;
				return choice;
			} else {
				choice = 42;
				return choice;
			}
		}
		if (answer == 2){
			if (board[17].equals("  ")){
				choice = 17;
				return choice;
			}
			else if (board[16].equals("  ")){
				choice = 16;
				return choice;
			}
			else if (board[15].equals("  ")){
				choice = 15;
				return choice;
			}
			else if (board[14].equals("  ")){
				choice = 14;
				return choice;
			}
			else if (board[13].equals("  ")){
				choice = 13;
				return choice;
			}
			else if (board[12].equals("  ")){
				choice = 12;
				return choice;
			} else {
				choice = 42;
				return choice;
			}
		}
		if (answer == 3){
			if (board[23].equals("  ")){
				choice = 23;
				return choice;
			}
			else if (board[22].equals("  ")){
				choice = 22;
				return choice;
			}
			else if (board[21].equals("  ")){
				choice = 21;
				return choice;
			}
			else if (board[20].equals("  ")){
				choice = 20;
				return choice;
			}
			else if (board[19].equals("  ")){
				choice = 19;
				return choice;
			}
			else if (board[18].equals("  ")){
				choice = 18;
				return choice;
			} else {
				choice = 42;
				return choice;
			}
		}
		if (answer == 4){
			if (board[29].equals("  ")){
				choice = 29;
				return choice;
			}
			else if (board[28].equals("  ")){
				choice = 28;
				return choice;
			}
			else if (board[27].equals("  ")){
				choice = 27;
				return choice;
			}
			else if (board[26].equals("  ")){
				choice = 26;
				return choice;
			}
			else if (board[25].equals("  ")){
				choice = 25;
				return choice;
			}
			else if (board[24].equals("  ")){
				choice = 24;
				return choice;
			} else {
				choice = 42;
				return choice;
			}
		}
		if (answer == 5){
			if (board[35].equals("  ")){
				choice = 35;
				return choice;
			}
			else if (board[34].equals("  ")){
				choice = 34;
				return choice;
			}
			else if (board[33].equals("  ")){
				choice = 33;
				return choice;
			}
			else if (board[32].equals("  ")){
				choice = 32;
				return choice;
			}
			else if (board[31].equals("  ")){
				choice = 1;
				return choice;
			}
			else if (board[30].equals("  ")){
				choice = 30;
				return choice;
			} else {
				choice = 42;
				return choice;
			}
		}
		if (answer == 6){
			if (board[41].equals("  ")){
				choice = 41;
				return choice;
			}
			else if (board[40].equals("  ")){
				choice = 40;
				return choice;
			}
			else if (board[39].equals("  ")){
				choice = 39;
				return choice;
			}
			else if (board[38].equals("  ")){
				choice = 38;
				return choice;
			}
			else if (board[37].equals("  ")){
				choice = 36;
				return choice;
			}
			else if (board[35].equals("  ")){
				choice = 35;
				return choice;
			} else {
				choice = 42;
				return choice;
			}
		}
		return choice;
	}
}
		
	


