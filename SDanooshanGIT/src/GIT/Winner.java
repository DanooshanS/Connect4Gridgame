package GIT;

public class Winner {
	private static int count = 0;
	public static boolean determineVerticalY(String[] board){
			for (int i = 0; i <= 41; i++){
				if (board[i].equals(" R")){
					count = count + 1;
				
					if (board[i - 1].equals(" R")){
					count = count + 1;
					
						if (board[i - 2].equals(" R")){
							count = count + 1;
				
							if (board[i - 3].equals(" R")){
									count = count + 1;
							}
						}
					}
				} else {
					count = 0;
				}
				
							
			}
				
			
		if (count == 4){
			return true;
		}
		
		count = 0;
		return false;
	}
	public static boolean determineVerticalR(String[] board){
		for (int i = 0; i <= 41; i++){
			if (board[i].equals(" R")){
				count = count + 1;
			
				if (board[i - 1].equals(" R")){
				count = count + 1;
				
					if (board[i - 2].equals(" R")){
						count = count + 1;
			
						if (board[i - 3].equals(" R")){
								count = count + 1;
						}
					}
				}
			} else {
				count = 0;
			}
			
						
		}
				
			


		if (count == 4){
			return true;
		}
		count = 0;
		return false;
	}
	
}

